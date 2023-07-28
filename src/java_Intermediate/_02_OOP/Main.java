package java_Intermediate._02_OOP;

public class Main {
    public static void main(String[] args) {
        Pen pen_1 = new Pen();

        System.out.println(pen_1.color);
        System.out.println(pen_1.type);
        System.out.println(pen_1.width);

        pen_1.hideNeedle();
        System.out.println(pen_1.clicked);
    }
}
