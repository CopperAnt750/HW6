package com;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> st1 = new Stack<>();
        System.out.println(st1.isEmpty());
        st1.push(1);
        System.out.println(st1.isEmpty());
        st1.push(2);
        System.out.println(st1.isEmpty());
//        System.out.println(st1.modCount);
        st1.push(3);

        System.out.println("Stack is:" + st1);
        System.out.println("Size:" + st1.size());
        System.out.println("Last eleme is" +st1.pop());
        System.out.println("Stack is:" + st1);
    }
}
