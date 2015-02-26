/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.string_calculator_with_test;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author boss
 */
public class StringCalculatorTest {

    private StringCalculator calc;

    public StringCalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        calc = new StringCalculator();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class StringCalculator.
     */
    @Test
    public void testAdd() {

    }

    @Test
    public void executeShouldReturnZeroIfEmptyString() {
        try {
            assertEquals(0, calc.add(""));
        } catch (NegativesNotAllowed ex) {
            Logger.getLogger(StringCalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void executeShouldReturnTheGivenNumber() {
        try {
            assertEquals(1, calc.add("1"));
            assertEquals(2, calc.add("2"));
        } catch (NegativesNotAllowed ex) {
            Logger.getLogger(StringCalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void executeShouldReturnSumOfTheGivenTwoNumbers() {
        try {
            assertEquals(3, calc.add("1,2"));
            assertEquals(14, calc.add("10,4"));
        } catch (NegativesNotAllowed ex) {
            Logger.getLogger(StringCalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void executeShouldReturnSumOfTheGivenNumbers() {
        try {
            assertEquals(10, calc.add("1,3,1,5"));
            assertEquals(35, calc.add("10,4,5,12,4"));
        } catch (NegativesNotAllowed ex) {
            Logger.getLogger(StringCalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void executeShouldReturnSumOfTheGivenNumbersWithSpecialDelimitters() {
        try {
            assertEquals(3, calc.add("1;2"));
            assertEquals(8, calc.add("3\n5"));
            assertEquals(6, calc.add("4\t2"));
            assertEquals(11, calc.add("6|5"));
        } catch (NegativesNotAllowed ex) {
            Logger.getLogger(StringCalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldThrowRuntimeExceptionWhenNegativesInTheString1() throws NegativesNotAllowed {
            exception.expect(NegativesNotAllowed.class);
            exception.expectMessage("-3,-5");
            calc.add("1,-3,2,-5");
    }
    
    @Test
    public void shouldThrowRuntimeExceptionWhenNegativesInTheString2() {
        try {
            calc.add("1,-3,2,-5");
            fail("failed to drop the exeption...");
        } catch (Exception ex) {
            System.out.println("ex: " + ex.getClass());
            System.out.println("msg: " + ex.getMessage());
            assertTrue(ex.getMessage().equals("-3,-5"));
        }
    }

}
