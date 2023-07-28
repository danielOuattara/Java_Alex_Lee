package java_Intermediate._01_recursion;

public class Main {

    public static void main(String[] args) {
//        sayHi_While(5);
//        sayHi_DoWhile(5);
//        sayHi_IfElse(5);
        printBackward(5);
        System.out.println(sumBackward(5));
    }


    public static void sayHi_While(int numberOfTime) {
//        while (numberOfTime > 2) {
//            System.out.println("Result : " + numberOfTime);
//            numberOfTime -= 1;
//            sayHi_While(numberOfTime);
//        }
//        System.out.println("DONE !");
    }


//    public static void sayHi_DoWhile(int numberOfTime) {
//        do {
//            System.out.println("Ninja " + numberOfTime);
//            numberOfTime -= 1;
//            sayHi_DoWhile(numberOfTime);
//        }
//        while (numberOfTime > 0);
//        System.out.println("DONE");
//    }

    public static void sayHi_IfElse(int numberOfTime) {
        if (numberOfTime == 0) {
            System.out.println("DONE !");
        } else {
            System.out.println("Ninja " + numberOfTime);
            numberOfTime -= 1;
            sayHi_IfElse(numberOfTime);
        }

    }


    public static void printBackward(int n) {
        if (n == 0) {
            System.out.println("DONE !");
        } else {
            n--;
            System.out.println(n);
            printBackward(n);
        }
    }

    public static int sumBackward(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sumBackward(n - 1);

    }
}
