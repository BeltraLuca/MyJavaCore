package com.beltraluca.excerises.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class JustPrintTest {

    @Test
    void justPrintList() {
        List<String> lista= List.of("Luca","Simone","Marco","Giulio");
        JustPrint.justPrintList(lista);
    }

    @Test
    void justPrintMap() {
        Map<Integer,String> mapp= Map.of(1,"ciao",2,"Sio",3,"mondo");
        JustPrint.justPrintMap(mapp);
    }
}