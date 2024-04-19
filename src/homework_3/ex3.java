package homework_3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        // 3.	Write a program to find the Maximum of Two Numbers using switch statement
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert 1st number :");
        int n1 = sc.nextInt();
        System.out.println("Insert second number :");
        int n2 = sc.nextInt();
        int res = n1 > n2 ? 1 : 0;

        switch (res) {
            case 0:
                System.out.printf("Maximum Number is " + n2);
                break;
            case 1:
                System.out.println("Both are Equals");
                break;}

        case 3:
        System.out.printf("Maximum Number is " + n1);
        break;
    }
}

