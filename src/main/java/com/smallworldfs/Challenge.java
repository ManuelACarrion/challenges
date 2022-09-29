package com.smallworldfs;

import org.apache.commons.lang3.StringUtils;

public class Challenge {
    /**
     * Escribe una función que reciba dos String y retorne true o false según sean o no anagramas:
     *  - Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
     *  - NO hace falta comprobar que ambas palabras existan.
     *  - Dos palabras exactamente iguales no son anagrama.
     */
    public boolean areAnagrams(String word1, String word2) {
        if(word1 == null || word2 == null) {
            return false;
        }
        word1 = StringUtils.stripAccents(word1.trim().toUpperCase());
        word2 = StringUtils.stripAccents(word2.trim().toUpperCase());
        
        if(word1.equals(word2) || word1.length() != word2.length() || !isAllCharactersReordered(word1, word2)) {
            return false;
        }
        
        while(!word1.isEmpty()) {
            String firstChar = String.valueOf(word1.charAt(0));
            word1 = word1.replaceAll(firstChar, "");
            word2 = word2.replaceAll(firstChar, "");
            if (word1.length() != word2.length()) {
                return false;
            }
        }
        return true;
    }

    private boolean isAllCharactersReordered(String word1, String word2) {
        for(int i=0; i<word1.length(); i++) {
            if (word1.charAt(i) == word2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
