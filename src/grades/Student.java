package grades;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Student {
    private String name;
    private ArrayList<Double> grades;
    private HashMap<String, String> attendance;

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

    public void recordAttendance(String date, String value) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = formatter.format(date);
        if (value.equalsIgnoreCase("A")) {
            attendance.put(currentDate, "A");
        } else if (value.equalsIgnoreCase("P")){
            attendance.put(currentDate, "P");
        } else {
            System.out.println("invalid entry. Try again.");
        }

    }

    public float attendancePercentage(HashMap<String, String> attendance){
        final float[] totalAbsence = {0};
        attendance.forEach((k,v) -> {
            if (v.equalsIgnoreCase("P")) {
                totalAbsence[0] += 1;
            }
        });
        return ((attendance.size() - totalAbsence[0]) / attendance.size());
    }

    public HashMap<String, String> getAttendance() {
        return attendance;
    }

    public void setAttendance(HashMap<String, String> attendance) {
        this.attendance = attendance;

    }

    public static void main(String[] args) {
//        Student rod = new Student("Rod");
//        rod.addGrade(90.0);
//        rod.addGrade(100.0);
//        rod.addGrade(85.0);
//        System.out.println(rod.getGradeAverage());
    }
}
