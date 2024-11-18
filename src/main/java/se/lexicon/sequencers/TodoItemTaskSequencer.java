package se.lexicon.sequencers;

public class TodoItemTaskSequencer {

    public static int currentId;

    public static int nextId(){
        currentId++;
        return currentId;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        TodoItemTaskSequencer.currentId = currentId;
    }


    public static void main(String[] args) {
        System.out.println("next id: " + nextId());
        System.out.println("next id: " + nextId());
        System.out.println(TodoItemTaskSequencer.getCurrentId());
    }
}
