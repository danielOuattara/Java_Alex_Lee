package java_Intermediate._02_OOP;

public class Pen {
    String type = "gel";
    String color = "blue";
    int width = 10;

    boolean clicked = false;

    public void hideNeedle() {
        clicked = false;
    }

    public void showNeedle() {
        clicked = true;
    }

}
