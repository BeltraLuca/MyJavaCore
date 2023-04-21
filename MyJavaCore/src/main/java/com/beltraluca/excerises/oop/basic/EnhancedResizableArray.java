package com.beltraluca.excerises.oop.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class EnhancedResizableArray {

    private int[] v;
    public EnhancedResizableArray() //creating an empty resizable array (the underlying int[] has a default capacity).
    {
        this.v=new int[100];
    }
    public void add(int value) //adding an element at the end of the array.
    {
       int[] newArr=Arrays.copyOf(v,v.length+1);
       newArr[v.length]=value;
       v=newArr;

    }
    public void remove(int index) //removing the element at the specified index.
    {
        int[] newArr=new int[v.length-1];
        int ind=0;
        for(int i=0;i<v.length;i++){
            if(i==index) continue;
            newArr[ind]=v[i];
            ind++;
        }
        v=newArr;

    }
    public int get(int index) //returning the element at the specified index.
    {
        return v[index];
    }
    public void set(int index, int value) //setting the element at the specified index with value.
    {

        v[index]=value;


    }
    public boolean contains(int value) //returning true if the specified value is contained within the array.
    {
        for(int i:v){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public int size() //returning the capacity of the array.
    {
        return v.length;
    }
    public int[] toArray() //returning a copy of the internal array.
    {
        return Arrays.copyOf(v,v.length);
    }

}
