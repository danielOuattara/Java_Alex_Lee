package java_Basics_01;

public class Java_19_Main_Method {
    public static void main(String[] args) {
        sayHello();
        sayHi("my friends");

        String[] string_array_arg = {"how are you ?", "my friends"};
        sayHi_2(string_array_arg);
    }

    static void sayHello() {
        System.out.println("Hello there !");
    }

    static void sayHi(String s_arg) {
        System.out.println("Hello " + s_arg);
    }

    static void sayHi_2(String[] s_array_arg) {
        System.out.println("Hello " + s_array_arg[0]);
    }
}
