package lesson4;

import java.util.Arrays;

import static java.util.Collections.reverse;

public class ex1_4 {
    public static void main(String[] args) {
        //1.Write a Java program to reverse an array of integers.

        int[] integers= {1,2,3,4,5,6,7};
        int length= integers.length;
        for (int i=0;i<length/2;i++){
            int temp = integers[i];
            integers[i]=integers[length-i-1];
            integers[length-i-1]=temp;}
        //System.out.println(reverse()[integers]);
    }

}

