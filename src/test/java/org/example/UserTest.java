package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

//Ex.9
public class UserTest {

    @Test
    public void checkFullConstructor() {

        User user = new User("User Name", 1423, 35);

        assertEquals("User Name", user.name);
        assertEquals(1423, user.id);
        assertEquals(35, user.age);

    }

    @Test
    public void checkVoidConstructor() {

        User user = new User();

        assertNull(user.name);
        assertEquals(0, user.id);
        assertEquals(0, user.age);
    }

    @Test
    public void checkNameUpdate() {
        User user = new User("UserPupuser", 1234, 20);

        String result = user.nameUpdate();

        assertEquals("UserPupuserUpdated", result);

    }

}
