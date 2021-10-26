package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
//    Job testJob1 = new Job();
//    Job testJob2 = new Job();
    //Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    //Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


    @Test
    public void testSettingJobId() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertEquals(testJob1.getId(), testJob2.getId(), 1);
        assertNotEquals(testJob1.getId(), testJob2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        assertNotNull(testJob1);
//        assertNotNull(testJob2);
//        assertNotNull(testJob3);
//        assertTrue(testJob3 instanceof Job);
        assertTrue(testJob3.getName() instanceof String);
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);


// I had expected and actual switched around. No new tests passed though =/

//        assertEquals(testJob3.getName(), "Product tester");
//        assertEquals(testJob3.getEmployer(), "ACME");
//        assertEquals(testJob3.getLocation(), "Desert");
//        assertEquals(testJob3.getPositionType(), "Quality control");
//        assertEquals(testJob3.getCoreCompetency(), "Persistence");

        assertEquals("Product tester", testJob3.getName());
        assertEquals("ACME", testJob3.getEmployer().getValue());
        assertEquals("Desert", testJob3.getLocation().getValue());
        assertEquals("Quality control", testJob3.getPositionType().getValue());
        assertEquals("Persistence", testJob3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob3.equals(testJob4));

    }

}

