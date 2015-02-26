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
public class NegativesNotAllowed extends Exception {

    /**
     * Creates a new instance of <code>NegativesNotAllowed</code> without detail
     * message.
     */
    public NegativesNotAllowed() {
    }

    /**
     * Constructs an instance of <code>NegativesNotAllowed</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NegativesNotAllowed(String msg) {
        super(msg);
    }
}
