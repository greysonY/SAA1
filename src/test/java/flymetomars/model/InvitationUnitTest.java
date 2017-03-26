package flymetomars.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by greyson on 26/3/17.
 */
public class InvitationUnitTest {
    private Invitation inv;

    @Before
    public void setUp() {
        inv = new Invitation();
    }

    // Test Mission

    @Test
    public void testSetMission() {
        inv = new Invitation();
        inv.setMission(new Mission());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMissionNull() {
        inv = new Invitation();
        inv.setMission(null);
    }

    @Test
    public void testInvitationHasDefaultNullMission() {
        inv = new Invitation();
        Assert.assertNull(inv.getMission());
    }

    // Test Creator

    @Test
    public void testSetCreator() {
        inv = new Invitation();
        inv.setCreator(new Person());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCreatorNull() {
        inv = new Invitation();
        inv.setCreator(null);
    }

    @Test
    public void testInvitationHasDefaultNullCreator() {
        inv = new Invitation();
        Assert.assertNull(inv.getCreator());
    }

    // Test Recipient

    @Test
    public void testSetRecipient() {
        inv = new Invitation();
        inv.setRecipient(new Person());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRecipientNull() {
        inv = new Invitation();
        inv.setRecipient(null);
    }

    @Test
    public void testInvitationHasDefaultNullRecipient() {
        inv = new Invitation();
        Assert.assertNull(inv.getRecipient());
    }

    // Test LastUpdated

    @Test
    public void testSetTime() {
        inv = new Invitation();
        inv.setLastUpdated("01-09-2010");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTimeEmpty() {
        inv = new Invitation();
        inv.setLastUpdated("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTimeNull() {
        inv = new Invitation();
        inv.setLastUpdated(null);
    }

    @Test
    public void testInvitationHasDefaultNullTime() {
        inv = new Invitation();
        Assert.assertNull(inv.getLastUpdated());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetIllegalTime() {
        inv = new Invitation();
        inv.setLastUpdated("-1");
    }


    // Test Status

    @Test
    public void testSetLegalStatus() {
        inv = new Invitation();
        Assert.assertThat(Invitation.InvitationStatus.ACCEPTED.toString(), is("accepted"));
    }

    @Test
    public void testInvitationHasDefaultNullStatus() {
        inv = new Invitation();
        Assert.assertNull(inv.getStatus());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetIllegalStatus() {
        inv = new Invitation();
        inv.setStatus(Invitation.InvitationStatus.valueOf("asds"));
    }
}
