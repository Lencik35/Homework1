package lesson4;

import java.util.Arrays;

public class ex6_4 {
    public static void main(String[] args) {
        //Write a Java program to merge two sorted arrays into a single sorted array.

        int [] array1={1,2,3};
        int [] array2={4,5,6};
        int y=0;
        Arrays.sort(array1); for (int i : array2) {

        }

        int[] mergedArray = new int[array1.length + array2.length];
        for (int i=0; i<array1.length;i++){
            mergedArray.toString();
            mergedArray[y++]=array1[i];
            mergedArray[y++]=array2[i];

        }

        Arrays.sort(mergedArray);
        System.out.println("Print 2 sorted array in one: "+Arrays.toString(mergedArray));

    }
}

