import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWOne;
    Cohort cohortWMany;

    @Before
    public void init(){

        emptyCohort = new Cohort();
        cohortWOne = new Cohort();
        cohortWMany = new Cohort();



    }

    @Test
    public void testIfAddStudentWorks(){
        assertEquals(0, cohortWOne.getStudents().size());
        Student fer = new Student(1L, "Fer");
        cohortWOne.addStudent(fer);
        assertEquals(1, cohortWOne.getStudents().size());
    }

    @Test
    public void testIfGetStudentsWork(){
        Student fer = new Student(10L, "Fer");
        Student david = new Student(20L, "David");
        cohortWMany.addStudent(fer);
        cohortWMany.addStudent(david);
        assertEquals(10, cohortWMany.getStudents().get(0).getId());
        assertEquals(20, cohortWMany.getStudents().get(1).getId());
    }

    @Test
    public void testIfCohortAvgWorks(){
        Student fer = new Student(10L, "Fer");
        Student david = new Student(20L, "David");
        fer.addGrade(100);
        fer.addGrade(40);
        //70
        david.addGrade(80);
        david.addGrade(90);
        //85
        cohortWMany.addStudent(fer);
        cohortWMany.addStudent(david);

        assertEquals(77.5, cohortWMany.getCohortAverage(), 0.5);

    }


}
