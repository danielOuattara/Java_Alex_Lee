package java_Intermediate._13_subclass_superclass;

public class Shoe {

    public final String brand;
    public final double size;

    public Shoe(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }

    public static void main(String[] args) {
        Shoe shoe_1 = new Shoe("Nike", 43);
        Walking walking_shoe_1 = new Walking("Nike", 11, true);
        Running running_shoe_1 = new Running("Reebok", 11, 230.0);
    }
}



