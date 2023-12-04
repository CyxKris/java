package com.cyx.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSetExample extends Thread {

    private HashSetExample() {

    }

    static HashSetExample hashSetExample;

    public static HashSetExample getInstance() {
        if (hashSetExample == null) {
            hashSetExample = new HashSetExample();
        }

        return hashSetExample;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i + ", ");
            // System.out.println(i);
        }
    }


    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        // ?Doesn't allow storage of duplicate values

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3); // ?IGNORES THE DUPLICATE ENTRY.
        set.add(4);
        set.add(5);

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // *If the HashSetExample class wasn't a Singleton class
        // HashSetExample hashSetExample = new HashSetExample();
        // hashSetExample.start();

        HashSetExample.getInstance().start();

        // ?ASSIGNMENT
        /* ?create application to store details of students in a database.
         * use singleton design in the application
         * Save it a file
         * use console to get the information from the user
         * Retrieve it from file and store it in a collection api
         * display the results in gui
         * 
         * use arraylist or hashset to retrieve the details of the students from the file and display them on the gui
         */


    }
}
