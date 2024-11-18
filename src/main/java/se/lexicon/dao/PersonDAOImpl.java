package se.lexicon.dao;

import se.lexicon.model.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class PersonDAOImpl implements PersonDAO {

    private Collection<Person> persons = new HashSet<>();

    @Override
    public Person persist(Person person){
        persons.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
        for (Person person : persons) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        for (Person person : persons) {
            if (person.getEmail().equals(email)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return persons;
    }

    @Override
    public void remove(int id) {
        for (Person person : persons) {
            if (person.getId() == id) {
                persons.remove(person);
                System.out.println("Person removed");
            }
        }

    }


}
