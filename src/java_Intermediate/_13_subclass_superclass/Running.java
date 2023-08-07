package java_Intermediate._13_subclass_superclass;

class Running extends Shoe {
    public final double weight;

    public Running(String brand, double size, double weight) {
        super(brand, size);
        this.weight = weight;
    }
}