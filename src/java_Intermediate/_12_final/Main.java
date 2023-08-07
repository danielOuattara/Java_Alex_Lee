package java_Intermediate._12_final;


// final for : variable, method, classes

// final variable cannot be changed
// final method cannot be overridden
// final class cannot be inherited
public class Main {

    final int MIN = 0; // final variables are unchangeable
    final int MAX = 50; // upper casing variable name is a convention
    static final double PI = 3.14159;


    final int NEW_MAX; // possible, but need initialization on constructor

    public Main() {
        this.NEW_MAX = 5000;
    }

    public final void sayHi() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Main final_1 = new Main();
        System.out.println(final_1.MAX);
        System.out.println(final_1.MIN);
        System.out.println(PI);
        System.out.println(final_1.NEW_MAX);
        final_1.sayHi(); // Hello , OK
    }

}

class FinalMethodChanger extends Main {
//    ERROR, cannot be overridden from parent class because of final access modifier
//    public void sayHi() {
//        System.out.println("Hi");
//    }

}


