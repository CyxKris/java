package com.cyx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorsPractice {
    public static void main(String[] args) {
        // MyGenericList<Integer> genericList = new MyGenericList<>();
        // genericList.add(1);
        // genericList.add(2);
        // genericList.add(3);

        // Iterator<Integer> iterator = genericList.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println("Item: " + iterator.next());
        // }
        // ?OR: USING THE FOR.EACH() LOOP:
        // for (int x : genericList) {
        //     System.out.println("Item: " + x);
        // }

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.set(1, 200);

        System.out.println("arrayList is: " + arrayList + "\n");

        System.out.println("Items in arrayList:\n");
        for (int x : arrayList) {
            System.out.println("Item: " + x);
        }

        List<Integer> arrayList2 = new ArrayList<>(arrayList);
        // ?if you don't want to add a new collection through the constructor, you can use the following:
        // arrayList2.addAll(arrayList); // *gives you more control over when/where you want the new collection to be added.
        System.out.println("\narrayList2 is: " + arrayList2);
        arrayList2.add(4);
        arrayList2.add(5);
        arrayList2.add(6);
        System.out.println("\nNew arrayList2 is: " + arrayList2);


        List<Integer> arrayList3 = arrayList2.subList(2, 6);
        System.out.println("\narrayList3 (created from subList of arrayList2) is: " + arrayList3);
        // ?Any change made to arrayList3 would reflect in arrayList2 as well, as it is a subList of arrayList2.
    }
}
