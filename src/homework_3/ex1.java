package homework_3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
//1.	Write a program to read gender(M/F) and print the corresponding gender using a switch statement
        char gender;
        Scanner sc = new Scanner(System.in);
        gender = sc.next().charAt(0);

        System.out.println("Insert your gender : " + gender);
    }
}
