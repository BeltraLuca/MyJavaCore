package com.beltraluca.excerises.string;

public class GoodAroundTheBeginning {

    public static boolean goodAroundTheBeginning(String string){
        if(string.length()<4){
            return false;
        }
        if(Character.toLowerCase(string.charAt(0))=='g')
            if(Character.toLowerCase(string.charAt(1))=='o')
                if(Character.toLowerCase(string.charAt(2))=='o')
                    if(Character.toLowerCase(string.charAt(3))=='d')
                        return true;

        if(Character.toLowerCase(string.charAt(1))=='g')
            if(Character.toLowerCase(string.charAt(2))=='o')
                if(Character.toLowerCase(string.charAt(3))=='o')
                    if(Character.toLowerCase(string.charAt(4))=='d')
                        return true;
        return false;
    }
}
