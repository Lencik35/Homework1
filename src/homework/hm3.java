package homework;

import java.util.Scanner;

public class hm3 {
    //3)Take side of a square from user and print area and perimeter of it.
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int side = 0;
        int area = 0;
        int perimeter=0;
        System.out.println("Enter the length the side of a square : ");
        side= scanner.nextInt();
        area= side*side;
        perimeter= 4*side;
        System.out.println("The Area of square is : "+area);
        System.out.println("The Perimeter of square is :"+ perimeter);

    }
}
