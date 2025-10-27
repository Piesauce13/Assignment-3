// Stack.java
// COSC 251 001 - Assignment 3


public class Stack<T> {

    private LinkedList<T> list; // Use LinkedList as underlying structure
    private int size;

    // Constructor: initialize empty stack - O(1)
    public Stack() {
        list = new LinkedList<>();
        size = 0;
    }

    // Push: insert item onto stack - O(1)
    public void push(T newItem) {
        list.insertFirst(newItem); // Insert at head = top of stack
        size++;
    }

    // Pop: insert item from stack - O(1)
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        T value = peek();       // Peek at top item
        list.deleteFirst();     // Remove from head
        size--;
        return value;
    }

    // Peek: view top item without removing - O(1)
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return list.head.data;
    }

    // Check if stack is empty - O(1)
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get size of stack - O(1)
    public int size() {
        return size;
    }

    // String representation of stack - O(n)
    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }

    // Display stack contents - O(n)
    public void display() {
        System.out.println(this.toString());
    }
}
