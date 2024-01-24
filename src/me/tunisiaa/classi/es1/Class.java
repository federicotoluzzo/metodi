package me.tunisiaa.classi.es1;

public class Class {
    private int students;
    private int teachers;
    private int size;
    private int windows;
    private int grade;
    private String section;
    private float averageGrades;
    private boolean isUniversityClass;
    private boolean isLab;

    private void clean(){
        System.out.println("The classroom has been cleaned!");
    }

    private void upgrade() {
        this.grade++;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public int getTeachers() {
        return teachers;
    }

    public void setTeachers(int teachers) {
        this.teachers = teachers;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public float getAverageGrades() {
        return averageGrades;
    }

    public void setAverageGrades(float averageGrades) {
        this.averageGrades = averageGrades;
    }

    public boolean isUniversityClass() {
        return isUniversityClass;
    }

    public void setUniversityClass(boolean universityClass) {
        isUniversityClass = universityClass;
    }

    public boolean isLab() {
        return isLab;
    }

    public void setLab(boolean lab) {
        isLab = lab;
    }
}
