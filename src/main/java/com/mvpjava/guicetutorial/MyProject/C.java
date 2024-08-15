package com.mvpjava.guicetutorial.MyProject;
import com.google.inject.Inject;

public class C {
    public final A a;

    @Inject
    public C(A a) {
        this.a = a;
    }

    // Additional methods here
}
