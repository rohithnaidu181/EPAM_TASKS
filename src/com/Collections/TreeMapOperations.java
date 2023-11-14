package com.Collections;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int q = sc.nextInt(); // Number of queries
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();

            while (q-- > 0) {
                char queryType = sc.next().charAt(0);

                switch (queryType) {
                    case 'a':
                        int key = sc.nextInt();
                        int value = sc.nextInt();
                        treeMap.put(key, value);
                        break;

                    case 'b':
                        int x = sc.nextInt();
                        int result = treeMap.containsKey(x) ? treeMap.get(x) : -1;
                        System.out.print(result + " ");
                        break;

                    case 'c':
                        System.out.print(treeMap.size() + " ");
                        break;

                    case 'd':
                        int removeKey = sc.nextInt();
                        treeMap.remove(removeKey);
                        break;

                    case 'e':
                        for (Integer mapKey : treeMap.keySet()) {
                            System.out.print(mapKey + " " + treeMap.get(mapKey) + " ");
                        }
                        break;
                }
            }

            System.out.println(); // Print a new line after each test case
        }
    }
}
