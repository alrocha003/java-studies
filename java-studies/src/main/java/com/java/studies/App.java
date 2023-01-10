package com.java.studies;

import java.util.List;
import com.java.studies.models.Person;
import com.java.studies.repository.PersonRepository;

public class App {
    public static void main(String[] args) {
        System.out.println("GetPersons - List\n");

        useStreams();
    }

    private static Person[] getPersons() {

        Person[] persons = new Person[] {
                new Person("Alex Julio Lacerda Rocha", "Rua Almazia E Gataz"),
                new Person("Nadir Lacerda Rocha", "Rua Francisco H da rosa"),
                new Person("Tais Virissimo Rocha", "Rua Almazia Elias Gataz")
        };

        return persons;
    }

    private static void useStreams() {
        List<Person> persons = PersonRepository.getPersons();

        for (Person person : persons.stream().filter(person -> person.isActive()).toList())
            System.out.printf("Name: %s - Address: %s\n", person.getName(), person.getAddress());
    }


    private static void useFilter(){
        List<Person> persons = PersonRepository.getPersons();

        for (Person person : persons.stream().filter(person -> person.isActive()).toList())
            System.out.printf("Name: %s - Address: %s\n", person.getName(), person.getAddress());
    }
}
