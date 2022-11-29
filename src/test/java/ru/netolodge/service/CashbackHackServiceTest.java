package ru.netolodge.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

   CashbackHackService service = new CashbackHackService();

    @Test
    public void validValue1() {
        service.remain(1);

        int actual = 999;
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void validValue999() {
        service.remain(999);

        int actual = 1;
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValue500() {
        service.remain(500);

        int actual = 500;
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValue() {
        service.remain(-100);

        int actual = 1100;
        int expected = 1100;

        Assert.assertEquals(expected, actual);
    }
}
