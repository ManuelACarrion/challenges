package com.smallworldfs;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.smallworldfs.challenge1.ChallengeAnagrams;
import org.junit.jupiter.api.Test;

public class ChallengeAnagramsTest {

    private final ChallengeAnagrams challengeAnagrams = new ChallengeAnagrams();

    @Test
    void challengeAreAnagrams() {
        assertFalse(challengeAnagrams.areAnagrams(null, null));
        assertFalse(challengeAnagrams.areAnagrams("", ""));
        assertFalse(challengeAnagrams.areAnagrams("", "omg"));
        assertFalse(challengeAnagrams.areAnagrams("testeando", "testeando"));
        assertFalse(challengeAnagrams.areAnagrams("hola", "adios"));
        assertFalse(challengeAnagrams.areAnagrams("Aparcamiento", "Metacarpiano"));
        assertTrue(challengeAnagrams.areAnagrams("Animal", "Lámina"));
    }

}
