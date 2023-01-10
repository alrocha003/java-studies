package com.java.studies;

import com.java.studies.models.Person;

public class App {
    public static void main(String[] args) {
        System.out.println("GetPersons - List\n");
        
        for (Person person : getPersons()) {
            System.out.printf("Name: %s - Address: %s\n", person.getName(), person.getAddress());            
        }
    }

    private static Person[] getPersons() {

        Person[] persons = new Person[] {
                new Person("Alex Julio Lacerda Rocha", "Rua Almazia E Gataz"),
                new Person("Nadir Lacerda Rocha", "Rua Francisco H da rosa"),
                new Person("Tais Virissimo Rocha", "Rua Almazia Elias Gataz")
        };

        return persons;
    }
}
