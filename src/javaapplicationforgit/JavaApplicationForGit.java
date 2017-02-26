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
        String greeting;
        
        // Checking arguments
        if ( args.length > 1 ) {
            greeting = args[1];
        } else {
            greeting = "Hello world!";
        }
        
        System.out.println( greeting );                
    }
    
}
