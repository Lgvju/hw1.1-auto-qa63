package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTestJunit4 {

    @Test
    public void shouldAdvice100() {

        CashbackHackService cashback = new CashbackHackService();

        int amount = 1900;

        int expected = 100;
        int actual = cashback.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAdvice1000() {

        CashbackHackService cashback = new CashbackHackService();

        int amount = 0;

        int expected = 1000;
        int actual = cashback.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestIf1700() {

        CashbackHackService cashback = new CashbackHackService();

        int amount = 1700;

        int expected = 300;
        int actual = cashback.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestZero() {

        CashbackHackService cashback = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = cashback.remain(amount);

        assertEquals(expected, actual);
    }
}
