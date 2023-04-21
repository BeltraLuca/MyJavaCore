package com.beltraluca.excerises.collections;

import java.util.*;

public class Reverse {

    public static List<String> reverse(List<String> sentence){
        Deque<String> temp=new ArrayDeque<String>();
        List<String> res=new ArrayList<>();

        for(String word:sentence){
            temp.addLast(word);
        }

        while(temp.size()>0){
            res.add(temp.pollLast());
        }
        return res;

    }
}
