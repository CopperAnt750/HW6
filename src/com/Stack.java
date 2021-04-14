package com;

import java.util.EmptyStackException;


public class Stack<T> {

    private int size;
    private Node head;

    private class Node {
        T value;
        Node previous;

        public Node(T value) {
            this.value = value;
        }

        public void displayNodeData() {
            System.out.println("{ " + value + " } ");
        }
    }

    public void push(T elem) {
        Node oldHead = head;
        Node newHead = new Node(elem);
        newHead.previous = oldHead;
        head = newHead;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            Node temp = head;
            head = head.previous;
            size--;
            return temp.value;
        }
    }

    public T top() {
        if (isEmpty()) throw new EmptyStackException();
        return head.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void printStack() {
        System.out.println("Printing Stack (head --> tail) ");
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.previous;
        }
        System.out.println();
    }
}
