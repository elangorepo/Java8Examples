package com.example.defaultMethod;

public class AnotherSample implements ISample {
    @Override
    public void check() {
        System.out.println("Another Implementation");
    }

    @Override
    public void enforce() {

        System.out.println("Implementing for another sample");
    }
}
