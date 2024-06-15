package com.lab;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;


public class LabBlackTest {

    @BeforeClass
    public static void setup() {
        Lab.process(".\\text.txt");
    }

    @Test
    public void test1() {
        String expected = "The length of the shortest path is 1.";
        System.out.println("Expected result: " + expected);
        String actual = Lab.calcShortestPath("sun", "life");
        System.out.println("Actual result: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String expected = "Please input two non-empty words!";
        System.out.println("Expected result: " + expected);
        String actual = Lab.calcShortestPath("sun", "");
        System.out.println("Actual result: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String expected = "Please input valid words!";
        System.out.println("Expected result: " + expected);
        String actual = Lab.calcShortestPath("sun", "a23");
        System.out.println("Actual result: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        String expected = "Please input two different words!";
        System.out.println("Expected result: " + expected);
        String actual = Lab.calcShortestPath("sun", "sun");
        System.out.println("Actual result: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        String expected = "No \"apple\" and \"banana\" in the graph!";
        System.out.println("Expected result: " + expected);
        String actual = Lab.calcShortestPath("apple", "banana");
        System.out.println("Actual result: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        String expected = "No \"apple\" in the graph!";
        System.out.println("Expected result: " + expected);
        String actual = Lab.calcShortestPath("apple", "sun");
        System.out.println("Actual result: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        String expected = "No \"banana\" in the graph!";
        System.out.println("Expected result: " + expected);
        String actual = Lab.calcShortestPath("sun", "banana");
        System.out.println("Actual result: " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        String expected = "No path from \"star\" to \"of\"!";
        System.out.println("Expected result: " + expected);
        String actual = Lab.calcShortestPath("star", "of");
        System.out.println("Actual result: " + actual);
        assertEquals(expected, actual);
    }
}