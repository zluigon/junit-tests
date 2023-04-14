import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CohortTest {

    Cohort azeban;
    Student student;
    Student austin;
    Student thomas;

    @Before
    public void setUp() {
        azeban = new Cohort();
        student = new Student(1L, "Luis");
        austin = new Student(2L, "Austin");
        thomas = new Student(3L, "Thomas");
    }

    @Test
    public void testAddStudent() {
        azeban.addStudent(student);

        assertSame(student, azeban.getStudents().get(0));
        assertEquals(1, azeban.getStudents().size());
    }

    @Test
    public void testStudentList() {
        azeban.addStudent(student);
        azeban.addStudent(student);
        assertEquals(2, azeban.getStudents().size());
    }

    @Test
    public void testCohortAvg() {
        azeban.addStudent(austin);
        azeban.addStudent(thomas);

        student.addGrade(94);
        austin.addGrade(98);
        thomas.addGrade(96);

        assertEquals(97, azeban.getCohortAverage(), 0);
    }
}
