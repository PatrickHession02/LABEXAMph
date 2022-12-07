import org.junit.jupiter.api.Test;





public class EmployeeTest {



@Test
Employee NEW = new Employee();

    void testName{
        Employee NEW = new Employee("Patrick","123456","0830221645", "Man", "Full-Time", "20");
        assertEquals("Pat",Employee.getName());
        }

        void TestNameFail(){
        Exception message = assertThrows(IllegalArgumentException.class ()-> { new Employee("Patrick","123456","0830221645", "Man", "Full-Time", "20")});
        assertEquals("invalid Name"),message.getMessage();
        }
@Test
    void testPPSID{
        Employee NEW = new Employee("Patrick","123456","0830221645", "Man", "Full-Time", "20");
        assertEquals("Patrick",Employee.getName());
    }

    void TestPPSIDFail(){
        Exception message = assertThrows(IllegalArgumentException.class ()-> { new Employee("")});
        assertEquals("invalid PPSID"),message.getMessage();
    }
    @Test
    void testPhone{
        Employee NEW = new Employee("Patrick","123456","0830221645", "Man", "Full-Time", "20";
        assertEquals("Patrick",Employee.getName());
    }

    void TestPhoneFail(){
        Exception message = assertThrows(IllegalArgumentException.class ()-> { new Employee("")});
        assertEquals("invalid Phone"),message.getMessage();
    }
    @Test
    void testGender{
        Employee NEW = new Employee("Patrick","123456","0830221645", "Man", "Full-Time", "20");
        assertEquals("Patrick",Employee.getName());
    }

    void TestGenderFail(){
        Exception message = assertThrows(IllegalArgumentException.class ()-> { new Employee("")});
        assertEquals("Invalid entry"),message.getMessage();
    }
    @Test
    void testEmployment{
        Employee NEW = new Employee("Patrick","123456","0830221645", "Man", "Full-Time", "20");
        assertEquals("Patrick",Employee.getName());
    }

    void TestEmploymentFail(){
        Exception message = assertThrows(IllegalArgumentException.class ()-> { new Employee("")});
        assertEquals("ajioklj"),message.getMessage();
    }
    @Test
    void TestAge{
        Employee NEW = new Employee("Patrick","123456","0830221645", "Man", "Full-Time", "20");
        assertEquals(12,Employee.getAge());
    }

    void TestAgeFail(){
        Exception message = assertThrows(IllegalArgumentException.class ()-> { new Employee("")});
        assertEquals("Too young to work for company"),message.getMessage();
    }
}
