package org.example;

import org.junit.Test;

public class SimpleMathLibraryTest {
    @Test
    public void testAdd() {
        SimpleMathLibrary math = new SimpleMathLibrary();
        double result = math.add(2.0, 3.0);
        if (result == 5.0) {
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }

    @Test
    public void testMinus() {
        SimpleMathLibrary math = new SimpleMathLibrary();
        double result = math.minus(5.0, 3.0);
        if (result == 2.0) {
            System.out.println("OK");
        } else {
            System.out.println("NOK");
        }
    }
}