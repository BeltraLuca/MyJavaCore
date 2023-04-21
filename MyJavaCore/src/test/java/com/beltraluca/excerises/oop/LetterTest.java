package com.beltraluca.excerises.oop;

import com.beltraluca.excerises.oop.basic.Letter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterTest {
private Letter l1=new Letter("luca","simone");
    @Test
    void addLine() {
        l1.addLine("Dear recipient name: ");
        l1.addLine("blank line");
        assertEquals(l1.getText(),"Dear recipient name: blank line");
    }

}