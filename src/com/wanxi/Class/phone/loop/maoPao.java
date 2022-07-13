package com.wanxi.Class.phone.loop;

import java.util.Arrays;

public class maoPao {
    public static void main(String[] args) {
        int[] a= {1,2,3,65,76,2,46,7,2,9,67,546,657,5443};
        int[] sort = maoPao(a);
        System.out.println(Arrays.toString(sort));

    }

    public static int[] maoPao(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] > array[j]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j]=temp;

                }
            }
        }
        return array ;
    }
}
