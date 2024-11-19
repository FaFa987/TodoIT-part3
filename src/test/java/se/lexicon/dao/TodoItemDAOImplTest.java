package se.lexicon.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.lexicon.model.Person;
import se.lexicon.model.TodoItem;

import java.time.LocalDate;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemDAOImplTest {

    private TodoItemDAO todoItemDAO;
    @BeforeEach
    void setUp() {
        todoItemDAO = new TodoItemDAOImpl();
    }

    @Test
    void findAllByDoneStatus() {
    }

    @Test
    void findByDeadlineBefore() {
        Person person1 = new Person(1, "Ali", "KH","df@gr.se");
        Person person2 = new Person(2, "Ali", "KH","df@gr.se");
        TodoItem todoItem11 = new TodoItem(LocalDate.parse("2024-11-20"), true, person1);
        TodoItem todoItem12 = new TodoItem(LocalDate.parse("2024-11-18"), true, person1);
        TodoItem todoItem21 = new TodoItem(LocalDate.parse("2024-11-18"), false, person2);
        TodoItem todoItem22 = new TodoItem(LocalDate.parse("2024-11-17"), true, person2);
        todoItemDAO.persist(todoItem11);
        todoItemDAO.persist(todoItem12);
        todoItemDAO.persist(todoItem21);
        todoItemDAO.persist(todoItem22);
        Collection<TodoItem> foundPersons = todoItemDAO.findByDeadlineBefore(LocalDate.now());
        assertEquals(3, foundPersons.size());


    }

    @Test
    void findByDeadlineAfter() {
    }
}