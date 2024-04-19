package homework;

import java.util.Scanner;

public class hm5_2 {
    public static void main(String[] args) {
//Write a Java program that takes three numbers from the user and prints the greatest number.
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Insert first number: ");
        a = sc.nextInt();
        System.out.println("Insert second number: ");
        b = sc.nextInt();
        System.out.println("Insert the third number: ");
        c = sc.nextInt();
        d = (c > ((a > b) ? a : b)) ? c : ((a > b) ? a : b);
        System.out.println("Greatest number is :" + d);
    }





}
