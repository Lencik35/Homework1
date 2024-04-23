package lesson4;

public class ex5_4 {

    public static void main(String[] args) {
        //Write a Java program to search for a specific element in an array and return its index.
        int [] array={3,4,5,6,8,9};
        int search =9;
        int index=-1;
        for (int i=0; i<array.length;i++) {

            if (array[i]== search){
                index=i;
            }
            System.out.println("Index of number 6 is:" +index);

        }

    }
}
