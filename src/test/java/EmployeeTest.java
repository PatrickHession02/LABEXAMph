import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;





public class EmployeeTest {



@Test
Employee NEW = new Employee();

    void testName{
        Employee NEW = new Employee("","","");
        assertEquals("Patrick",Employee.getName());
        }

        void TestNameFail(){
        Exception message = assertThrows(IllegalArgumentException.class ()-> { new Employee("")});
        assertEquals("invalid Name"),message.getMessage();
        }


}
