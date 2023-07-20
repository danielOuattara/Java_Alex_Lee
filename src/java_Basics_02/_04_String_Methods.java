package java_Basics_02;

public class _04_String_Methods {
    public static void main(String[] args) {

        String user_name = "John Doe Douglas";
        System.out.println(user_name);
        System.out.println(user_name.toUpperCase());
        System.out.println(user_name.toLowerCase());
        System.out.println("first char of user_name : " + user_name.charAt(0));
        System.out.println("6th char of user_name : " + user_name.charAt(5));
        System.out.println("user_name length : " + user_name.length());
        System.out.println("last char of user_name : " + user_name.charAt(user_name.length() - 1));
        System.out.println(user_name.substring(5)); // Doe Douglas
        System.out.println(user_name.substring(0, 9)); // John Doe
    }


}
