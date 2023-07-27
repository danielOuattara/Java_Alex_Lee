package java_Basics_02;

import java.util.ArrayList;

public class _23_Null_Keyword {
    public static void main(String[] args) {

        String nullString = null;
        ArrayList nullArrayList = null;

        if (nullString == null) {
            System.out.println("is null");
        }

        //  Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "nullString" is null
        if (nullString.equals(null)) {
            System.out.println("is null");
        }

    }
}
