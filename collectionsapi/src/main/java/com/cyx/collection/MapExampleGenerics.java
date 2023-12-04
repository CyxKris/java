package com.cyx.collection;

import java.util.*;

public class MapExampleGenerics {


    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Oasis");
        map.put(2, "End");
        map.put(3, "OverWorld");

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println("\nKEY: " + m.getKey() + ";\tVALUE: " + m.getValue());
        }
    }

    /* **************ASSIGNMENT******************
     * create a gui map application that will store its data as Integer key and Object of a class value
     * 
     * DETAILS:
     * get the values from the user's input
     * the data gotten should be put in a class
     * the object of that class should be the value for the map collection
     * 
     * NOTES:
     * the map generic could be <Integer, Employee> with Employee being the class it would be taking.
     */

}
