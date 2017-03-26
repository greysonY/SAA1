package flymetomars.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by greyson on 25/3/17.
 */
public class EquipmentUnitTest {
    private  Equipment eq;
    @Before
    public void setUp() {
        eq = new Equipment();
    }

    //Test Name
    @Test
    public void testSetName() {
        eq = new Equipment();
        eq.setName("stick");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNameEmpty() {
        eq = new Equipment();
        eq.setName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNameNull() {
        eq = new Equipment();
        eq.setName(null);
    }

    @Test
    public void testEquipmentHasDefaultEmptyName() {
        eq = new Equipment();
        Assert.assertTrue(eq.getName().isEmpty());
    }

    //Test Weight

    @Test
    public void testSetWeight() {
        eq = new Equipment();
        eq.setWeight("1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWeightEmpty() {
        eq = new Equipment();
        eq.setWeight("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWeightNull() {
        eq = new Equipment();
        eq.setWeight(null);
    }

    @Test
    public void testEquipmentHasDefaultEmptyWeight() {
        eq = new Equipment();
        Assert.assertTrue(eq.getWeight()==0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEquipmentWeightNegative() {
        eq= new Equipment();
        eq.setWeight("-1");
    }

    //Test Volume

    @Test
    public void testSetVolume() {
        eq = new Equipment();
        eq.setVolume("1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetVolumeEmpty() {
        eq = new Equipment();
        eq.setVolume("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetVolumeNull() {
        eq = new Equipment();
        eq.setVolume(null);
    }

    @Test
    public void testEquipmentHasDefaultEmptyVolume() {
        eq = new Equipment();
        Assert.assertTrue(eq.getVolume()==0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEquipmentVolumeNegative() {
        eq= new Equipment();
        eq.setVolume("-1");
    }
}
