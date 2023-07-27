package java_Basics_02;

import java.util.Stack;

public class _17_Stack {
    public static void main(String[] args) {
        Stack<String> games = new Stack<>();
        games.add("game 1");
        games.add("game 2");
        games.add("game 3");

        System.out.println("games = " + games);

        System.out.println("last on stack to be removed : " + games.pop());
        System.out.println("games = " + games);

        System.out.println("games.peek() = " + games.peek());

        // --------------------------------

        Stack<Character> lettersStack = new Stack<>();
        lettersStack.add('R');
        lettersStack.add('G');
        lettersStack.add('B');
        lettersStack.add('Y');
        System.out.println("lettersStack = " + lettersStack);
        System.out.println("lettersStack.contains('Z') = " + lettersStack.contains('Z'));
        System.out.println("lettersStack.contains('B') = " + lettersStack.contains('B'));
        System.out.println("lettersStack.empty() = " + lettersStack.empty());

        System.out.println("lettersStack.get(0) = " + lettersStack.get(0));
        System.out.println("lettersStack.get(1) = " + lettersStack.get(1));
        System.out.println("lettersStack.get(2) = " + lettersStack.get(2));

        System.out.println("lettersStack.set(0, 'D') = " + lettersStack.set(0, 'D'));
        System.out.println("lettersStack = " + lettersStack);
        System.out.println("lettersStack.size() = " + lettersStack.size());

    }
}
