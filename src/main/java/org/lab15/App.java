package org.lab15;


import org.lab15.entity.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> intArr = new ArrayList<>(Arrays.asList(1, 10, 3, 4, 2, 5, 1, 16, 11));
        List<Double> doubleArr = new ArrayList<>(Arrays.asList(1.0, 5.3, 2.2, 5.0, 6.7, 1.3));
        List<String> stringArr = new ArrayList<>(Arrays.asList("bgret", "asfg", "cfkd", "efdslf", "df"));

        MergeSort <Integer> intSort = new MergeSort<>();
        MergeSort <Double> doubleSort = new MergeSort<>();
        MergeSort <String> stringSort = new MergeSort<>();

        System.out.println("Массивы(Integer, Double, String) до сортировки:");
        System.out.println(intArr);
        System.out.println(doubleArr);
        System.out.println(stringArr);

        System.out.println("После сортировки:");
        System.out.println(intSort.mergeSort(intArr));
        System.out.println(doubleSort.mergeSort(doubleArr));
        System.out.println(stringSort.mergeSort(stringArr));
    }
}
