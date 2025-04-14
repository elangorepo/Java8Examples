package com.example.defaultMethod;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    public void Check()
    {
        Sample test = new Sample();
        test.check();

    }
}
