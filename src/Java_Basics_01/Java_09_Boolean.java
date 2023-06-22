package Java_Basics_01;

public class Java_09_Boolean {
    public static void main(String[] args) {
        boolean userIsLoggedIn = true;
        System.out.println(userIsLoggedIn);
        boolean numberIsPositive = 5 > 0;
        System.out.println(numberIsPositive);

        if (userIsLoggedIn) {
            System.out.println("User is logged in !");
        } else {
            System.out.println("User is NOT logged in !");
        }

        //-----------------------------------------
        int doorCount = 0;
        boolean passedDoor = true;
        boolean missedDoor = false;
        boolean passedAllDoors = false;

        if (missedDoor) {
            System.out.println("We passed the 1st door");
            doorCount += 1;
        }

        if (missedDoor) {
            System.out.println("We passed the 2nd door");
            doorCount += 1;
        }
        if (missedDoor) {
            System.out.println("We passed the 3rd door");
            doorCount += 1;
        }

        if (doorCount == 3) {
            System.out.println("Congratulations ! You 've passed all the door");
        } else if (doorCount == 0) {
            System.out.println("Can do better: you missed all doors");
        } else if (doorCount < 3) {
            System.out.println("You missed some door");
        }
    }
}