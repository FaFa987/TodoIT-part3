package se.lexicon.model;

import java.time.LocalDate;
import java.util.Objects;

public class TodoItem {
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done = true;
    private Person creator;

    public TodoItem(String title, String taskDescription, int deadLine, boolean done, Person creator) {
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = LocalDate.parse(deadLine+"");
        this.done = done;
        this.creator = creator;
    }

    public TodoItem(String title, String taskDescription, boolean done, Person creator) {
        this.title = title;
        this.taskDescription = taskDescription;
        this.done = done;
        this.creator = creator;
    }

    public TodoItem(LocalDate deadLine, boolean done, Person creator) {
        this.deadLine = deadLine;
        this.done = done;
        this.creator = creator;
    }

    public void setTitle(String title) {
        this.title = Objects.requireNonNull(title, "Title cannot be null");
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = Objects.requireNonNull(deadLine, "DeadLine cannot be null");
    }

    public void setDone(boolean done) {
        this.done = true;
    }
    public void setCreator(Person creator) {
        this.creator = Objects.requireNonNull(creator, "Creator cannot be null");
    }
    public String getTitle() {
        return title;
    }
    public LocalDate getDeadLine() {
        return deadLine;
    }
    public boolean isDone() {
        return done;
    }
    public Person getCreator() {
        return creator;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    public int getId() {
        return id;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    public boolean isOverdue(){
        LocalDate now = LocalDate.now();
        return !done && deadLine.isBefore(now);
    }
    public String getSummary(){
        return taskDescription + ": " + deadLine + " - " + creator;
    }
}