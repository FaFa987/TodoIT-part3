package se.lexicon.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.lexicon.model.Person;
import se.lexicon.sequencers.PersonSequencer;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class PersonDAOTest {
    private PersonDAO personDAO;
    @BeforeEach
    void setUp() {
        personDAO = new PersonDAOImpl();
    }

    @Test
    void testPersistAndFindByIg() {
        Person person1 = new Person(PersonSequencer.nextId(),"John","Will","john@will.com");
        Person person2 = new Person(PersonSequencer.nextId(),"Fafa","fafa","Fafa@fafa.com");
        personDAO.persist(person1);
        personDAO.persist(person2);
        Person foundPerson1 = personDAO.findById(1);
        Person foundPerson2 = personDAO.findById(2);
        assertEquals(person1,foundPerson1);
        assertEquals(person2,foundPerson2);
        Collection<Person> foundPersons = personDAO.findAll();
        assertTrue(foundPersons.contains(person1));
        assertEquals(foundPersons.size(),2);
        personDAO.remove(1);
        foundPersons = personDAO.findAll();
        assertTrue(foundPersons.contains(person2));
        assertEquals(foundPersons.size(),1);
        System.out.println(person2.getId());

    }

    @Test
    void findByEmail() {
    }

    @Test
    void findAll() {
    }

    @Test
    void remove() {
    }
}