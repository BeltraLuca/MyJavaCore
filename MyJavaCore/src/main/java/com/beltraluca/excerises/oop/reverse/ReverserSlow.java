package com.beltraluca.excerises.oop.reverse;

public class ReverserSlow implements Reverser{

    public ReverserSlow(){

    }

    @Override
    public String reverse(String string) {
        char[] res=new char[string.length()];
        int index=0;
        for(int i=string.length()-1;i>=0;i--){
            res[index]=string.charAt(i);
            index++;
        }
        return String.valueOf(res);
    }
}
