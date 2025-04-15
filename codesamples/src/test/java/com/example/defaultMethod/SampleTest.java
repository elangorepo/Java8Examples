package com.example.defaultMethod;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SampleTest {

    ISample test = new Sample();

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void newMethod() {
        System.out.println(test.newMethod());
    }

    @Test
    void check() {
        test.check();
    }

    @Test
    void enforce() {
        test.enforce();
    }
}