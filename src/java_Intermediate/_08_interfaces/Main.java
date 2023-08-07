package java_Intermediate._08_interfaces;


public class Main implements WaterBottleInterface {
    public static void main(String[] args) {

        Main bottle_1 = new Main();
        bottle_1.fillUp();
        System.out.println(bottle_1.color);


    }

    public void fillUp() {
        System.out.println("filling up the bottle...!");
        ;
    }
}
