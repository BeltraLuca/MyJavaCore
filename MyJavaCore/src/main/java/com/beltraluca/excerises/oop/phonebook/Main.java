package com.beltraluca.excerises.oop.phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook[] tot=new PhoneBook[]{new PhoneBookArray(),new PhoneBookList()};
        Person p1=new Person("Beltrami","luca","3473224454");
        Person p2=new Person("Serrafini","Simone", "3485104985");

        for(int i=0;i<2;i++){
            tot[i].addPerson(p1);
            tot[i].addPerson(p2);
            System.out.println(tot[i].searchByLastname("Beltrami").toString());
            System.out.println(tot[i].searchByName("Simone").toString());
            System.out.println(tot[i].searchByNumber("3473224454").toString());
            tot[i].removePerson(p1);
            System.out.println(tot[i]+"\n\n\n");
        }

    }
}
