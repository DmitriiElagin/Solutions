/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmitrii.elagin;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

/**
 *
 * @author Dmitry
 */
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        StringBuilder builder = new StringBuilder();
        
        String[] words = morseCode.trim().split("\\s\\s\\s");
        
        for (String word : words) {
            String[] letters = word.split("\\s");
           
           for (String letter : letters) {
              builder.append(MorseCode.get(letter));
            }
            builder.append(" ");
        }
      return builder.toString().trim();
    }
}
