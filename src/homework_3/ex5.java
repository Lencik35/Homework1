package homework_3;

public class ex5 {
    public static void main(String[] args) {
       // 5.	Display on the screen the multiplication table for 3.
        int nr = 3;
        int product;
        for(int i = 1; i <= 10; i++)

        {
            product= nr*i;

            System.out.printf(nr + "*"+i +"=" + product);
        }
    }
}


