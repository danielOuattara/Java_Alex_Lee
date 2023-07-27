package java_Basics_02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _18_Queues {
    public static void main(String[] args) {
        Queue<String> personsQueue = new LinkedList();

        personsQueue.add("Jackson");
        personsQueue.add("John");
        personsQueue.add("Susan");

        System.out.println("personsQueue = " + personsQueue);

        System.out.println("personsQueue.peek() = " + personsQueue.peek());

        personsQueue.poll(); // poll() return teh element that was poll off
        System.out.println("personsQueue = " + personsQueue);

        System.out.println("personsQueue.peek() = " + personsQueue.peek());

        personsQueue.poll();
        System.out.println("personsQueue = " + personsQueue);
        System.out.println("personsQueue.peek() = " + personsQueue.peek());

        personsQueue.poll();
        System.out.println("personsQueue = " + personsQueue);
        System.out.println("personsQueue.peek() = " + personsQueue.peek());

        System.out.println("--------------------------------------------------");

        Queue<Character> lettersQueue  = new LinkedList();

        lettersQueue.add('R');
        lettersQueue.add('G');
        lettersQueue.add('B');
        lettersQueue.add('Y');
        System.out.println("lettersQueue = " + lettersQueue);
        System.out.println("lettersQueue.contains('Z') = " + lettersQueue.contains('Z'));
        System.out.println("lettersQueue.contains('B') = " + lettersQueue.contains('B'));
//        System.out.println("lettersQueue.empty() = " + lettersQueue.empty());

        System.out.println("lettersQueue.toArray()[0] = " + lettersQueue.toArray()[0]);
        System.out.println("lettersQueue.toArray()[1] = " + lettersQueue.toArray()[1]);
        System.out.println("lettersQueue.toArray()[2] = " + lettersQueue.toArray()[2]);

//        System.out.println("lettersQueue.set(0, 'D') = " + lettersQueue.set(0, 'D'));
        System.out.println("lettersQueue = " + lettersQueue);
        System.out.println("lettersQueue.size() = " + lettersQueue.size());
    }
}
