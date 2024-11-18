package se.lexicon.dao;

import se.lexicon.model.AppUser;

import java.util.Collection;
import java.util.HashSet;

public class AppUserDAOImpl implements AppUserDAO {

    private Collection<AppUser> appUsers = new HashSet<>();



    @Override
    public AppUser persist(AppUser appUser){
        appUsers.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByUsername(String username){
        for(AppUser appUser : appUsers){
            if(appUser.getUsername().equals(username)){
                return appUser;
            }
        }
        return null;
    }

    @Override
    public Collection<AppUser> findAll(){
        return new HashSet<>(appUsers);
    }

    @Override
    public void remove(String username){
        AppUser appUser = findByUsername(username);//null is error
        if(appUser != null){
            appUsers.remove(appUser);
        } else {
            System.out.println("User not found" + username);
        }
    }

}
