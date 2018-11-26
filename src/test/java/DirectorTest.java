import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director dir;

    @Before
    public void before(){
        dir = new Director("Thomas", 1, 45000.00, "CTO", 30000.00);
    }

    @Test
    public void hasDetails(){
        assertEquals(30000.00, dir.getBudget(), 0.1);
        assertEquals("Thomas", dir.getName());
        assertEquals(45000.00, dir.getSalary(), 0.1);
        assertEquals("CTO", dir.getDeptName());
        assertEquals(1, dir.getNI());
    }

    @Test
    public void greedySod(){
        dir.raiseSalary(0.05);
        assertEquals(47250.00, dir.getSalary(), 0.1);
    }

    @Test
    public void greedySodTwoElectricBoogaloo(){
        dir.payBonus();
        assertEquals(900.00, dir.viewBonus(), 0.1);
    }
}
