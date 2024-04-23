package lesson4;

public class ex4_4 {

    public static void main(String[] args) {

        //4.Write a Java program to calculate the average of all elements in an integer array.

        int sum = 0;

        int[] numbers = {1, 7, 3, 4, 9};

        for (int num : numbers) {

            sum += num;
        }

        double average = (double) sum / numbers.length;
        System.out.println("The average of the given number is :" + average);


    }
}
