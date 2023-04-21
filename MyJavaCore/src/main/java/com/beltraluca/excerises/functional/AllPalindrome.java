package com.beltraluca.excerises.functional;

import java.util.List;
import java.util.function.Predicate;

public class AllPalindrome {

    public static boolean isPalindrome(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }
    public static boolean allPalindrome(List<String> strings){
        return strings.stream().allMatch(AllPalindrome::isPalindrome);
    }
}
