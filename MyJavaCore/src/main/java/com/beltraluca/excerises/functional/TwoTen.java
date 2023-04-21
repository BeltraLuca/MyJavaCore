package com.beltraluca.excerises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class TwoTen {

    public static List<Integer> twoTwo(List<Integer> nums){
        return nums.stream().map(integer -> integer*2).filter(integer -> integer%10!=2).collect(Collectors.toList());
    }
}
