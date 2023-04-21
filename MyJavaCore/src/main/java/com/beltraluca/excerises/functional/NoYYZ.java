package com.beltraluca.excerises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoYYZ {

    public static List<String> noYYZ(List<String> strings){
        return strings.stream().map(string -> string+"y" ).filter(string -> !string.contains("yy")).peek( s -> {
            if (s.startsWith("z")) {
                System.out.println(s);
            }}).collect(Collectors.toList());
    }
}
