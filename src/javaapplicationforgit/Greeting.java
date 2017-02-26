/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationforgit;

/**
 *
 * @author Federico
 */
public class Greeting {
    private final LenguageSelector selector;
    private final String greetingEN = "Hello world!";
    private final String greetingES = "Hola mundo!";

    public Greeting(LenguageSelector selector) {
        this.selector = selector;
    }
    
    public String Greet() {
        return selector.getLeng().equals( "ES" )
                ? greetingES
                : greetingEN;
    }
}
