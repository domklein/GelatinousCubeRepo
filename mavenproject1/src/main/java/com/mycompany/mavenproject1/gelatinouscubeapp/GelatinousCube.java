/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.gelatinouscubeapp;
import java.util.Random;
/**
 *
 * @author Dom
 */
public class GelatinousCube {
    final String width = "VERY WIDE";
    final String annoying = "EXTREMELY";
    static final int OUTPUT_STRING_LENGTH = 20;
    static int pissOffOMeter = 0;
    static final int maxPissedOff = 18;
    private static String getNextRandomString(String strAllowedCharacters, Random random) {
        
        StringBuilder sbRandomString = new StringBuilder(OUTPUT_STRING_LENGTH);
        
        for(int i = 0 ; i < OUTPUT_STRING_LENGTH; i++){
            
            //get random integer between 0 and string length
            int randomInt = random.nextInt(strAllowedCharacters.length());
            
            //get char from randomInt index from string and append in StringBuilder
            sbRandomString.append( strAllowedCharacters.charAt(randomInt) );
        }
        
        return sbRandomString.toString();
        
    }
    
    public static void main(String args[]) {
        String strAllowedCharacters = "I seek iBright Statistics for last month";
        System.out.println("'I seek iBright Statistics for last month'");
        System.out.println("");
    //initialize Random
        Random random = new Random();
        
        System.out.println("Certainly - here is the information you seek:");
        for(int i=0; i<20; i++){
            System.out.println( getNextRandomString(strAllowedCharacters, random) );
            pissOffOMeter++;
            System.out.println("PissOffOMeter = "+pissOffOMeter);
            if (pissOffOMeter >= maxPissedOff) 
                System.out.println("MAXIMUM PISSED OFF ALERT !");
        }
        
    }
    
}
