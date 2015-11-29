package com.customsite.helloworld;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LoginTest
{
    // the variable name 'sut' stands for
    // system under test.  This is just a
    // coding convention and it refers to
    // the Object we will be testing.
    com.customsite.helloworld.Login sut = new com.customsite.helloworld.Login();

    @Test
    public void testValidUsernameAndPasswordCombination ()
    {
        boolean result = sut.isValidUsernameAndPassword("user3", "password");
        assertTrue(result);
    }

    @Test
    public void testHighLogin ()
    {
        boolean result = sut.isValidUsernameAndPassword ("user11", "password");
        assertTrue(!result);
    }

    @Test
    public void testLowLogin ()
    {
        boolean result = sut.isValidUsernameAndPassword("user0", "password");
        assertTrue(!result);
    }

    @Test
    public void testInvalidPassword ()
    {
        boolean result = sut.isValidUsernameAndPassword("user1", "Password");
        assertTrue(!result);
    }
}