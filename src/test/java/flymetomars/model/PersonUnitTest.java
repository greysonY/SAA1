package flymetomars.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by yli on 16/03/15.
 */
public class PersonUnitTest {
    private Person p;

    @Before
    public void setUp() {
        p = new Person();
    }

    @Test
    public void expertiseNotNull() {
        assertNotNull("expertise not null", p.getExpertise());
    }

    @Test
    public void MissionRegisteredNotNull() {
        assertNotNull("expertise not null", p.getMissionRegistered());
    }

    @Test
    public void InvitationRecievedNotNull() {
        assertNotNull("expertise not null", p.getInvitationsReceived());
    }

    @Test
    public void equipmentOwendNotNull() {
        assertNotNull("expertise not null", p.getEquipmentOwned());
    }

    @Test
    public void passwordNotNullOrEmpty() {
        try {
            p.setPassword(null);
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains null", e.getMessage().contains("null"));
        }

        try {
            p.setPassword("");
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains empty", e.getMessage().contains("empty"));
        }
    }

    //Test First Name

    @Test
    public void testSetFirstName() {
        Person p = new Person();
        p.setFirstName("greyson");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetFirstNameEmpty() {
        Person p = new Person();
        p.setFirstName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetFirstNameNull() {
        Person p = new Person();
        p.setFirstName(null);
    }

    @Test
    public void testPersonHasDefaultEmptyFirstName() {
        Person p = new Person();
        Assert.assertTrue(p.getFirstName().isEmpty());
    }

    //Test Last Name

    @Test
    public void testSetLastName() {
        Person p = new Person();
        p.setLastName("greyson");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLastNameEmpty() {
        Person p = new Person();
        p.setLastName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLastNameNull() {
        Person p = new Person();
        p.setLastName(null);
    }

    @Test
    public void testPersonHasDefaultEmptyLastName() {
        Person p = new Person();
        Assert.assertTrue(p.getLastName().isEmpty());
    }

    //Test Email

    @Test
    public void testSetEmail() {
        Person p = new Person();
        p.setEmail("greyson@greyson.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEmailEmpty() {
        Person p = new Person();
        p.setEmail("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullEmail() {
        Person p = new Person();
        p.setEmail(null);
    }

    @Test
    public void testPersonHasDefaultEmptyEmail() {
        Person p = new Person();
        Assert.assertTrue(p.getEmail().isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInvalidEmail() {
        Person p = new Person();
        p.setEmail("asdfasdf");  //no "@" and "."
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBadEmail() {
        Person p = new Person();
        p.setEmail("@.");
    }

    //Test Username
    @Test
    public void testSetUsername() {
        Person p = new Person();
        p.setUserName("as123"); //5 characters
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetEmptyUsername() {
        Person p = new Person();
        p.setUserName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullUsername() {
        Person p = new Person();
        p.setUserName(null);
    }

    @Test
    public void testPersonHasDefaultEmptyUsername() {
        Person p = new Person();
        Assert.assertTrue(p.getUserName().isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTooLongUsername() {
        Person p = new Person();
        p.setUserName("asd12345678901234");  //17 characters
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTooShortUsername() {
        Person p = new Person();
        p.setUserName("asd1");  //4 characters
    }

    //Test Password
    @Test
    public void testSetPassword() {
        Person p = new Person();
        p.setPassword("as12345678"); //12 characters
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBlankPassword() {
        Person p = new Person();
        p.setPassword("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullPassword() {
        Person p = new Person();
        p.setPassword(null);
    }

    @Test
    public void testPersonHasDefaultEmptyPassword() {
        Person p = new Person();
        Assert.assertTrue(p.getPassword().isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTooLongPassword() {
        Person p = new Person();
        p.setPassword("asd1234567890");  //13 characters
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTooShortPassword() {
        Person p = new Person();
        p.setPassword("asd123456");  //9 characters
    }

    //Test willing persons

    @Test
    public void testSetWillingPerson() {
        Person p = new Person();
        p.setWillingPerson(new HashSet<Person>());
    }

    @Test
    public void testWillingPersonNotNull() {
        assertNotNull("willing person could be null", p.getUnwillingPerson());
    }

    //Test unwilling persons

    @Test
    public void testSetUnwillingPerson() {
        Person p = new Person();
        p.setUnwillingPerson(new HashSet<Person>());
    }

    @Test
    public void testUnwillingPersonNotNull() {
        assertNotNull("unwilling person could be null", p.getUnwillingPerson());
    }

}