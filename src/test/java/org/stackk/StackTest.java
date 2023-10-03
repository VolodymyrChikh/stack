package org.stackk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void pushTesting1() {
        Stack stack = new Stack(5);
        stack.push(56.);
        stack.push(48.);
        stack.push(5.);
        stack.push(1001.1);
        stack.push(150.023);
        assertEquals(5, stack.size());

    }
    @Test
    public void popTesting1() {
        Stack stack = new Stack(5);
        stack.push(56.);
        stack.push(48.);
        stack.push(5.);
        stack.push(1001.1);
        stack.push(150.023);
        double poppedNumber = stack.pop();
        assertEquals(150.023, poppedNumber);
        assertEquals(4, stack.size());
    }

    @Test
    public void isFullTesting1() {
        Stack stack = new Stack(5);
        stack.push(56.);
        stack.push(48.);
        stack.push(5.);
        stack.push(1001.1);
        stack.push(150.023);
        assertTrue(stack.isFull());
    }

    @Test
    public void isEmptyTesting1() {
        Stack stack = new Stack(0);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void sizeTesting1() {
        Stack stack = new Stack(5);
        stack.push(56.);
        stack.push(48.);
        stack.push(5.);
        stack.push(1001.1);
        stack.push(150.023);
        assertEquals(5, stack.size());
    }

    @Test
    void pushTesting2() {
        Stack stack = new Stack(6);
        stack.push(56.);
        stack.push(48.);
        stack.push(5.);
        stack.push(1001.1);
        stack.push(150.023);
        stack.push(111.);
        assertEquals(6, stack.size());

    }
    @Test
    public void popTesting2() {
        Stack stack = new Stack(1);
        stack.push(56.);
        double poppedNumber = stack.pop();
        assertEquals(56., poppedNumber);
        assertEquals(0, stack.size());
    }

    @Test
    public void isFullTesting2() {
        Stack stack = new Stack(5);
        stack.push(56.);
        stack.push(48.);
        stack.push(5.);
        stack.push(1001.1);
        stack.push(150.023);
        assertTrue(stack.isFull());
    }

    @Test
    public void isEmptyTesting2() {
        Stack stack = new Stack(0);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void sizeTesting2() {
        Stack stack = new Stack(0);
        assertEquals(0, stack.size());
    }

/*
    @Test
    void print() {
        Stack stack = new Stack(5);
        stack.push(56.);
        stack.push(48.);
        stack.push(5.);
        stack.push(1001.1);
        stack.push(150.023);
        String expectedOutput = "56.0, 48.0, 5.0, 1001.1, 150.023";
        assertThat(expectedOutput, is(stack.print()));
    }*/

}