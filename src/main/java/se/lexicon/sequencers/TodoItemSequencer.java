package se.lexicon.sequencers;

public class TodoItemSequencer {

    public static int currentId;

    public static int nextId() {
        currentId++;
        return currentId;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        TodoItemSequencer.currentId = currentId;
    }
}
