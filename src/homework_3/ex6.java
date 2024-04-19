package homework_3;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        //6.	Write a program where the user enters any positive integer. The program then calculates the sum of all numbers from 1 to the number entered by the user.
        //For example: if the user enters the number 3. The program should calculate the sum of numbers from 1 to 3, which is 1+2+3, and output the answer 6.
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert a positive number :");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Insert the positive number:");

        } else {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("Sum of all numbers is: " + sum);

        }
    }


}
