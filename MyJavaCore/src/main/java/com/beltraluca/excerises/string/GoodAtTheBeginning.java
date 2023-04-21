package com.beltraluca.excerises.string;

public class GoodAtTheBeginning {

    public static boolean goodAtTheBeginning(String string){
        if(string.length()<4){
            return false;
        }
        if(Character.toLowerCase(string.charAt(0))=='g')
            if(Character.toLowerCase(string.charAt(1))=='o')
                if(Character.toLowerCase(string.charAt(2))=='o')
                    if(Character.toLowerCase(string.charAt(3))=='d')
                        return true;
        return false;
    }
}
