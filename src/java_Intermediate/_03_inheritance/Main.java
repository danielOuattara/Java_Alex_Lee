package java_Intermediate._03_inheritance;

public class Main {
    public static void main(String[] args) {
        Mouse1 mouse_1 = new Mouse1();
        System.out.println("mouse_1.texture = " + mouse_1.texture);

        Mouse2 mouse_2 = new Mouse2();
        mouse_2.leftClick();
        mouse_2.connectToBlueTooth();

    }
}
