package com.mvpjava.guicetutorial.MyProject;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ApplicationModule());

        D dInstance1 = injector.getInstance(D.class);
        D dInstance2 = injector.getInstance(D.class);

        // Both should refer to the same instance of C
        System.out.println(dInstance1.c.a.equals(dInstance2.c.a));
    }
}
