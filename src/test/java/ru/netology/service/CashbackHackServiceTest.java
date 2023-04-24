package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void ifTheAmountIsZero() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int expected = 1000;
        int actual = CashbackHackService.remain(0);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void ifTheVaLueIsNotMultipleOfAThousandAndMoreThanOneThousand() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int expected = 214;
        int actual = CashbackHackService.remain(1786);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void ifTheVaLueIsMultipleOfAThousandAndMoreThanOneThousand() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int expected = 0;
        int actual = CashbackHackService.remain(5000);
        Assert.assertEquals(expected,actual);
    }
}
