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
public class JavaApplicationForGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Greeting greeting;
        
        // Checking arguments
        String lenguage = "ES";
        if ( args.length > 1 ) {
            lenguage = args[1];
        }
        
        greeting = new Greeting( new LenguageSelector( lenguage ));
        
        System.out.println( greeting.Greet() );                
    }
    
}
