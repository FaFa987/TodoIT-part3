package se.lexicon.model;

import java.util.Objects;
import java.util.UUID;

public class AppUser {
    private String username;
    private String password;
    private AppRole role;

    public AppUser(String username, String password, AppRole role) {
        this.setUsername(username);
        this.setPassword(password);
        this.role = role;
    }

    public AppUser(String peter, String will) {
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public AppRole getRole() {
        return role;
    }

    public void setUsername(String username) {
        if(username == null || username.trim().isEmpty())
            throw new IllegalArgumentException("Username cannot be null or empty");
        this.username = username;
    }

    public void setPassword(String password) {
        if(password == null || password.trim().isEmpty())
            throw new IllegalArgumentException("Password cannot be null or empty");
        this.password = password;
    }
    public void setRole() {
        this.role = role;
    }


    public void generatePassword() {
        this.password = UUID.randomUUID().toString();
    }
    public String userInfo(){
        return "Name is: " + this.username +" Password is: " + this.password + " ID is: " + this.role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(username, appUser.username) && Objects.equals(password, appUser.password) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, role);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
