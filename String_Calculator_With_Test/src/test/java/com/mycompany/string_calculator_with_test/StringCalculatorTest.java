/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.string_calculator_with_test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
        calc= new StringCalculator();
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
    public void executeShouldReturnZeroIfEmptyString(){
        assertEquals(0, calc.add(""));
    }
    
    @Test
    public void executeShouldReturnTheGivenNumber(){
        assertEquals(1, calc.add("1"));
        assertEquals(2, calc.add("2"));
    }
    
    @Test
    public void executeShouldReturnSumOfTheGivenTwoNumbers(){
        assertEquals(3, calc.add("1,2"));
        assertEquals(14, calc.add("10,4"));
    }
    
    @Test
    public void executeShouldReturnSumOfTheGivenNumbers(){
        assertEquals(10, calc.add("1,3,1,5"));
        assertEquals(35, calc.add("10,4,5,12,4"));
    }
    
    @Test
    public void executeShouldReturnSumOfTheGivenNumbersWithSpecialDelimitters(){
        assertEquals(3, calc.add("1;2"));
        assertEquals(8, calc.add("3\n5"));
        assertEquals(6, calc.add("4\t2"));
        assertEquals(11, calc.add("6|5"));
    }
}
