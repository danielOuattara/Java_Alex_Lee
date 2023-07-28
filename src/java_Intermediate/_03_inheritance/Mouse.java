package java_Intermediate._03_inheritance;

public class Mouse {
    String texture = "Matte";

    public void leftClick() {
        System.out.println("Click on Left");
    }

    public void rightClick() {
        System.out.println("Click on Right");
    }

    public static void setColor(String color) {
        System.out.println(color);
    }
}
