package org.projectLombok.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User testUser;

    @BeforeEach
    void setUp() {
        testUser = new User("Kyle Maitland", "918 Menomonie Lane", 28);
    }

    @Test
    void getterSuccess() {
        String name = testUser.getName();
        assertEquals("Kyle Maitland", name);
    }

    @Test
    void setterSuccess() {
        testUser.setAge(29);
        assertEquals(29, testUser.getAge());
    }

}