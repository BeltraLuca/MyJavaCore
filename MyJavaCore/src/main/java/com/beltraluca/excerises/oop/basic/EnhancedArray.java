package com.beltraluca.excerises.oop.basic;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class EnhancedArray {

    private int[] v;
    public EnhancedArray(int capacity) //creating a new array of the specified capacity
    {
        this.v =new int[capacity];
    }
    public int size() //returning the capacity of the array
    {
        return v.length;
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
        for(int i: v){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public void resetZero() //setting all the elements to 0.
    {
        Arrays.fill(v, 0);
    }
    public void resetRandom() //setting all the elements to random values between [0, size()].
    {
        RandomGenerator r1=RandomGenerator.getDefault();
        for(int i = 0; i< v.length; i++){
            v[i]=r1.nextInt(0,size());
        }
    }
    public int[] toArray() //returning a copy of the internal array.
    {
        return Arrays.copyOf(v,v.length);
    }

}
