import java.sql.SQLOutput;
//adkskdjakjsdbh

public class hm4 {
    public static void main(String[] args) {
//1.	5)There is a string "I love Java":
//2.	 a) Print the letter at index 4.
//3.	b) Print the index of the letter 'J'. )
//4.	c) Add "and QA Automation" to this phrase (resulting in "I love Java and QA Automation").
//5.	d)Check via boolean if the phrase "I love Java" is of type String.

        String text = "I love Java";
        System.out.println(text.charAt(4));
        System.out.println(text.indexOf("J"));
        System.out.println(text + " " + "and" + " " + "QA Automation");
        boolean isString= text instanceof String;
        System.out.println(true);

    }
}








