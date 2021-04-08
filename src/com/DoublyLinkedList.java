package com;

//    DoublyLinkedList (двозв’язний). Methods: addFirst,
//    addLast, add(index), size, isEmpty, removeFirst, removeLast

public class DoublyLinkedList<T> {

    int size;
    Node<T> head;
    Node<T> tail;

    public DoublyLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        public Node(T elem) {
            this.item = elem;
            this.next = null;
            this.prev = null;
        }

        public Node(T elem, Node next, Node previous) {
            this.item = elem;
            this.next = next;
            this.prev = previous;
        }

        public void displayNodeData() {
            System.out.println("{ " + item + " } ");
        }
    }

    public void addFirst(T elem) {
        Node newNode = new Node(elem);
        if (head == null) {
            head = newNode;
            head.prev = null;
            head.next = tail;
        } else {
            Node oldHead = head;
            head = newNode;
            head.prev = null;
            head.next = oldHead;
            oldHead.prev = newNode;
        }
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    public void addLast(T elem) {
        Node newNode = new Node(elem);
        if (tail == null) {
            tail = newNode;
            tail.prev = head;
            tail.next = null;
        } else {
            Node oldTail = tail;
            tail = newNode;
            tail.prev = oldTail;
            tail.next = null;
            oldTail.next = newNode;
        }
        if (head == null) {
            head = newNode;
        }
        size++;
    }

    public void addIndex(int index, T elem) {
        Node prevNode = head;
        Node nextNode ;
        if (index > size || index < 0) {
            throw new RuntimeException("OutOfIndex!");
        } else if (index == 0) {
            addFirst(elem);
        } else if (index == size) {
            addLast(elem);
        } else {
            for (int i = 0; i <= index-1; i++) {
                prevNode = prevNode.next;
            }
            Node newNode = new Node(elem);
            nextNode = prevNode.next;
            prevNode.next = newNode;
            newNode.prev = prevNode;
            newNode.next = nextNode;
        }

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }


    public void printForward() {
        System.out.println("Printing Doubly LinkedList (head --> tail) ");
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }

    public Node removeFirst() {
        if (size == 0) {
            throw new RuntimeException("DoublyLinkedList is empty!");
        }
        Node temp = head;
        head = temp.next;
        head.prev = null;
        size--;
        return temp;
    }

    public Node removeLast() {
        if (size == 0) {
            throw new RuntimeException("DoublyLinkedList is empty!");
        }
        Node temp = tail;
        tail = temp.prev;
        tail.next = null;
        size--;
        return temp;
    }

    // For printing Doubly Linked List forward
    public void printBackward() {
        System.out.println("Printing Doubly LinkedList (tail --> head) ");
        Node current = tail;
        while (current != null) {
            current.displayNodeData();
            current = current.prev;
        }
        System.out.println();
    }


}

