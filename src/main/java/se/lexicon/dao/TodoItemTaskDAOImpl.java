package se.lexicon.dao;

import se.lexicon.model.TodoItemTask;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TodoItemTaskDAOImpl implements TodoItemTaskDAO {

    Collection<TodoItemTask> todoItemTasks = new HashSet<>();


    @Override
    public TodoItemTask persis(TodoItemTask todoItemTask) {
        todoItemTasks.add(todoItemTask);
        return todoItemTask;
    }

    @Override
    public TodoItemTask findById(int id) {
        for (TodoItemTask todoItemTask : todoItemTasks) {
            if (todoItemTask.getId() == id) {
                return todoItemTask;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return todoItemTasks;
    }

    @Override
    public String findByAssignStatus(String status) {
        for (TodoItemTask todoItemTask : todoItemTasks) {
            if(todoItemTask.getAssignee().equals(status)) {
                return status;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(int personId) {
        for (TodoItemTask todoItemTask : todoItemTasks) {
            if(todoItemTask.getAssignee().equals(personId)) {
                return todoItemTasks;
            }
        }
        return null;
    }

    @Override
    public void remove(int id) {
        for (TodoItemTask todoItemTask : todoItemTasks) {
            if (todoItemTask.getId() == id) {
                todoItemTasks.remove(todoItemTask);
            }
        }

    }
}
