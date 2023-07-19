package java_Basics_01;

public class Java_17_String_to_Integer {
    public static void main(String[] args) {
        System.out.println("String to integer");

        String string_1 = "102";
        System.out.println(string_1 + 4);// 1024

        // convert string_1 to Integer
        int string_1_to_int = Integer.parseInt(string_1);
        System.out.println(string_1_to_int + 4); // 106

        // convert Int to String

        int number_2 = 23;
        String number_2_to_string = Integer.toString(number_2);
        System.out.println(number_2_to_string);

        // regular expression

        String string_2 = "age: 39";
        System.out.println(string_2);

        String string_3 = string_2.replaceAll("\\d+", "");
        System.out.println(string_3);

        String string_4 = string_2.replaceAll("\\D+", "");
        System.out.println(string_4);  // 39  as String
        System.out.println(Integer.parseInt(string_4)); // 39 as int

    }
}
