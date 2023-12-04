package com.cyx.generics;

public class GenericClass<T, K, Q> {


    T data;
    K data2;
    Q data3;

    public GenericClass(T data, K data2, Q data3) {
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
    }

    void displayData() {
        System.out.println("Your first data is: " + data);
        System.out.println("\nYour second data is: " + data2);
        System.out.println("\nYour third data is: " + data3);
    }


}
