
package com.mvpjava.guicetutorial.MyProject;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Scopes;
import com.google.inject.Singleton;

public class ApplicationModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(C.class).in(Scopes.SINGLETON);
    }
}
