package se.lexicon.dao;

import se.lexicon.model.Person;

import java.util.Collection;
import java.util.Collections;

public interface PersonDAO {
    Person persist(Person person);
    Person findById(int id);
    Person findByEmail(String email);
    Collection<Person> findAll();
    void remove(int id);
}
