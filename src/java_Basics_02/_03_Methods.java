package java_Basics_02;

public class _03_Methods {
    public static void main(String[] args) {
        welcome();
        multiply(2, 3);
        multiply(5, 8);
        multiply(7, 123);

        divide(4, 8);
        divide(8, 4);

    }

    public static void welcome() {
        System.out.println("Welcome to our calculator program. ");
    }

    public static void multiply(double a, double b) {
        System.out.println(a * b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }
}
