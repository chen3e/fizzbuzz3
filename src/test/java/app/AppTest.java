package app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testFizz()
    {
        int expectedResult = 1;
        assertEquals(expectedResult, App.fizzbuzz(6, 6)[0]);
    }

    @Test
    public void testBuzz()
    {
        int expectedResult = 2;
        assertEquals(expectedResult, App.fizzbuzz(5, 15)[1]);
    }

    @Test
    public void testFizzBuzz()
    {
        int expectedResult = 3;
        assertEquals(expectedResult, App.fizzbuzz(-15, 15)[2]);
    }

    @Test
    public void testLucky()
    {
        int expectedResult = 2;
        assertEquals(expectedResult, App.fizzbuzz(1, 20)[3]);
    }

    @Test
    public void testIntegers()
    {
        int expectedResult = 10;
        assertEquals(expectedResult, App.fizzbuzz(1, 20)[4]);
    }
}
