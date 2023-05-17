package com.testing;

public class MyClass {
    public void launchException() {
        int[] array = new int[10];
        System.out.println(array[10]);  // Esto lanzará ArrayIndexOutOfBoundsException
    }
}
