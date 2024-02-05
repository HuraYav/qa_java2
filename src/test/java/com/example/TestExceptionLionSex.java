package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.mockito.Mockito;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestExceptionLionSex {
    String sex;

    public void TestLionSex(String sex) {
        this.sex = sex;

    }

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Хищник", false},
                {"Собака", false},
        };
    }

    @Test
    public void testExceptionSex() {
        Feline feline = Mockito.mock(Feline.class);
        Exception thrown = assertThrows(
                Exception.class,
                () -> new Lion(sex, feline)
        );
        assertTrue(thrown.getMessage().contains("Используйте допустимые значения пола животного - самец или самка"));
    }
}
