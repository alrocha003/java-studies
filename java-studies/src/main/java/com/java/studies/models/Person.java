package com.java.studies.models;

public class Person {

    private String _name;
    private String _address;
    private Boolean _active;

    public Person(String name, String address) {
        super();
        this._name = name;
        this._address = address;
        this._active = true;
    }

    public Person(String name, String address, Boolean active) {
        super();
        this._name = name;
        this._address = address;
        this._active = active;
    }

    public String getName() {
        return this._name;
    }

    public String getAddress() {
        return this._address;
    }

    public Boolean isActive() {
        return this._active;
    }
}