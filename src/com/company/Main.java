package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Integer[] array = new Integer[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
            arrayList.add(random.nextInt(2));
            linkedList.add(random.nextInt(2));
        }
        System.out.println(Arrays.toString(array) + "-> Array");
        System.out.println(arrayList + "-> ArrayList");
        System.out.println(linkedList + "-> LinkedList");

        arraySort(array);
        arrayListSort(arrayList);
        linkedListSort(linkedList);


    }

    public static void arraySort(Integer[] array){
            Arrays.sort(array);
        System.out.println("Array sorting -> " + Arrays.toString(array));
        }

    public static void arrayListSort(ArrayList<Integer>arrayList){
        Collections.sort(arrayList);
        System.out.println("ArrayList Sorting ->" + arrayList);
    }

    public static void linkedListSort(LinkedList<Integer>linkedList){
        Collections.sort(linkedList);
        System.out.println("LinkedList Sorting ->" + linkedList);
    }
}

