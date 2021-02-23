import org.junit.Before;
import org.junit.Test;
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

        Student fer = new Student(10L, "Fer");
        Student david = new Student(20L, "David");

        fer.addGrade(100);
        fer.addGrade(40);

        david.addGrade(80);
        david.addGrade(90);
        cohortWOne.addStudent(fer);
        cohortWMany.addStudent(fer);
        cohortWMany.addStudent(david);

    }

    @Test
    public void testIfAddStudentWorks(){
        assertEquals(1, cohortWOne.getStudents().size());
        assertEquals(2, cohortWMany.getStudents().size());
    }

    @Test
    public void testIfGetStudentsWork(){
        assertEquals(10, cohortWMany.getStudents().get(0).getId());
        assertEquals(20, cohortWMany.getStudents().get(1).getId());
    }

    @Test
    public void testIfCohortAvgWorks(){
        assertEquals(70, cohortWOne.getCohortAverage(), 0.5);
        assertEquals(77.5, cohortWMany.getCohortAverage(), 0.5);
    }


}
