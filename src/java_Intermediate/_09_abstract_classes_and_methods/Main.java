package java_Intermediate._09_abstract_classes_and_methods;


abstract class Dog {
    String breed;

    public void bark() {
        System.out.println("Woof !!!");
    }

    public abstract void barkAgain();
}


class Chihuahua extends Dog {

    @Override
    public void barkAgain() {
        System.out.println("Woof Woof !!!");
    }
}

public class Main {
    public static void main(String[] args) {

        Chihuahua chihuahua_1 = new Chihuahua();
        System.out.println("chihuahua_1.breed : " + chihuahua_1.breed);
        chihuahua_1.bark();
        chihuahua_1.barkAgain();

    }
}
