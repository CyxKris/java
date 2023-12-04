package com.cyx.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        /*
         * NOT RELEVANT
         * 
         * ArrayList<T> arrayList = new ArrayList<>();
         * ArrayList arrayList = new ArrayList();
         * 
         * List list = new ArrayList();
         */

        List<String> list = new ArrayList<String>();
        // ?Allows storage of duplicate values.

        // *If the List was an Integer
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // *To remove an item from the list
        // list.remove(1);
        // list.remove(1);

        list.add("One - Uno");
        list.add("Two - Dos");
        list.add("Three - Tres");
        list.add("Four - Cuatro");
        list.add("Five - Cinco");
        list.add("Pen - Bolígrafo");
        list.add("Five - Cinco");
        list.add("Boy - Niño");

        // *If the list was a Float
        // list.add(3.14);
        // list.add(21.24);
        // list.add(1.865);
    
        // int[] lists = { 10, 20, 30 };

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.err.println(iterator.next());
        }
    }
}
