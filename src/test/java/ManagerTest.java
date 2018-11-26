import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Thomas Gracie", 1, 35000.00, "DevOps");
    }

    @Test
    public void hasDetails(){
        assertEquals("Thomas Gracie", manager.getName());
        assertEquals(1, manager.getNI());
        assertEquals(35000.00, manager.getSalary(), 0.5);
        assertEquals("DevOps", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.01);
        assertEquals(35350.00, manager.getSalary(), 0.1);
    }

    @Test
    public void goodJob(){
        manager.payBonus();
        assertEquals(350.00, manager.viewBonus(), 0.1);
    }
}
