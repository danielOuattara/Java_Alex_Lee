package java_Basics_02;

import java.util.ArrayList;

public class _10_Exceptions {
    public static void main(String[] args) {

        //---------------------------------------------------------------

        String[] pets = {"dog", "cat", "fish"};
        // System.out.println(pets[3]); // Exception read below

        /*
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
         * at java_Basics_02._10_Exceptions.main(_10_Exceptions.java:8)
         */

        //---------------------------------------------------------------

        int[] numbers = {};
        // System.out.println(numbers[0]);  // Exception read below
        /*
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
         * at java_Basics_02._10_Exceptions.main(_10_Exceptions.java:16)
         */

        //---------------------------------------------------------------

        ArrayList<String> listOfPets = new ArrayList<>();
        // System.out.println(listOfPets.get(0));  // Exception read below
        /*
         * Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
         * at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
         * at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
         * at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
         * at java.base/java.util.Objects.checkIndex(Objects.java:359)
         * at java.base/java.util.ArrayList.get(ArrayList.java:427)
         * at java_Basics_02._10_Exceptions.main(_10_Exceptions.java:30)
         * */

        //---------------------------------------------------------------

        ArrayList<String> invisibleList = null;
       // System.out.println(invisibleList.get(0));  // Exception read below

        /*
        * Exception in thread "main" java.lang.NullPointerException:
        * Cannot invoke "java.util.ArrayList.get(int)" because "invisibleList" is null
	    * at java_Basics_02._10_Exceptions.main(_10_Exceptions.java:44)
	    */


    }


}
