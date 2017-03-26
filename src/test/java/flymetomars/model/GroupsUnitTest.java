package flymetomars.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by greyson on 26/3/17.
 */
public class GroupsUnitTest {
    private Groups g;

    @Before
    public void setUp() throws Exception {
        g = new Groups();
    }

    // Test participantSet
    @Test
    public void personSetNotNull() { assertNotNull("person not null", g.getParticipantSet());}

    // Test SignUpMission

    @Test
    public void testSetCaptain() {
        g = new Groups();
        g.setSignUpMission(new Mission());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCaptainNull() {
        g = new Groups();
        g.setSignUpMission(null);

    }

    @Test
    public void testMissionHasDefaultNullCaptain() {
        g = new Groups();
        Assert.assertNull(g.getSignUpMission());
    }

}
