import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    ArrayList<Integer> grades;
    private String name;
    private long id;

    public Student(long id, String name){
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public long getId(){
        return this.id;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double result = 0;
        for (int grade : this.getGrades()) {
            result += grade;
        }
        return result / this.getGrades().size();
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

}
