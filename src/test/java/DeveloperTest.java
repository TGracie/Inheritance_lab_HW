import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer dev;

    @Before
    public void before(){
        dev = new Developer("Thomas", 2, 25000.00);
    }

    @Test
    public void hasDetails(){
        assertEquals("Thomas", dev.getName());
        assertEquals(2, dev.getNI());
        assertEquals(25000.00, dev.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        dev.payBonus();
        assertEquals(250.00, dev.viewBonus(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        dev.raiseSalary(0.01);
        assertEquals(25250.00, dev.getSalary(), 0.1);
    }
}
