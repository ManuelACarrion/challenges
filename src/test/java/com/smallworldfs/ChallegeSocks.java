package com.smallworldfs;

import com.smallworldfs.challenge3.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChallegeSocks {
    private final Solution solution = new Solution();

    @Test
    void test_1() {
        int[] cleanSocks = new int[] {1, 2, 1, 1};
        int[] dirtySocks = new int[] {1, 4, 3, 2, 4};
        assertEquals(3, solution.solution(2, cleanSocks, dirtySocks));
    }

    @Test
    void test_2() {
        int[] cleanSocks = new int[] {1, 2, 1, 1};
        int[] dirtySocks = new int[] {1, 4, 3, 2, 4};
        assertEquals(3, solution.solution(3, cleanSocks, dirtySocks));
    }

    @Test
    void test_3() {
        int[] cleanSocks = new int[] {1, 2, 1, 1};
        int[] dirtySocks = new int[] {1, 4, 3, 2, 4};
        assertEquals(4, solution.solution(4, cleanSocks, dirtySocks));
    }

    @Test
    void test_4() {
        int[] cleanSocks = new int[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int[] dirtySocks = new int[] {1, 2, 3, 4, 5};
        assertEquals(5, solution.solution(10, cleanSocks, dirtySocks));
    }

    @Test
    void test_5() {
        int[] cleanSocks = new int[] {1, 2};
        int[] dirtySocks = new int[] {8, 8, 8, 8, 9};
        assertEquals(1, solution.solution(3, cleanSocks, dirtySocks));
    }
}
