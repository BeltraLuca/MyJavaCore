package com.beltraluca.excerises.oop.reverse;

public class ReverserMain {
    public static void main(String[] args) {
        String string="ciao mondo";
        ReverserSlow ss=new ReverserSlow();
        ReverserFast sf=new ReverserFast();

        System.out.println("slow= "+ss.reverse(string)+"\nfast= "+sf.reverse(string));
    }
}
