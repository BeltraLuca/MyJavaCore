package com.beltraluca.excerises.functional;

import java.util.Map;

public class PayMore {

    public static void payMore(Map<String, Double> fees, String numberFamily, double costDelta){
        fees.replaceAll((s, aDouble) -> {
            if(s.startsWith(numberFamily)){
                return aDouble+costDelta;
            }
            return aDouble;
        });
    }
}
