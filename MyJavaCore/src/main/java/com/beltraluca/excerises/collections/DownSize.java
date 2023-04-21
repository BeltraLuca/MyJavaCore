package com.beltraluca.excerises.collections;

import java.util.Iterator;
import java.util.List;

public class DownSize {

    public static void downsize(List<String> list, int n){
        int index=1;

        for(Iterator<String> i=list.iterator(); i.hasNext();){
            i.next();
            if(index%n==0){
                i.remove();
            }
            index++;
        }
    }
}
