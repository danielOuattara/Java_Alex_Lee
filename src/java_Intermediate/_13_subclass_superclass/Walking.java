package java_Intermediate._13_subclass_superclass;

class Walking extends Shoe {

    public final boolean goreTex;

    public Walking(String brand, double size, boolean goreTex) {
        super(brand, size);
        this.goreTex = goreTex;
    }
}
