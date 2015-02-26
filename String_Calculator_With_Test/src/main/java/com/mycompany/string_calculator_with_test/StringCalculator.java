/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.string_calculator_with_test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author boss
 */
public class StringCalculator {

    public int add(String str) throws NegativesNotAllowed {
        if (str.isEmpty()) {
            return 0;
        }

        String negatives = "";
        Pattern p = Pattern.compile("-\\d+");
        Matcher m = p.matcher(str);
        while (m.find()) {
            negatives += m.group(0) + ",";

        }
        if (!negatives.isEmpty()) {            
            throw new NegativesNotAllowed(negatives.substring(0, negatives.lastIndexOf(',')));
        }
        Integer sum = 0;
        String[] numbers = str.split("[^-0123456789]");
        for (String number : numbers) {
            sum += Integer.valueOf(number);
        }

        return sum;
    }

}
