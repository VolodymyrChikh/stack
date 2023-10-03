package org.stackk;

import java.io.PrintStream;

public class Stack {

    // array for elements of a stack
    private final double[] arr;
    // total capacity of the stack
    private final int capacity;
    // top of stack
    private int top;

    // Creating a stack
    Stack(int size) {
        arr = new double[size];
        capacity = size;
        top = -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(6);
        stack.push(56.);
        stack.push(48.);
        stack.push(5.);
        stack.push(1001.1);
        stack.push(150.023);
        System.out.println("\nPushed stack");
        stack.print();
        stack.pop();
        System.out.println("\nPopped stack");
        stack.print();

        if (stack.isEmpty()) {
            System.out.println("Stack is EMPTY");
        } else {
            System.out.println("Stack is NOT EMPTY");
        }
        System.out.println("Stack size: " + stack.size());
    }

    // push elements to the top of stack
    public void push(double x) {
        if (isFull()) {
            System.out.println("Stack is FULL");
            return;
        }
        arr[++top] = x;
    }

    // pop elements from top of stack
    public Double pop() {
        if (isEmpty()) {
            System.out.println("STACK is EMPTY");
            return null;
        }

        return arr[top--];
    }

    // return size of the stack
    public int size() {
        return top + 1;
    }

     public boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // print elements of stack
    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\b\b");
//        System.setOut(PrintStream());
    }
}