package com.beltraluca.excerises.oop.phonebook;

public class PhoneBookArray implements PhoneBook{

    private Person[] phoneBook;
    public int MAX_PERSONS;

    public PhoneBookArray() {
        this.MAX_PERSONS=256;
        this.phoneBook=new Person[this.MAX_PERSONS];
    }

    @Override
    public void addPerson(Person p) {
        for(int i=0;i<MAX_PERSONS;i++){
            if(phoneBook[i]==null){
                phoneBook[i]=p;
                break;
            }
        }
    }

    @Override
    public void removePerson(Person p) {
        for(int i=0;i<MAX_PERSONS;i++){
            if(phoneBook[i]!=null){
                if(phoneBook[i].equals(p)){
                    phoneBook[i]=null;
                    break;
                }
            }

        }
    }

    @Override
    public Person searchByLastname(String lastname) {
        for(int i=0;i<MAX_PERSONS;i++){
            if(phoneBook[i]!=null){
                if(lastname.equals(phoneBook[i].getLastname())){
                    return phoneBook[i];
                }
            }

        }
        return null;
    }

    @Override
    public Person searchByName(String name) {
        for(int i=0;i<MAX_PERSONS;i++){
            if(phoneBook[i]!=null){
                if(name.equals(phoneBook[i].getName())){
                    return phoneBook[i];
                }
            }

        }
        return null;
    }

    @Override
    public Person searchByNumber(String number) {
        for(int i=0;i<MAX_PERSONS;i++){
            if(phoneBook[i]!=null){
                if(number.equals(phoneBook[i].getPhone())){
                    return phoneBook[i];
                }
            }

        }
        return null;
    }
}
