package com;

import java.util.Arrays;

public class Stack<T> {

    private T[] capacity;
    public int modCount;

    public Stack() {
        this.capacity = (T[]) new Object[0];
    }

    public int size() {
        return capacity.length;
    }

    public T[] push(T element) {
        T[] newArray = Arrays.copyOf(capacity, size() + 1);
        capacity = newArray;
        capacity[capacity.length - 1] = element;
        modCount++;
        return newArray;
    }

    public T pop() {
        T temp = capacity[size() - 1];
        T[] newArray = Arrays.copyOf(capacity, size() - 1);
        capacity = newArray;
        modCount--;
        return temp;
    }

    public boolean isEmpty() {
        if (modCount  == 0) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Stack{" +
                Arrays.toString(capacity) +
                '}';
    }
}
