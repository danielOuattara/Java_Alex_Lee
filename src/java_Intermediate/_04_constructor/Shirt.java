package java_Intermediate._04_constructor;

public class Shirt {
    private String color;
    private char size;

    Shirt() {
        // default constructor
    }

    Shirt(String color, char size) {
        this.color = color;
        this.size = size;
    }

    public static void putOnShirt() {
        System.out.println("Shirt is wear !");
    }

    public static void takeOffShirt() {
        System.out.println("Shirt is removed !");
    }
}