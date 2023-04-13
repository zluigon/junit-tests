import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CohortTest {

    Cohort azeban;
    Student student;

    @Before
    public void setUp(){
        azeban = new Cohort();
        student = new Student(1L, "Luis");
    }

    @Test
    public void testAddStudent(){
        azeban.addStudent(student);

        assertSame(student, azeban.getStudents().get(0));
        assertEquals(1,azeban.getStudents().size());
    }

    @Test
    public void testStudentList(){
        azeban.addStudent(student);
        azeban.addStudent(student);
        assertEquals(2,azeban.getStudents().size());
    }

    @Test
    public void testCohortAvg(){
        Student austin = new Student(2L,"Austin");
        Student thomas = new Student(3L,"Thomas");

        azeban.addStudent(austin);
        azeban.addStudent(thomas);

        student.addGrade(94);
        austin.addGrade(98);
        thomas.addGrade(96);

        assertEquals(96,azeban.getCohortAverage(),1);


    }
}
