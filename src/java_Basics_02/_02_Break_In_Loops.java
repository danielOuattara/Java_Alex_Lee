package java_Basics_02;

public class _02_Break_In_Loops {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Hello !");
            break;
        }

        System.out.println("--------------------------");

        int counter = 0;

        while (counter < 10) {
            System.out.println("counter = " + counter);
            counter++;
            if (counter == 7) break;
        }

        System.out.println("--------------------------");

        int[] tenthNumber = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        for (int i = 0; i < tenthNumber.length; i++) {
            System.out.println(tenthNumber[i]);
            if (tenthNumber[i] == 70) break;
        }
        System.out.println("--------------------------");

        for (int j : tenthNumber) {
            System.out.println(j);
            if (50 == j) break;
        }

        System.out.println("--------------------------");

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i + " " + j);
                break;
            }

        }
    }
}
