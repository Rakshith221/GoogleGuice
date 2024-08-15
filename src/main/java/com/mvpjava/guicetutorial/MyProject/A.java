package com.mvpjava.guicetutorial.MyProject;
import com.google.inject.Inject;

public class A {
    public  B b;

    public A() {

    }

    @Inject
    public A(B b) {
        this.b = b;
    }

    // Additional methods here
}