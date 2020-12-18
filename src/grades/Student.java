package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }


    public double[] getGrades() {
        double[] gradeList = new double[this.grades.size()];
        for (int i=0; i < grades.size(); i++) {
            gradeList[i] = grades.get(i);
        }
        return gradeList;
    }

    public double getGradeAverage() {
        double totalSize = 0;
        for (int i=0; i < grades.size(); i++) {
            totalSize += grades.get(i);
        }
        return  totalSize / grades.size();
    }


    public static void main(String[] args) {
        Student rod = new Student("Rod");
        rod.addGrade(90.0);
        rod.addGrade(100.0);
        rod.addGrade(85.0);

        System.out.println(rod.getGradeAverage());
    }
}
