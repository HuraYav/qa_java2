package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFeline {
    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittens2() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens(1));
    }
}
