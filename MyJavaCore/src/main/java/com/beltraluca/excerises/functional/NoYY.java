package com.beltraluca.excerises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {

    public static List<String> noYY(List<String> strings){
        return strings.stream().map(string -> string+"y" ).filter(string -> !string.contains("yy")).collect(Collectors.toList());
    }
}
