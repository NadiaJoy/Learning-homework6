package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

//    @Test
// public void shouldAnswerWithTrue()
// {
//     assertTrue( true );
// }

    @Test
    public void checkSumming()
    {
        //Arrange
        Calculator calc = new Calculator();
        //Act
        int result = calc.sumOfTwo(3, 5);
        //Assert
        assertEquals(8, result);

    }
}
