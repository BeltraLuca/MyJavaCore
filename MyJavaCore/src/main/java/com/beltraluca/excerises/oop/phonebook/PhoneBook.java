package com.beltraluca.excerises.oop.phonebook;

public interface PhoneBook {

    public void addPerson(Person p);

    public void removePerson(Person p);

    public Person searchByLastname(String lastname);

    public Person searchByName(String name);

    public Person searchByNumber(String number);

}
