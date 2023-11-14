package com.Collections;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("MANGO");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Elephant");
        System.out.println("LinkedList: " + linkedList);

        // HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Vignesh");
        hashMap.put(2, "Adhav");
        hashMap.put(3, "Dhruv");
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Dhruv");
        linkedHashMap.put(1, "Vignesh");
        linkedHashMap.put(2, "Adhav");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("January");
        linkedHashSet.add("February");
        linkedHashSet.add("March");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Orange");
        treeSet.add("Apple");
        treeSet.add("Banana");
        System.out.println("TreeSet: " + treeSet);

        // TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        System.out.println("TreeMap: " + treeMap);
    }
}