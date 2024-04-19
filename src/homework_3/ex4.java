package homework_3;

public class ex4 {
    public static void main(String[] args) {
        //4.	Write a Java program that calculates the factorial of a given non-negative integer using a while loop. The factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n.
        //Example: For input n = 5, the factorial is calculated as 5! = 5 * 4 * 3 * 2 * 1 = 120.

        int num = 5, i =1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
