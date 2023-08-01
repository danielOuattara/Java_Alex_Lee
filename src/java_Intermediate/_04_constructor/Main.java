package java_Intermediate._04_constructor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Shirt shirt_blue_M = new Shirt("blue", 'M');
        Scanner scanner = new Scanner(System.in);

        System.out.println("Build your own shirt");
        System.out.println("Choose a color");
        String selected_color = scanner.nextLine();
        System.out.println("Choose a size");
        char selected_size = scanner.next(".").charAt(0);
        scanner.close();

        Shirt user_shirt = new Shirt(selected_color, selected_size);

    }
}
