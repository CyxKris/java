package com.cyx.parallelism;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class RecursiveActionExample {

    static class SumTask extends RecursiveAction {

        private static final int THRESHOLD = 1000;
        private int[] array;
        private int start;
        private int end;
        private int result;

        public SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            if (end - start <= THRESHOLD) {
                result = computeSequentially();
            } else {
                int mid = (start + end) / 2;

                SumTask leftTask = new SumTask(array, start, mid);
                SumTask rightTask = new SumTask(array, mid, end);

                leftTask.fork();
                rightTask.compute();
                leftTask.join();

                result = leftTask.result + rightTask.result;
    
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

        // int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] array = new int[2000];
        System.out.println(array.length);
        
        for (int j = 0; j < array.length; j++) {
            array[j] = j + 1;
        }

        SumTask sumTask = new SumTask(array, 0, array.length);

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(sumTask);

        int sum = sumTask.result;

        System.out.println("Sum: " + sum);

        forkJoinPool.close();

    }

}
