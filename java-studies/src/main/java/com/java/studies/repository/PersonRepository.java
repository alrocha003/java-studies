package com.java.studies.repository;

import java.util.Arrays;
import java.util.List;
import com.java.studies.models.Person;

public class PersonRepository {

    public static List<Person> getPersons() {
        List<Person> persons = Arrays.asList(
                new Person("Alex Rocha", "Backer Street"),
                new Person("Tais Virissimo", "Backer Street"),
                new Person("Manuela Virissimo Rocha", "Backer Street"),
                new Person("Bernardo Virissimo Rocha", "Backer Street", false),
                new Person("Bóris Virissimo Rocha", "Backer Street", false));

        return persons;
    }
}
