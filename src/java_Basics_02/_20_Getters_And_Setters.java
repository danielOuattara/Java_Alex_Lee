package java_Basics_02;

public class _20_Getters_And_Setters {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void sayHelloTo(String name) {
        System.out.println("hello " + name);
    }

    public void printInfo() {
        System.out.println(this.getName() + " " + this.getAge() + " y.o");
    }

    public static void main(String[] args) {
        //----------------------------------------------------------

        // create a new instance of the root class
        _20_Getters_And_Setters instance_1 = new _20_Getters_And_Setters();

        // static method: can be call directly on class
        _20_Getters_And_Setters.sayHelloTo("John");

        // static method: can also be call on an instance of the class
        instance_1.sayHelloTo("John");

        //-----------------------------------------------------------
        // create another instance

        _20_Getters_And_Setters pablo = new _20_Getters_And_Setters();

        pablo.setName("Pablo Escobar");
        pablo.setAge(58);

        System.out.println(pablo.name);
        System.out.println(pablo.age);
        //----

        pablo.printInfo();

        //----
        System.out.println(pablo.getName());
        System.out.println(pablo.getAge());
    }
}
