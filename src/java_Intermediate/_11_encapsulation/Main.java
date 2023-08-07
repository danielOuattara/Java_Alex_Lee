package java_Intermediate._11_encapsulation;

public class Main {
    public static void main(String[] args) {

        Student jane = new Student();
        jane.setName("Jane");
        System.out.println(jane.getName());
        jane.setAge(24);
        System.out.println(jane.getAge());

    }
}
