package com.smallworldfs.challenge3;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class Solution {
//    Bob is about to go on a trip. But first he needs to take care of his supply of socks. Each sock has its own color. Bob wants to take as many pairs of clean socks as possible (both socks in the pair should be of the same color).
//    Socks are divided into two drawers: clean and dirty socks. Bob has time for only one laundry and his washing machine can clean at most K socks. He wants to pick socks for laundering in such a way that after washing he will have a maximal number of clean, same-colored pairs of socks. It is possible that some socks cannot be paired with any other sock, because Bob may have lost some socks over the years.
//    Bob has exactly N clean and M dirty socks, which are described in arrays C and D, respectively. The colors of the socks are represented as integers (equal numbers representing identical colors).
//    For example, given four clean socks and five dirty socks:
//        [IMAGE]
//    If Bob's washing machine can clean at most K = 2 socks, then he can take a maximum of three pairs of clean socks. He can wash one red sock and one green sock, numbered 1 and 2 respectively. Then he will have two pairs of red socks and one pair of green socks.
//    Write a function:
//        class Solution { public int solution(int K, int[] C, int[] D); }
//    that, given an integer K (the number of socks that the washing machine can clean), two arrays C and D (containing the color representations of N clean and M dirty socks respectively), returns the maximum number of pairs of socks that Bob can take on the trip.
//    For example, given K = 2, C = [1, 2, 1, 1] and D = [1, 4, 3, 2, 4], the function should return 3, as explained above.
//    Assume that:
//        K is an integer within the range [0..50];
//        each element of arrays C and D is an integer within the range [1..50];
//        C and D are not empty and each of them contains at most 50 elements.
//    In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

    public int solution(int K, int[] C, int[] D) {
        int result = 0;
        
        TreeMap<Integer, Integer> cleanSocks = getOrderedMap(C);
        TreeMap<Integer, Integer> dirtySocks = getOrderedMap(D);
        
        List<Integer> cleanLooseSocks = new LinkedList<>();
        for (Integer colour : cleanSocks.keySet()) {
            result += cleanSocks.get(colour) / 2;
            if (cleanSocks.get(colour) % 2 != 0) {
                cleanLooseSocks.add(colour);
            }
        }
        
        for (int i = 0; i < K; i++) {
            boolean sockAdded = false;
            
            for (int j = 0; j < cleanLooseSocks.size(); j++) {
                Integer looseSock = cleanLooseSocks.get(j);
                if (dirtySocks.containsKey(looseSock)) {
                    dirtySocks.merge(looseSock, -1, Integer::sum);
                    if (dirtySocks.get(looseSock) == 0) {
                        dirtySocks.remove(looseSock);
                    }
                    cleanLooseSocks.remove(looseSock);
                    sockAdded = true;
                    result++;
                    break;
                }
            }
            
            if (!sockAdded) {
                for (Integer colour : dirtySocks.keySet()) {
                    Integer count = dirtySocks.get(colour);
                    if (count > 1 && i+1 < K) {
                        dirtySocks.merge(colour, -2, Integer::sum);
                        i++;
                        result++;
                        break;
                    }
                }
            }
        }
        
        return result;
    }
    
    private TreeMap<Integer, Integer> getOrderedMap(int[] array) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (Integer colour : array) {
            map.merge(colour, 1, Integer::sum);
        }
        return map;
    }

}