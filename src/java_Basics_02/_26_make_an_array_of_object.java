package java_Basics_02;


class Monkey {
    String type = "Spider Monkey";

    public void monkeySound() {
        System.out.println("Ouhh Aahh Ouhh Aahh !!!");
    }
}

public class _26_make_an_array_of_object {
    public static void main(String[] args) {
        Monkey monkey_1 = new Monkey();
        Monkey monkey_2 = new Monkey();
        Monkey[] monkeysArray = {monkey_1, monkey_2};

        for (Monkey singleMonkey : monkeysArray) {
            singleMonkey.monkeySound();
        }
    }


}
