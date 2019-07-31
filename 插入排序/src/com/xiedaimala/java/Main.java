package com.xiedaimala.java;


public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array = {7,3,19,40,4,7,1};
        insertSort(array);
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void insertSort(int[] a) {
        if (a != null) {
            for (int i = 1; i < a.length; i++) {
                int temp = a[i], j = i;
                if (a[j - 1] > temp) {
                    while (j >= 1 && a[j - 1] > temp) {
                        a[j] = a[j - 1];
                        j--;
                    }
                }
                a[j] = temp;
            }
        }
    }
}


