package Java_Basics_01;

public class Java_16_For_Loop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("I love pets " + i);
        }
        System.out.println("-------------------------------");

        int[] numbers_array = {0, 1, 2, 3, 4};

        for (int j = 0; j < numbers_array.length; j++) {
            System.out.println("n° " + (j + 1) + " item is " + j);
        }

        System.out.println("-------------------------------");

        for (int j : numbers_array) {
            System.out.println("n° " + (j + 1) + " item is " + j);
        }

        System.out.println("-------------------------------");

        String[] users = {"John", "Marc", "James", "Bob"};
        for (String first_name : users
        ) {
            System.out.println(first_name);

        }
    }
}
