package com.learning.core.Phase1PracticeProject;
//Writing a program in Java to verify implementations of collections

import java.util.*;

public class Phase1SN05 
{
	public static void main(String[] args) {
        // List example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("List Example:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
        System.out.println();

        // Set example
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // Duplicate elements are not allowed in Set
        System.out.println("Set Example:");
        for (int num : set) {
            System.out.println(num);
        }
        System.out.println();

        // Map example
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("Map Example:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
	}
}
