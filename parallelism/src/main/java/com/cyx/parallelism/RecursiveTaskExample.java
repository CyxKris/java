package com.cyx.parallelism;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class RecursiveTaskExample {

    static class SumTask extends RecursiveTask<Integer> {

        private static final int THRESHOLD = 1000;
        private int[] array;
        private int start;
        private int end;

        public SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if (end - start <= THRESHOLD) {
                return computeSequentially();
            } else {
                int mid = (start + end) / 2;

                SumTask leftTask = new SumTask(array, start, mid);
                SumTask rightTask = new SumTask(array, mid, end);

                leftTask.fork();
    
                int rightResult = rightTask.compute();
                int leftResult = leftTask.join();

                return leftResult + rightResult;
            }
        }

        private Integer computeSequentially() {
            int sum = 0;

            for (int i = start; i < end; i++) {
                sum += array[i];
            }

            return sum;
        }

    }

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        SumTask sumTask = new SumTask(array, 0, array.length);

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        int sum = forkJoinPool.invoke(sumTask);

        System.out.println("Sum: " + sum);

        forkJoinPool.close();

    }
}
