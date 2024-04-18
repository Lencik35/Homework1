import java.util.Scanner;

public class hm5_3 {
    public static void main(String[] args) {
        //Write a Java program that takes a year from the user and prints whether it is a leap year or not.
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter a year : ");
        year = sc.nextInt();
        boolean isLeapYear;
        isLeapYear = (year % 100 != 0 || year % 400 == 0);
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
            ;
        }
    }
}
