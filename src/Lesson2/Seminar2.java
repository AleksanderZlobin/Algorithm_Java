package Lesson2;

import java.util.Arrays;

public class Seminar2 {
    /* Сортировка пузырьком. Сложность О(n^2) */


    public static int[] bubbleSort(int[] array){

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = {3, 2, 7, 5, 26, 13, 21, 14};

        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}


