package java_Intermediate._10_use_java_classes;

public class Main {
    public static void main(String[] args) {
        Class1 object1_1 = new Class1();
        System.out.println(object1_1.x);
        System.out.println(object1_1.chars);

        Class1 object1_2 = new Class1();
        System.out.println(object1_2.x);
        System.out.println(object1_2.chars);
        object1_2.sayHi();

        System.out.println("----------------------------");

        Class2 object2_1 = new Class2();
        System.out.println(object2_1.x);
        object2_1.sayHi();
    }
}
