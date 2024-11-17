package se.lexicon.model;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    //private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = Objects.requireNonNull(firstName, "FirstName cannot be null");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = Objects.requireNonNull(lastName, "LastName cannot be null");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Objects.requireNonNull(email, "Email cannot be null");
    }

    public int getId() {
        return id;
    }


    public String getSummary(){
        return "Id: " + id + ", Name: " + firstName + " " + lastName + ", Email: " + email;
    }
}