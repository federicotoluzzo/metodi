package com.federicotoluzzo.classi.quickSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ArrayList;
        ArrayList<Integer> a = ArrayList<>(new int[]{3, 1, 2, 6, 4, 5, 9, 10, 8});
        System.out.println(a.toString());
        System.out.println(quickSort(a));
    }

    public static int[] quickSort(ArrayList<Integer> arr) {
        if(arr.length == 0) return arr;
        
        int pivot = arr[0];
        int[] arr1 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < pivot){
                
            }
        }
    }
}
