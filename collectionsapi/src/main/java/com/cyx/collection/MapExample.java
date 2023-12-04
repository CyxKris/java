package com.cyx.collection;

import java.util.*;

public class MapExample {


    public static void main(String[] args) {

        Employee employee = new Employee("EMP001", "Anna", "IT");

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Elizabeth");
        map.put(2, "Bob");
        map.put(3, "Randy");
        map.put(4, "Jeremiah");
        map.put(5, "Hannah");
        // map.put(6, 40);
        // map.put(7, 3.14);

        map.put(8, employee.getEmployeeID());
        map.put(9, employee.getEmployeeName());

        Set set = map.entrySet();

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("\nKEY: " + entry.getKey() + ";\tVALUE: " + entry.getValue());
        }
    }


}
