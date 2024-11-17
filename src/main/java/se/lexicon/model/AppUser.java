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

    public boolean equals(AppUser user) {
        if(user == null || user.username == null){
            return false;
        }
        return this.username.equals(user.getUsername());
    }
    @Override
    public int hashCode() {
        return Objects.hash(username , role);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Username: ");
        sb.append(username);
        sb.append("Role: ");
        sb.append(role);
        return sb.toString();
    }

    public void generatePassword() {
        this.password = UUID.randomUUID().toString();
    }
    public String userInfo(){
        return "Name is: " + this.username +" Password is: " + this.password + " ID is: " + this.role;
    }


}
