package com.beltraluca.excerises.functional;

import java.util.List;

public class SquareFive {

    public static long squareFive(List<Integer> nums){
        return nums.stream().map(integer -> integer*integer+10).filter(integer -> integer%10!=5).count();
    }
}
