package org.example;

import org.example.DAOImplClasses.UserImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    UserImpl userimplobj = new UserImpl();

    @BeforeEach
    public void setUp()
    {
        userimplobj =new UserImpl();
    }
    @AfterEach
    public void tearDown() {
        userimplobj = null;
    }

    @Test
    public void createAccount()
    {
        assertTrue(userimplobj.createAccount("abc","xyz", Long.parseLong("7318656103")),"true");
    }
}
