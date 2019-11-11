Java Stack Class Tutorial

A Stack is a Last In First Out (LIFO) data structure.

It supports two basic operations called push and pop. The push operation adds an element at the top of the stack, and the pop operation removes an element from the top of the stack.

como una pila de platos , si necesitamos uno sera el pimero de arriba

hierarchy

stack -> vector -> list ... etc 


Creating a Stack and Performing basic operations like push, pop and peek
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stackOfCards = new Stack<>();

        // Pushing new items to the Stack
        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println("Stack => " + stackOfCards);
        System.out.println();

        // Popping items from the Stack
        String cardAtTop = stackOfCards.pop();  // Throws EmptyStackException if the stack is empty
        System.out.println("Stack.pop() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);
        System.out.println();

        // Get the item at the top of the stack without removing it
        cardAtTop = stackOfCards.peek();
        System.out.println("Stack.peek() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);

    }
}
# Output
Stack => [Jack, Queen, King, Ace]

Stack.pop() => Ace
Current Stack => [Jack, Queen, King]

Stack.peek() => King
Current Stack => [Jack, Queen, King]

https://www.callicoder.com/java-stack/



