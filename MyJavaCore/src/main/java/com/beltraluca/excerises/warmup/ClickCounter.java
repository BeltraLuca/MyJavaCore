package com.beltraluca.excerises.warmup;

import java.awt.*;
import java.util.ArrayList;

public class ClickCounter {
    //default= tutti quelli dentro al package hanno accesso all'attributo
    //private= solo la classe ha accesso all'attributo
    //public=tutti hanno accesso all'attributo
    private int clicks;

    public ClickCounter() {
        this.clicks=0;
    }

    public int getvalue(){
        return  clicks;
    }

    public void click(){
        clicks+=1;
    }

    public void undo(){
        this.clicks=Math.max(0,clicks-1);
    }

    public void reset(){
        clicks=0;
    }

    @Override
    public String toString(){
        return "ClickCounter{"+"clicks="+clicks+"}";
    }


    public static void main(String[] args){
        ClickCounter cc1=new ClickCounter();

        ArrayList<Point> l1=new ArrayList<Point>();
        l1.add(new Point(1,2));
        l1.add(new Point(1,2));
        l1.add(new Point(1,2));

        //non copia l'oggetto copia le istanze
        ArrayList<Point> l2=(ArrayList)l1.clone();
        //con translate, java trasla la cella puntata dal primo elemento dell'array
        //di dieci celle x e di dieci y, essendo però l'elemento anche puntato da l1
        //anche il primo elemento di l1 viene traslato
        l2.get(0).translate(10,10);
        System.out.println(l1+"\n"+l2);
        l2.set(0,l1.get(2));
        l1.get(2).translate(13,10);
        System.out.println(l1+"\n"+l2);


    }

}


