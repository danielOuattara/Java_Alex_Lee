package Java_Basics_01;

import java.util.Scanner;

public class Java_06_User_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String user_name = scanner.nextLine();
        System.out.println(user_name);
    }
}
