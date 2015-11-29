package com.customsite.helloworld;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AccountTest
{
    // the variable name 'sut' stands for
    // system under test.  This is just a
    // coding convention and it refers to
    // the Object we will be testing.
    com.customsite.helloworld.Account sut = new com.customsite.helloworld.Account(100);

    @Test
    public void testGetBalance ()
    {
        int result = sut.getBalance();
        assertEquals(100, result);
    }

    @Test
    public void testAdd100 ()
    {
        sut.addMoney(100);
        int result = sut.getBalance();
        assertEquals(200, result);
    }

    @Test
    public void testAdd200 ()
    {
        sut.addMoney(200);
        int result = sut.getBalance();
        assertEquals(300, result);
    }

    @Test
    public void testRemove100 ()
    {
        sut.removeMoney(100);
        int result = sut.getBalance();
        assertEquals(0, result);
    }

    @Test
    public void testRemove101 ()
    {
        sut.removeMoney(101);
        int result = sut.getBalance();
        assertEquals(-1, result);
    }
}