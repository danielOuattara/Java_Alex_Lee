package java_Basics_02;

import java.util.Arrays;

public class _05_Return_Statement {
    public static void main(String[] args) {
        welcome();
        addition_1(2, 8);

        int adder_2 = addition_2(1, 5);

        System.out.println(adder_2);

        System.out.println(capitalize("hello"));

        System.out.println(Arrays.toString(turnIntegersIntoArrayOfIntegers_1(1, 2, 3)));
        System.out.println(Arrays.toString(turnIntegersIntoArrayOfIntegers_2(1, 2, 3)));
    }
    //--------------------------------------------------------------------

    public static void addition_1(int a, int b) {
        System.out.println(a + b);
    }

    public static int addition_2(int a, int b) {
        return a + b;
    }

    //--------------------------------------------------------------------

    public static void welcome() {
        System.out.println("Hello Dear User !");
    }

    //--------------------------------------------------------------------
    public static String capitalize(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    // TODO
    //--------------------------------------------------------------------
    //    String hello = "Hello world of java";
    //    public static String sentenceCapitalizing(String sentence) {
    //    }

    //--------------------------------------------------------------------

    public static int[] turnIntegersIntoArrayOfIntegers_1(int a, int b, int c) {
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        return array;
    }

    public static int[] turnIntegersIntoArrayOfIntegers_2(int a, int b, int c) {
        return new int[]{a, b, c};
    }

}
