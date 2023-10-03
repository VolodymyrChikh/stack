package org.stackk;

import java.util.Stack;

public class StackSTL {

    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        stack.push(56.);
        stack.push(48.);
        stack.push(5.);
        stack.push(1001.1);
        stack.push(564.56);
        System.out.println("\nPushed stack: " + stack + "\n");
        stack.pop();
        stack.pop();
        System.out.println("Popped stack: " + stack + "\n");
        double stackPeek = stack.peek();
        System.out.println("Stack Peek: " + stackPeek + "\n");

        if (stack.empty()){
            System.out.println("Stack is EMPTY");
        }else {
            System.out.println("Stack is not EMPTY");
        }
        System.out.println("\nStack size: " + stack.size() + "\n");
    }
}
