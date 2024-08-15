package com.mvpjava.guicetutorial.MyProject;
import com.google.inject.Inject;

public class C {
    public final A a;

    @Inject
    public C(E e) {
        this.a = getA(e);
    }
    
    public A getA(E e)
    {
        B b = new B();
        b.num = e.Enumber;
        A a = new A();
        a.b = b; 
        return a;
    }

    // Additional methods here
}
