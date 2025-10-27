// File: Queue.java
// Implement a Queue using LinkedList (no peek method)

import java.util.NoSuchElementException;

public class Queue<T> {

    private final LinkedList<T> list;
    private int size;

    public Queue() {
        list = new LinkedList<>();
        size = 0;
    }

    // O(1): add element at the end (rear)
    public void enqueue(T item) {
        list.insertLast(item);   // use existing method from LinkedList
        size++;
    }

    // O(1): remove element from the front (head)
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        // get the first element before deleting
        // (we can get it by deleting and returning it directly)
        T removedItem = list.deleteFirst();
        size--;
        return removedItem;
    }

    // O(1)
    public boolean isEmpty() {
        return size == 0;
    }

    // O(1)
    public int size() {
        return size;
    }

    // optional, just to see what’s inside the queue
    public void display() {
        list.display();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

