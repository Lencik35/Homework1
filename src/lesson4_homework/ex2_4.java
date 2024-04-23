package lesson4;

public class ex2_4 {
    public static void main(String[] args) {
        //  2.Write a Java program to sort an array of integers in ascending and descending order.
        int []array={1,2,3,6,8,7,9,7,-5,11,-3};

        for ( int i=0; i<array.length;i++){
            for (int g=i+1; g<array.length;g++){
                int tmp=0;
                int j =0;
                if (array[i]>array[g])
                {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;

                }
                System.out.println(array[i]);



            }
        }

    }
}
