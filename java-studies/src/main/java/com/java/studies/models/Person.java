package com.java.studies.models;

public class Person {
    
    private String _name;
    private String _address;

    public Person(String name, String address) {
        super();
        this._name = name;
        this._address = address;
    }

    public String getName() {
        return this._name;
    }

    public String getAddress() {
        return this._address;
    }

}