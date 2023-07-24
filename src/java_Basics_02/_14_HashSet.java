package java_Basics_02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class _14_HashSet {
    public static void main(String[] args) {
        HashSet<String> first_hash_set = new HashSet<String>();
        first_hash_set.add("dog");
        first_hash_set.add("cat");
        first_hash_set.add("mouse");
        System.out.println("first_hash_set = " + first_hash_set);

        first_hash_set.add("hummingbird");
        System.out.println("first_hash_set = " + first_hash_set);

        System.out.println("first_hash_set.size() = " + first_hash_set.size());

        System.out.println("first_hash_set.contains(\"tiger\") = " + first_hash_set.contains("tiger"));
        System.out.println("first_hash_set.contains(\"cat\") = " + first_hash_set.contains("cat"));

        System.out.println("first_hash_set.isEmpty()) = " + first_hash_set.isEmpty());

        //----------------------------------------------------

        HashSet<Integer> second_hash_set = new HashSet<Integer>();
        second_hash_set.add(13);
        second_hash_set.add(24);
        second_hash_set.add(5);

        System.out.println("second_hash_set = " + second_hash_set);

        for (Integer integer: second_hash_set ) {
            System.out.println(integer);
        }

        System.out.println("second_hash_set.toArray() = " + second_hash_set.toArray());
        System.out.println("Arrays.toString(second_hash_set.toArray()) = " + Arrays.toString(second_hash_set.toArray()));

        // OR

         Object [] second_hash_set_as_array  =  second_hash_set.toArray();
        System.out.println("second_hash_set_as_array[0]  = "  + second_hash_set_as_array[0]);

        // Iterator

        Iterator<Integer> iterator_second_hash_set = second_hash_set.iterator();
        while (iterator_second_hash_set.hasNext()) {
            System.out.println(iterator_second_hash_set.next());
        }





    }
}
