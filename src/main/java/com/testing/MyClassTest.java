package com.testing;

import org.junit.Test;

public class MyClassTest {
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testLaunchException() {
        MyClass mainClass = new MyClass();
        mainClass.launchException();
    }
}