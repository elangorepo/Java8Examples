package com.example.defaultMethod;

public class Sample implements ISample {
    @Override
    public void check() {
        System.out.println("first implementation");
    }

    @Override
    public void enforce() {
        System.out.println(" Implement for Sample Class");
    }


}
