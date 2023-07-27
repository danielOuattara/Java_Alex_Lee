package java_Basics_02;

public class _24_Equals_method_VS_Double_equals_sign {

    // 'equals()' VS '=='

    public static void main(String[] args) {
        String one = "number";
        String two = "number";
        String three = new String("number");

        // true
        if (one == two) {
            System.out.println("one == two");
        }

        // false
        if (one == three) {
            System.out.println("one == three");
        }

        // true
        if (one.equals(two)) {
            System.out.println("one.equals(two)");
        }

        // true
        if (one.equals(three)) {
            System.out.println("one.equals(three)");
        }
    }
}
