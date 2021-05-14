import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfStudentCanBeCreated(){
        Student fer = new Student(1L, "fer");
        Student nullStudent = null;
        assertNotNull(fer);
        assertNull(nullStudent);
    }

    @Test
    public void testIfFieldsAreSet(){
        Student fer = new Student(1L, "fer");
        assertEquals(1L, fer.getId());
        assertEquals("fer", fer.getName());

        Student rosie = new Student(40L, "Rosie");
        assertEquals(40L, rosie.getId());
        assertEquals("Rosie", rosie.getName());
    }

}
