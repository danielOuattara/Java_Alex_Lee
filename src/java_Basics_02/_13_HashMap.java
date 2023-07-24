package java_Basics_02;

import java.util.HashMap;

public class _13_HashMap {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        int c = 88;

        HashMap<String, Integer> first_hash_map = new HashMap<String, Integer>();

        first_hash_map.put("a", 10);
        first_hash_map.put("b", 3);
        first_hash_map.put("c", 88);

        System.out.println("first_hash_map = " + first_hash_map);
        System.out.println("value of 'c' = " + first_hash_map.get("c"));

        //----------------------------------------

        // (user, password)
        HashMap<String, String> second_hash_map = new HashMap<String, String>();
        second_hash_map.put("john doe", "Super_Secret?");
        second_hash_map.put("bob martin", "I_@am_@coder_@");
        second_hash_map.put("anna doe", "?Who-I-Am?");

        System.out.println("second_hash_map = " + second_hash_map);

        second_hash_map.remove("anna doeAAA"); // misspelled
        System.out.println("second_hash_map = " + second_hash_map);

        second_hash_map.remove("anna doe");
        System.out.println("second_hash_map = " + second_hash_map);

        System.out.println("second_hash_map.keySet() =" + second_hash_map.keySet());
        System.out.println("second_hash_map.values() =" + second_hash_map.values());

        System.out.println("second_hash_map.containsKey(\"anna doe\") = " + second_hash_map.containsKey("anna doe"));
        System.out.println("second_hash_map.containsKey(\"bob martin\") = " + second_hash_map.containsKey("bob martin"));

        System.out.println("second_hash_map.containsValue(\"?Who-I-Am?\") = " + second_hash_map.containsValue("?Who-I-Am?"));
        System.out.println("second_hash_map.containsValue(\"Super_Secret?\") = " + second_hash_map.containsValue("Super_Secret?"));

        // changing some password
        second_hash_map.replace("bob martin", "I_@am_@coder_@_Again!!!"); // .replace() method returns the old value.
        System.out.println("second_hash_map = " + second_hash_map);

    }
}
