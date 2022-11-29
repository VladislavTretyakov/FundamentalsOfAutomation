package ru.netolodge.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

   CashbackHackService service = new CashbackHackService();

    @Test
    public void validValue1() {
        int actual = service.remain(1);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void validValue999() {
        int actual = service.remain(999);;
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValue500() {
        int actual = service.remain(500);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValue() {
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}
