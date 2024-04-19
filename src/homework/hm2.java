package homework;

import java.util.Scanner;

public class hm2 {
    public static void main(String[] args) {
//2)Write a program to take two integer inputs from user and print sum and product of them.

        Scanner sc=new Scanner(System.in);
        int s;
        int s1;
        int sum;
        int product;
        System.out.println("Enter the first number:");
        s =sc.nextInt();
        System.out.println("Enter the second number:");
        s1 =sc.nextInt();
        sum=s+s1;
        product= s*s1;
        System.out.println("Sum is :"+ sum);
        System.out.println("Product is :"+ product);




    }
}
