package homework_3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        ///2.	Write a program to create simple calculator using switch Statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of first number: ");
        int x = sc.nextInt();
        System.out.println("Enter value of first number: ");
        int y = sc.nextInt();
        int result;

        System.out.println("Select operation: +,-,*,or / ");
        char operator = sc.next().charAt(0);
        switch (operator) {

            case '+':
                result = x + y;
                System.out.println("The sum is : " + result);
                break;

            case '-':
                result = x - y;
                System.out.println("The difference is : " + result);
                break;

            case '*':
                result = x * y;
                System.out.println("The product is: " + result);
                break;

            case '/':
                result = x / y;
                System.out.println("The division is:" + result);
                break;
            default:
                System.out.println("Invalid number");
        }









    }
}
