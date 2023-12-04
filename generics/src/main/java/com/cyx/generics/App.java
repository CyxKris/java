package com.cyx.generics;

public class App 
{
    public static void main( String[] args )
    {
        GenericClass<String, Integer, Double> genericClass = new GenericClass<>("Cyx is a person.", 20, 3.14);
        genericClass.displayData();
    }
}
