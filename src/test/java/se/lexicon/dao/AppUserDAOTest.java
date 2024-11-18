package se.lexicon.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.lexicon.model.AppRole;
import se.lexicon.model.AppUser;

import static org.junit.jupiter.api.Assertions.*;

class AppUserDAOTest {

    private AppUserDAO appUserDAO;
    @BeforeEach
    void setUp() {
        appUserDAO = new AppUserDAOImpl();
    }

    @Test
    void persist() {
        AppUser appUser = new AppUser("Ali","123", AppRole.ROLE_APP_USER);
        appUserDAO.persist(appUser);

    }

    @Test
    void findByUsername() {
        AppUser appUser = new AppUser("Ali","123", AppRole.ROLE_APP_USER);
        appUserDAO.persist(appUser);
        AppUser found = appUserDAO.findByUsername("Ali");
        assertEquals(appUser, found);
        assertEquals("Ali", found.getUsername());
    }

    @Test
    void findAll() {
    }

    @Test
    void remove() {
    }
}