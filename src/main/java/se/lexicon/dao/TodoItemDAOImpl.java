package se.lexicon.dao;

import se.lexicon.model.TodoItem;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


public class TodoItemDAOImpl implements TodoItemDAO {

    Collection<TodoItem> todoItems = new HashSet<>();


    @Override
    public TodoItemDAO persist(TodoItem todoItem) {
        todoItems.add(todoItem);
        System.out.println("Persisting todo item: " + todoItem);
        return this;
    }

    @Override
    public TodoItem findById(int id) {
        for (TodoItem todoItem : todoItems) {
            if (todoItem.getId() == id) {
                return todoItem;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItem> findAll() {
        return todoItems;
    }

    @Override
    public boolean findAllByDoneStatus(boolean done) {
        for (TodoItem todoItem : todoItems) {
            if (todoItem.isDone() == done) {
                return done;
            }
        }
        return false;
    }

    @Override
    public String findAllByTitleContain(String title) {
        for (TodoItem todoItem : todoItems) {
            if (todoItem.getTitle().contains(title)) {
                return todoItem.getTitle();
            }
        }
        return title;
    }

    @Override
    public Collection<TodoItem> findByPersonId(int id) {
        for (TodoItem todoItem : todoItems) {
            if(todoItem.getId()==id){
                return todoItems;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {
        Collection<TodoItem> todoItems = new HashSet<>();
        for (TodoItem todoItem : this.todoItems) {
            if(todoItem.getDeadLine().isBefore(date)){
                todoItems.add(todoItem);
            }
        }
        return todoItems;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {
        for (TodoItem todoItem : todoItems) {
            if(todoItem.getDeadLine().isAfter(date)){
                return todoItems;
            }
        }
        return null;
    }

    @Override
    public void remove(int id) {
        //todoItems.removeIf(todoItem -> todoItem.getId() == id);
        for (TodoItem todoItem : todoItems) {
            if (todoItem.getId() == id) {
                todoItems.remove(todoItem);
                System.out.println("Removed " + todoItem);
            }
        }


    }
}
