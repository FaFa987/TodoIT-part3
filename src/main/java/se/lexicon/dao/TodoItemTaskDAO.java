package se.lexicon.dao;

import se.lexicon.model.TodoItemTask;

import java.util.Collection;

public interface TodoItemTaskDAO {
    TodoItemTask persis(TodoItemTask todoItemTask);
    TodoItemTask findById(int id);
    Collection<TodoItemTask> findAll();
    String findByAssignStatus(String status);
    Collection<TodoItemTask> findByPersonId(int personId);
    void remove(int id);

}
