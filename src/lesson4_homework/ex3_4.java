package lesson4;

public class ex3_4 {
    public static void main(String[] args) {
        //  3.Write a Java program to find the intersection of two arrays (common elements).

        int[] array={1,2,3,4,5,9};
        int[] array1= {6,7,8,9,10};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                // Check if elements in array1 and array2 are equal.
                if (array[i] == (array1[j])) {
                    // Print the common element.
                    System.out.println("Common element is : " + (array[i]));


                }
            }
        }}}