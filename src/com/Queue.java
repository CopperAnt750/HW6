package com;

public class Queue<T> {
    private int size;
    private Node front;
    private Node rear;


//    DoublyLinkedList based Queue (FIFO). Methods: enqueue,
//    dequeue, size, isEmpty.

    class Node<T> {
        T data;
        Node next;

        public void displayNodeData() {
            System.out.println("{ " + data + " } ");
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    //rear - zad
    //front - pered
    public void enqueue(T element) {
        Node oldRear = rear;
        rear = new Node();
        rear.data = element;
        rear.next = null;
        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        size++;
        System.out.println(element + " added to the queue");
    }

    public T dequeue() {
        T data = (T) front.data;
        front = front.next;
        if (isEmpty()){
            rear=null;
        }
        size--;
        System.out.println(data + " removed from the queue");
        return data;
    }
}
