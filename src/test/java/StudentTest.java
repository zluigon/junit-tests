import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class StudentTest {

    Student student;
    Student studentTwo;
    Student studentThree;

    @Before
    public void setUp() {
        student = new Student(1L, "Luis");
        studentTwo = null;
        studentThree = new Student(1L, "James");
    }


    @Test
    public void testStudentConstructor() {
        assertNotNull(student);
        assertNull(studentTwo);
    }

    @Test
    public void testStudentFields() {
        assertSame(1L, studentThree.getId());
        assertSame("James", studentThree.getName());
        assertEquals(0, studentThree.getGrades().size());
    }

    @Test
    public void testAddGrade() {
        studentThree.addGrade(83);

        assertEquals(1, studentThree.getGrades().size());
        assertSame(83, studentThree.getGrades().get(0));
    }

    @Test
    public void testGradeAvg() {
        studentThree.addGrade(93);
        studentThree.addGrade(97);

        assertEquals(95, studentThree.getGradeAverage(), 0);
        assertEquals(2, studentThree.getGrades().size());
    }
}

