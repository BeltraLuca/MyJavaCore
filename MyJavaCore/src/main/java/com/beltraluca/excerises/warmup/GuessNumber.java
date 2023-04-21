package com.beltraluca.excerises.warmup;

import java.util.Arrays;

public class GuessNumber {
    public static final int size=10;
    public static void main(String[] args) {

        boolean a=true;
        int c=3;
        int b=4;

        //if else
        if(c>4){

        }else if(c>10){

        }else{

        }

        //switch case nuovo metodo
        switch(b){
            case 1->System.out.println("ciao");
            case 2->System.out.println("ciao");
            case 3->System.out.println("ciao");
            case 4 ->System.out.println("ciao");
        }

        //for
        int i=0;
        for(i=0;i<10;i++){
            System.out.println("ciao");
        }

        //dato un vettore il for permette di inserire in n ogni elemento di v quindi fa tanti cicli quanti gli elementi di v
        int[] v={0,1,2,3,4,5,6,7,8,9,10};

        for(int n:v){
            System.out.println(n);
        }

        //il vettore/array è pur sempre un oggetto di conseguenza ci sono metodi legati ad esso
        while(b<v.length){
            b++;
            System.out.println(v[b]);
        }

        //do while, la prima esecuzione è garantita
        do{

        }while(b<v.length);


        //gli Array, due modi per definirli
        int[] vec = new int[size];
        int[] vec1={1,2,3,4,5,6};

        Arrays.fill(vec1,2);
        System.out.println(Arrays.toString(vec1));


    }
}
