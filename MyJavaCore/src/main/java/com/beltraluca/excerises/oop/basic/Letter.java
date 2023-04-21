package com.beltraluca.excerises.oop.basic;

import java.util.ArrayList;

public class Letter {

    private String from;
    private String to;
    private ArrayList<String> lines;

    //supply the names of the sender and the recipient
    public Letter(String from, String to){
        this.from=from;
        this.to=to;
        lines=new ArrayList<String>();
    }

    //Supply a method to add a line of text to the body of the letter.
    public void addLine(String line){
        lines.add(line);
    }

    //Supply a method that returns the entire text of the letter.
    public String getText(){
        StringBuilder string=new StringBuilder();
        for(int i=0;i<lines.size();i++){
            string.append(lines.get(i));
        }
        return string.toString();
    }
}
