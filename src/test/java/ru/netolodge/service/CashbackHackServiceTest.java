package ru.netolodge.service;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

   CashbackHackService service = new CashbackHackService();

    @Test
    public void validValue1() {
        service.remain(1);

        int actual = 999;
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void validValue999() {
        service.remain(999);

        int actual = 1;
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void boundaryValue500() {
        service.remain(500);

        int actual = 500;
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void boundaryValue() {
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}
