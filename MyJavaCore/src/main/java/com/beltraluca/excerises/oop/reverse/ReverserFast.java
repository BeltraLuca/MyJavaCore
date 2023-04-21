package com.beltraluca.excerises.oop.reverse;

public class ReverserFast implements Reverser{

    public ReverserFast() {
    }

    @Override
    public String reverse(String string) {
        StringBuilder res=new StringBuilder().append(string);
        return res.reverse().toString();

    }
}
