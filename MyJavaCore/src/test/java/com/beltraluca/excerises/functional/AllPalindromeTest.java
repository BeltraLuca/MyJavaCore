package com.beltraluca.excerises.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllPalindromeTest {

    @Test
    void allPalindrome() {
        List<String> string=new ArrayList<>(List.of("kayak", "hello"));
        System.out.println(AllPalindrome.allPalindrome(string));
    }
}