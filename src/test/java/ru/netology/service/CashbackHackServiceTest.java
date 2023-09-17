package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldAdvice100() {

        CashbackHackService cashback = new CashbackHackService();

        int amount = 1900;

        int expected = 100;
        int actual = cashback.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAdvice1000() {

        CashbackHackService cashback = new CashbackHackService();

        int amount = 0;

        int expected = 1000;
        int actual = cashback.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestZero() {

        CashbackHackService cashback = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = cashback.remain(amount);

        assertEquals(actual, expected);
    }
}