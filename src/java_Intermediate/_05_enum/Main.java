package java_Intermediate._05_enum;


// Outer Enum
enum GameLevels {
    LOW, MEDIUM, HIGH;

    static void myStaticMethod() {
        System.out.println("Static Method");
    }

    void myNonStaticMethod() {
        System.out.println("Non Static Method");
    }
}

public class Main {

    // Inner Enum
    enum Flavor {
        CHOCOLATE, VANILLA, COCONUT;

        static void myStaticMethod() {
            System.out.println("Static Method");
        }

        void myNonStaticMethod() {
            System.out.println("Non Static Method");
        }
    }

    public static void main(String[] args) {

        /* Outer Enum
        --------------- */
        System.out.println(GameLevels.HIGH);
        GameLevels startLevel = GameLevels.LOW;
        switch (startLevel) {
            case LOW -> System.out.println("game level is LOW");
            case MEDIUM -> System.out.println("game level is MEDIUM");
            case HIGH -> System.out.println("game level is HIGH");
            default -> System.out.println("Unknown Game Level");
        }

        startLevel.myStaticMethod();
        startLevel.myNonStaticMethod();

        /* Inner Enum
        -------------- */

        Flavor chocolate = Flavor.CHOCOLATE;
        System.out.println(chocolate);
        System.out.println(Flavor.VANILLA);
    }
}
