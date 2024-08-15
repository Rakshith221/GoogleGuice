
package com.mvpjava.guicetutorial.MyProject;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class ApplicationModule extends AbstractModule {

    @Override
    protected void configure() {
        // If needed, you can add bindings here
    }

    @Provides
    @Singleton
    public C provideSingletonC(A a) {
        return new C(a);
    }

    @Provides
    public A provideA() {
        return getA();
    }

    // @Provides
    // public B provideB() {
    //     return new B();
    // }

    @Provides
    public D provideD(C c) {
        return new D(c);
    }

    private A getA()
    {
        B bb = new B();
        bb.num = 6;
        A aa = new A();
        aa.b = bb;
        return aa; 
    }
}
