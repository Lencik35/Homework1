import java.util.Scanner;

public class hm5_4 {
    public static void main(String[] args) {
        //4)	Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
        //        //           Test Data
        //        //         Input the 5 numbers : 1 2 3 4 5
        //        //          Expected Output : Input the 5 numbers :
        //        //                                           1
        //        //                                           2
        //        //                                           3
        //        //                                           4
        //        //                                           5
        //        //The sum of 5 no is : 15
        //        //The Average is : 3.0

        Scanner scanner= new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        System.out.println("Input the 5 numbers: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 5; i++) {
            
            sum += i;
        }
        System.out.println("The sum of the given number is " + sum);
        avg = sum / 5;
        System.out.println("The average of the given number is " + avg);
    }
}