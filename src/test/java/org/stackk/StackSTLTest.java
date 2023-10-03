package org.stackk;

import java.util.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackSTLTest {
    @Test
    void pushTesting1() {
        Stack<Double> stack = new Stack<>();
        stack.push(56.);
        stack.push(48.);
        stack.push(5.);
        stack.push(1001.1);
        stack.push(564.56);
        assertEquals(5, stack.size());

    }
    @Test
    public void popTesting1() {
        Stack<Double> stack = new Stack<>();
        stack.push(56.);
        stack.push(48.);
        stack.push(5.);
        stack.push(1001.1);
        stack.push(564.56);
        double poppedNumber = stack.pop();
        assertEquals(564.56, poppedNumber);
        assertEquals(4, stack.size());
    }

    @Test
    public void isEmptyTesting1() {
        Stack<Double> stack = new Stack<>();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void peekTesting1(){
        Stack<Double> stack = new Stack<>();
        stack.push(56.);
        stack.push(48.);
        stack.push(5.);
        stack.push(1001.1);
        stack.push(564.56);
        double stackPeek = stack.peek();
        assertEquals(564.56, stackPeek);
    }

    @Test
    public void sizeTesting1(){
        Stack<Double> stack = new Stack<>();
        stack.push(56.);
        stack.push(48.);
        stack.push(5.);
        stack.push(1001.1);
        stack.push(564.56);
        stack.pop();
        stack.pop();
        assertEquals(3, stack.size());
    }


}