package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class CashbackHackServiceTest {
    @Test
    public void ifTheAmountIsZero() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int expected = 1000;
        int actual = CashbackHackService.remain(0);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ifTheVaLueIsNotMultipleOfAThousandAndMoreThanOneThousand() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int expected = 214;
        int actual = CashbackHackService.remain(1786);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ifTheVaLueIsMultipleOfAThousandAndMoreThanOneThousand() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int expected = 0;
        int actual = CashbackHackService.remain(5000);
        Assert.assertEquals(actual, expected);
    }
}
