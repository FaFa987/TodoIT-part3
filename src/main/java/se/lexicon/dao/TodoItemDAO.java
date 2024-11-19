package se.lexicon.dao;

import se.lexicon.model.TodoItem;

import java.time.LocalDate;
import java.util.Collection;

public interface TodoItemDAO {
    TodoItemDAO persist(TodoItem todoItem);
    TodoItem findById(int id);
    Collection<TodoItem> findAll();
    boolean findAllByDoneStatus(boolean done);
    String findAllByTitleContain(String title);
    Collection<TodoItem> findByPersonId(int id);
    Collection<TodoItem> findByDeadlineBefore(LocalDate date);
    Collection<TodoItem> findByDeadlineAfter(LocalDate date);
    void remove(int id);
}
