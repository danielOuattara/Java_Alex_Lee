package java_Basics_02;

public class _22_Method_Parameters {

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void sayHelloTo(String name) {
        System.out.println("Hello " + name);
    }

    public static void printInfo(String name, int age) {
        System.out.println(name + " " + age + " y.o");
    }

    public static int additionner(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        sayHello();
        sayHelloTo("John");
        printInfo("Jane", 31);

        int result_1 = additionner(1, 3);
        System.out.println("result_1 = " + result_1);

        int result_2 = additionner(-5, 3);
        System.out.println("result_2 = " + result_2);

        int result_3 = additionner(10, 3);
        System.out.println("result_3 = " + result_3);
    }
}
