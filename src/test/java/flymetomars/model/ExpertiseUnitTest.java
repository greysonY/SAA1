package flymetomars.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by greyson on 25/3/17.
 */
public class ExpertiseUnitTest {
    private Expertise ex;

    @Before
    public void setUp() {
        ex = new Expertise();
    }
    // Test Description

    @Test
    public void testSetDescription() {
        ex = new Expertise();
        ex.setDescription("difficult");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNameEmpty() {
        ex = new Expertise();
        ex.setDescription("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNameNull() {
        ex = new Expertise();
        ex.setDescription(null);
    }

    @Test
    public void testExpertiseHasDefaultEmptyName() {
        ex = new Expertise();
        Assert.assertTrue(ex.getDescription().isEmpty());
    }

    // Test level

    @Test
    public void testSetLegalLevel() {
        ex = new Expertise();
        Assert.assertThat(Expertise.ExpertiseLevel.AMATURE.toString(), is("amature"));
    }

    @Test
    public void testExpertiseHasDefaultNullLevel() {
        ex = new Expertise();
        Assert.assertNull(ex.getLevel());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetIllegalLevel() {
        ex = new Expertise();
        ex.setLevel(Expertise.ExpertiseLevel.valueOf("beginner"));
    }
}
