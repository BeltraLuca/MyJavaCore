package com.beltraluca.excerises.oop.phonebook;

import com.sun.jdi.Location;
import com.sun.jdi.ObjectReference;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.event.ExceptionEvent;
import com.sun.jdi.request.EventRequest;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{

    private ArrayList<Person> phoneBook;
    public int MAX_PERSONS;

    public PhoneBookList() {
        this.phoneBook=new ArrayList<>();
        this.MAX_PERSONS=256;
    }

    @Override
    public void addPerson(Person p) {
        if(phoneBook.size()<=MAX_PERSONS){
            phoneBook.add(p);
        }

    }

    @Override
    public void removePerson(Person p) {
        phoneBook.remove(p);
    }

    @Override
    public Person searchByLastname(String lastname) {
        for(int i=0;i<phoneBook.size();i++){
            if(lastname.equals(phoneBook.get(i).getLastname())){
                return phoneBook.get(i);
            }
        }
        return null;
    }

    @Override
    public Person searchByName(String name) {
        for(int i=0;i<phoneBook.size();i++){
            if(name.equals(phoneBook.get(i).getName())){
                return phoneBook.get(i);
            }
        }
        return null;
    }

    @Override
    public Person searchByNumber(String number) {
        for(int i=0;i<phoneBook.size();i++){
            if(number.equals(phoneBook.get(i).getPhone())){
                return phoneBook.get(i);
            }
        }
        return null;
    }
}
