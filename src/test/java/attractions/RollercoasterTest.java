package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor2 = new Visitor(11, 140, 100);
        visitor1 = new Visitor(18, 205, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedToRide() {
        assertTrue(rollerCoaster.isAllowedTo(visitor1));
        assertFalse(rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canChargeDouble() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor1), 0.01);
    }

}
