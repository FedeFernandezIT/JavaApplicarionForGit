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
public class LenguageSelector {
    private final String leng;

    public LenguageSelector() {
        this( "ES" );
    }       
    
    public LenguageSelector(String leng) {
        if ( leng.equals( "ES" ) ) {
            this.leng = leng;
        } else {
            this.leng = "ES";
        }
    }

    public String getLeng() {
        return leng;
    }
            
}
