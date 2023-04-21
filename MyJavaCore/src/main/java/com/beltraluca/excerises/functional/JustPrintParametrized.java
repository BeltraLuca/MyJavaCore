package com.beltraluca.excerises.functional;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class JustPrintParametrized {

    public static <T> void justPrintList(List<T> l, Consumer<? super T> c){
        l.forEach(c);
    }

    public static <E,T> void justPrintMap(Map<T,E> m, BiConsumer<? super T, ? super E> b){
        m.forEach(b);
    }
}

