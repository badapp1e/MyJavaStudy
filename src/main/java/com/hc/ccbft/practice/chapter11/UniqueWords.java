package com.hc.ccbft.practice.chapter11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UniqueWords {
    public static void main(String[] args) {
        Set<Character> vowels = new HashSet<Character>();
        Collections.addAll(vowels,'a', 'e', 'i', 'o', 'u');

        Set<String> words = new HashSet<String>();
        Collections.addAll(words, "character", "collections");

        int totalCount = 0;
        for (String word : words
             ) {
            int count = 0;
            for (Character v : word.toCharArray()) {
                if (vowels.contains(v)) count++;
            }
            totalCount += count;
            System.out.println(word + " contains " + count + " vowels.");
        }
        System.out.println("Total contains " + totalCount + " vowels.");
    }
}
