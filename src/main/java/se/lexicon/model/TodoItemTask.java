package se.lexicon.model;

public class TodoItemTask {
        private int id;
        private boolean assigned;
        private TodoItem todoItem;
        private Person assignee;

        public TodoItemTask(boolean assigned, TodoItem todoItem, Person assignee) {
            this.assigned = assigned;
            this.todoItem = todoItem;
            this.assignee = assignee;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public boolean isAssigned() {
            return assigned;
        }
        public void setAssigned(boolean assigned) {
            this.assigned = assigned;
        }
        public TodoItem getTodoItem() {
            return todoItem;
        }
        public void setTodoItem(TodoItem todoItem) {
            this.todoItem = todoItem;
        }
        public void setAssignee(Person assignee) {
            this.assignee = assignee;
        }
        public Person getAssignee() {
            return assignee;
        }

        public String getSummary(){
            return todoItem.getSummary();
        }

    }

