package homework;

import java.util.Scanner;

public class hm5 {
    public static void main(String[] args) {
        //1)	Write a Java program to get a number from the user and print whether it is positive or negative.

        Scanner sc=new Scanner(System.in);
        System.out.println("Insert a number: ");
        String  number=sc.nextLine();
        int a = Integer.parseInt(number);
        if (a>0){
       System.out.println("Positive");}
        else if (a<0){
        System.out.println("Negative");
            }
}

    }

