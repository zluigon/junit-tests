import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public long getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }


    public ArrayList<Integer> getGrades() {
        return this.grades;
    }


    // adds the given grade to the grades list
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double gradeTotal = 0;

        for (Integer grade : grades) {
            gradeTotal += grade;
        }
        return gradeTotal / grades.size();

    }
}
