import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CohortTest {


    @Test
    public void testAddStudentAndGetStudentsWork(){
        Cohort cohortWithOne = new Cohort();
        assertEquals(0, cohortWithOne.getStudents().size());
        cohortWithOne.addStudent(new Student(1, "Fer M"));
        assertEquals(1, cohortWithOne.getStudents().size());

//        assertEquals(1, cohortWithOne.getStudents().get(0).getId());
    }

    @Test
    public void testIfAvgIsCorrect(){
        Cohort cohortWithMany = new Cohort();

        Student fer = new Student(1, "Fer M");
        fer.addGrade(90);

        Student trant = new Student(2, "Trant B");
        trant.addGrade(100);
        trant.addGrade(100);
        trant.addGrade(100);

        cohortWithMany.addStudent(fer);
        cohortWithMany.addStudent(trant);

        assertEquals(95.0, cohortWithMany.getCohortAverage(), 0);

    }


}