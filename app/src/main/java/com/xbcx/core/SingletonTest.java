package com.xbcx.core;

/**
 * Created by Administrator on 11/30/2017.
 */

public final class SingletonTest {
    private static final SingletonTest ourInstance = new SingletonTest();

    public static SingletonTest getInstance() {
        return ourInstance;
    }

    private SingletonTest() {
    }
}
