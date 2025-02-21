/*
 * *** YOUR NAME GOES HERE / YOUR SECTION NUMBER ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

    /**
     * Method different()
     *
     * Given two TreeSets of integers, return a TreeSet containing all elements
     * that are NOT in both sets. In other words, return a TreeSet of all the
     * elements that are in one set but not the other.
     */

    public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

        // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
        //
        // This can be done numerous ways, but once such will only that
        // *several* lines of code. Hint: create two temporary TreeSets and utilize the
        // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.
        TreeSet<Integer> tempset1 = new TreeSet<Integer>(setA);
        TreeSet<Integer> tempset2 = new TreeSet<Integer>(setB);
        TreeSet<Integer> intersectingValues1 = new TreeSet<>(setA);
        intersectingValues1.retainAll(setB);

        tempset1.removeAll(intersectingValues1);
        tempset2.removeAll(intersectingValues1);

        tempset1.addAll(tempset2);








        return tempset1;
    }


    /**
     * Method removeEven()
     *
     * Given a treeMap with the key as an integer, and the value as a String,
     * remove all <key, value> pairs where the key is even.
     */

    public static void removeEven(Map<Integer, String> treeMap) {
        ArrayList<Integer> collection = new ArrayList<>();

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            if (key % 2 == 0) {
                collection.add(key);
            }
            System.out.println(key + " " + value);
        }

        for (Integer key : collection) {
            treeMap.remove(key);
        }
    }



    /**
     * Method treesEqual()
     *
     * Given two treeMaps, each with the key as an integer, and the value as a String,
     * return a boolean value indicating if the two trees are equal or not.
     */

    public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

        // INSERT CODE HERE
//        boolean isEqual = false;
//
//        int length = tree1.size();
//        int length2 = tree2.size();
//
//
//
//        if (length>length2){
//            for (Map.Entry<Integer, String> entry : tree2.entrySet()) {
//                int key = entry.getKey();
//                String value = entry.getValue();
//
//
//
//                System.out.println(key + " " + value);
//            }
//
//        }else if(length<length2) {
//            for (Map.Entry<Integer, String> entry : tree1.entrySet()) {
//                int key = entry.getKey();
//                String value = entry.getValue();
//
//
//
//                System.out.println(key + " " + value);
//            }
//
//        }






        return tree1.equals(tree2);

    }

} // end treeProblems class
