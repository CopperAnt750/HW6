package com;

public class Main {


    public static void main(String[] args) {
        Queue<Integer> q1 = new Queue<>();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();

        Stack<Integer> st1 = new Stack<Integer>();
        st1.push(1);
        st1.push(3);
        st1.push(5);
        st1.push(8);
        st1.push(-12);
        st1.printStack();

        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        dll.addFirst(0);
        dll.addFirst(1);
        dll.addFirst(2);
        dll.printForward();
        dll.addIndex(1, 12);
        dll.printForward();


    }
}
