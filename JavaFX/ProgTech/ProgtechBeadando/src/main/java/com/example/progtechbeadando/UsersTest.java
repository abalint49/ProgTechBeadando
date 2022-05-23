package com.example.progtechbeadando;

import org.junit.Test;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;

class UsersTest {

    @org.junit.jupiter.api.Test
    void refressUser() {
        refressUser();
        assertNotEquals(null, LoginController.users);
    }

    @org.junit.jupiter.api.Test
    void testLogin() {
        user c = LoginForm.users.login("test" ,"test");
        assertNotNull(c);
    }

    @org.junit.jupiter.api.Test
    void getUserFromId() {
        String u = LoginForm.users.GetUserFromId(0);
        assertNotNull(u);
    }
}