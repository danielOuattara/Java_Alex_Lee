package Java_Basics_01;

public class Java_24_Logical_Operator {
    public static void main(String[] args) {

        /*
        && --> and
        || --> or
        !  --> not
        */

        boolean result = true || true;

        System.out.println(result); // true

        int a = 3;
        int b = 4;

        System.out.println(a > b && true); // false
        System.out.println(a > b && false); // false
        System.out.println(a < b && true);  // true
        System.out.println(a < b && false);// false



    }
}
