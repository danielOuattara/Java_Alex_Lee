package java_Basics_01;

public class Java_11_Comparison_Operator {
    public static void main(String[] args) {

        int a = 5;
        int b = 4;
        if (a == b) {
            System.out.println("number are equals");
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " > " + b);
        }

        // OR

        boolean c = (a == b);
        System.out.println("c : " + c);

        /*
        >  ,
        >= ,
        == ,
        != ,
        <  ,
        <= ,
        &&
        ||
         */
    }

}
