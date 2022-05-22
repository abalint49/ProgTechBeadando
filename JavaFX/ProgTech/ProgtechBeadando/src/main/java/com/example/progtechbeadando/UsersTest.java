package com.example.progtechbeadando;

import org.junit.Test;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;

class UsersTest {

    @Test
    user login(String test, String s) {
        user c = login("test" ,"test");
        assertNotNull(c);
        return c;
    }

    @Test
    void refressUser() {
        refressUser();
        assertNotEquals(null, LoginController.users);
    }

    @Test
    String getUserFromId(int i) {
        String u = getUserFromId(0);
        assertNotNull(u);
        return u;
    }
}