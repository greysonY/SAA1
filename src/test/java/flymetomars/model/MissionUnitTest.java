package flymetomars.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by greyson on 25/3/17.
 */
public class MissionUnitTest {
    private Mission m;

    @Before
    public void setUp() {
        m = new Mission();
    }

    //Test Name
    @Test
    public void testSetName() {
        m = new Mission();
        m.setName("impossible");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNameEmpty() {
        m = new Mission();
        m.setName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNameNull() {
        m = new Mission();
        m.setName(null);
    }

    @Test
    public void testMissionHasDefaultEmptyName() {
        m = new Mission();
        Assert.assertTrue(m.getName().isEmpty());
    }

    //Test Location

    @Test
    public void testSetLocation() {
        m = new Mission();
        m.setLocation("australia");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLocationEmpty() {
        m = new Mission();
        m.setLocation("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLocationNull() {
        m = new Mission();
        m.setLocation(null);
    }

    @Test
    public void testMissionHasDefaultEmptyLocation() {
        m = new Mission();
        Assert.assertTrue(m.getLocation().isEmpty());
    }

    //Test Description

    @Test
    public void testSetDescription() {
        m = new Mission();
        m.setDescription("australia");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDescriptionEmpty() {
        m = new Mission();
        m.setDescription("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDescriptionNull() {
        m = new Mission();
        m.setDescription(null);
    }

    @Test
    public void testMissionHasDefaultEmptyDescription() {
        m = new Mission();
        Assert.assertTrue(m.getDescription().isEmpty());
    }

    //Test Set not null

    @Test
    public void personSetNotNull() { assertNotNull("person not null", m.getParticipantSet());}

    @Test
    public void invitationSetNotNull() {
        assertNotNull("invitation not null", m.getInvitationSet());
    }

    @Test
    public void equipmentSetNotNull() { assertNotNull("equipment not null", m.getEquipmentsRequired());
    }

    //Test maxEquipmentWeight

    @Test
    public void testSetMaxEquipmentWeight() {
        m = new Mission();
        m.setMaxEquipmentWeight("1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaxEquipmentWeightEmpty() {
        m = new Mission();
        m.setMaxEquipmentWeight("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaxEquipmentWeightNull() {
        m = new Mission();
        m.setMaxEquipmentWeight(null);
    }

    @Test
    public void testMissionHasDefaultEmptyMaxEquipmentWeight() {
        m = new Mission();
        Assert.assertTrue(m.getMaxEquipmentWeight()==0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxEquipmentWeightNegative() {
        m = new Mission();
        m.setMaxEquipmentWeight("-1");
    }

    //Test maxEquipmentVolume

    @Test
    public void testSetMaxEquipmentVolume() {
        m = new Mission();
        m.setMaxEquipmentVolume("1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaxEquipmentVolumeEmpty() {
        m = new Mission();
        m.setMaxEquipmentVolume("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaxEquipmentVolumeNull() {
        m = new Mission();
        m.setMaxEquipmentVolume(null);
    }

    @Test
    public void testMissionHasDefaultEmptyMaxEquipmentVolume() {
        m = new Mission();
        Assert.assertTrue(m.getMaxEquipmentVolume()==0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxEquipmentVolumeNegative() {
        m = new Mission();
        m.setMaxEquipmentVolume("-1");
    }

    //Test Time

    @Test
    public void testSetTime() {
        m = new Mission();
        m.setTime("01-09-2010");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTimeEmpty() {
        m = new Mission();
        m.setTime("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTimeNull() {
        m = new Mission();
        m.setTime(null);
    }

    @Test
    public void testMissionHasDefaultNullTime() {
        m = new Mission();
        Assert.assertNull(m.getTime());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetIllegalTime() {
        m = new Mission();
        m.setTime("-1");
    }

    //Test captain
    @Test
    public void testSetCaptain() {
        m = new Mission();
        m.setCaptain(new Person());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCaptainNull() {
        m = new Mission();
        m.setCaptain(null);
    }

    @Test
    public void testMissionHasDefaultNullCaptain() {
        m = new Mission();
        Assert.assertNull(m.getCaptain());
    }
}
