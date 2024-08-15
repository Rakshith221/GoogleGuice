package com.mvpjava.guicetutorial.MyProject;
import com.google.inject.Inject;

public class D {
    public final C c;

    @Inject
    public D(C c) {
        this.c = c;
    }

    // Additional methods here
}
