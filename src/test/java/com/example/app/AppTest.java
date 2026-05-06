package com.example.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testGreetValidName() {

        String expected =
                "Hello, Student! Welcome to Advanced Maven CI/CD Demo.";

        String actual = App.greet("Student");

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGreetEmptyName() {

        App.greet("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGreetNullName() {

        App.greet(null);
    }
}
