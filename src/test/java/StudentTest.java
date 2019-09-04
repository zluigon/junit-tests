import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testCreateStudent(){
        Student fer = new Student(1L, "fer");
        Student ryan = null;
        assertNull(ryan);
        assertNotNull(fer);
    }
}