package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {
    //ex.4

    @Test
    public void checkSumPositiveNumbers() {
        //Arrange
        Calculator calc = new Calculator();
        //Act
        int result = calc.sumOfTwo(3, 5);
        //Assert
        assertEquals(8, result);

    }

    @Test
    public void checkSumNegativeNumbers() {
        //Arrange
        Calculator calc = new Calculator();
        //Act
        int result = calc.sumOfTwo(-8, -2);
        //Assert
        assertEquals(-10, result);

    }

    @Test
    public void checkSubtractionPositiveNumbers() {
        //Arrange
        Calculator calc = new Calculator();
        //Act
        int result = calc.diffOfTwo(10, 1);
        //Assert
        assertEquals(9, result);

    }

    @Test
    public void checkSubtractionNegativeNumbers() {
        //Arrange
        Calculator calc = new Calculator();
        //Act
        int result = calc.diffOfTwo(-1, -1);
        //Assert
        //!!!!!!!!!!!!! math
        assertEquals(0, result);
    }

    @Test
    public void checkSubtractionDiffNumbersNegPos() {
        //Arrange
        Calculator calc = new Calculator();
        //Act
        int result = calc.diffOfTwo(-1, 14);
        //Assert
        assertEquals(-15, result);

    }
    @Test
    public void checkSubtractionDiffNumbersPosNeg() {
        //Arrange
        Calculator calc = new Calculator();
        //Act
        int result = calc.diffOfTwo(1, -1);
        //Assert
        assertEquals(2, result);

    }
}
