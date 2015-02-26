/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.string_calculator_with_test;

/**
 *
 * @author boss
 */
public class StringCalculator {
    
    public int add(String str){
        if (str.isEmpty()){
            return 0;
        }        
        Integer sum =0;
        String[] numbers = str.split("[^-0123456789]");
        for (String number : numbers) {
            sum += Integer.valueOf(number);
        }
        
        return sum;
    }
    
}
