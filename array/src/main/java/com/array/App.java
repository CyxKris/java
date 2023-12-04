package com.array;

public class App 
{
    public static void main( String[] args )
    {
        int[] numbers = new int[3];
        // String products[] = new String[3];
//        String products[];
        String[] products;
        products = new String[5];

//        int newNumbers[][] = new int[2][3];
        int[][] newNumbers = new int[2][3];

        numbers[0] = 20;
        numbers[1] = 30;
        numbers[2] = 40;

        products[0] = "Smart Phone";
        products[1] = "Laptop";
        products[2] = "Portable Console";
        products[3] = "Docking Station";
        products[4] = "Monitor";

        newNumbers[0][0] = 5;
        newNumbers[0][1] = 10;
        newNumbers[0][2] = 15;
        newNumbers[1][0] = 20;
        newNumbers[1][1] = 25;
        newNumbers[1][2] = 30;

        System.out.println("----------------NUMBERS----------------");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("\n----------------PRODUCTS----------------");
        for (String product : products) {
            System.out.println(product);
        }

        System.out.println("\n----------------NEW NUMBERS----------------");
        for (int[] number : newNumbers) {
            System.out.print("{ ");
            for (int i : number) {
                System.out.print(i + ", ");
            }
            System.out.println("}");
        }

//        for (int i = 0; i < newNumbers.length; i++) {
//            System.out.print("{ ");
//            for (int j = 0; j < newNumbers[i].length; j++) {
//                System.out.print(newNumbers[i][j] + ", ");
//            }
//            System.out.println("}");
//        }
    }
}
