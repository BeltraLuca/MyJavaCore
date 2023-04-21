package com.beltraluca.excerises.functional;
import java.util.List;
import java.util.Map;

public class JustPrint {

    public static <T> void justPrintList(List<T> l){
            l.forEach(t -> System.out.println("Hello "+t+"!"));
    }

    public static <E,T> void justPrintMap(Map<T,E> m){
        m.forEach((t, t2) -> System.out.println("k:"+t+", v:"+t2));
    }
}
