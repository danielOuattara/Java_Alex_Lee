package java_Basics_02;

public class _01_Nested_Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("--------------------------");

        String[] carsBrand = {"Volvo", "BMW", "Ford", "Mazda"};

        for (int i = 0; i < carsBrand.length; i++) {
            System.out.println(carsBrand[i]);
        }
        System.out.println("--------------------------");

        for (String s : carsBrand) {
            System.out.println(s);
        }

        System.out.println("--------------------------");

        String[][] colors = {
                {"Red", "Green", "Blue"},
                {"Cyan", "Magenta", "Yellow"}
        };

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.println(colors[row][column]);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(" i = " + i + ",  j  = " + j);
            }
        }

    }
}
