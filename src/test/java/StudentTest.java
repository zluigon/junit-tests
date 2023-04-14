import org.junit.Test;


import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testStudentConstructor() {
        Student student = new Student(1L, "test");
        Student studentTwo = null;

        assertNotNull(student);
        assertNull(studentTwo);
    }

    @Test
    public void testStudentFields() {
        Student student = new Student(1L, "James");

        assertSame(1L, student.getId());
        assertSame("James", student.getName());
        assertEquals(0, student.getGrades().size());
    }

    @Test
    public void testAddGrade() {
        Student student = new Student(1L, "James");
        student.addGrade(83);

        assertEquals(1, student.getGrades().size());
        assertSame(83, student.getGrades().get(0));
    }

    @Test
    public void testGradeAvg() {
        Student student = new Student(1L, "James");
        student.addGrade(93);
        student.addGrade(97);

        assertEquals(95, student.getGradeAverage(), 0);
        assertEquals(2, student.getGrades().size());
    }
}

