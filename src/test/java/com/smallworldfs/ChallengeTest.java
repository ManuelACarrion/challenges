package com.smallworldfs;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ChallengeTest {

    private final Challenge challenge = new Challenge();

    @Test
    void test_engine_works() {
        assertFalse(challenge.areAnagrams(null, null));
        assertFalse(challenge.areAnagrams("", ""));
        assertFalse(challenge.areAnagrams("", "omg"));
        assertFalse(challenge.areAnagrams("testeando", "testeando"));
        assertFalse(challenge.areAnagrams("hola", "adios"));
        assertFalse(challenge.areAnagrams("Aparcamiento", "Metacarpiano"));
        assertTrue(challenge.areAnagrams("Animal", "Lámina"));
    }
}
