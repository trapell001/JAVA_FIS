package com.Student.DAO;

import com.Student.CORE.Student;

public class StudentDAO implements IStudentDAO {
    private final int MAX=100;
    private Student[] students;
    private int count;
    private ISortStratery sortStratery;

    public StudentDAO(Student[] students, int count, ISortStratery sortStratery) {
        this.students = new Student[MAX];
        this.count = count;
        this.sortStratery = sortStratery;
    }



    @Override
    public void addStudent(Student student) {

    }

    @Override
    public Student removeStudent(int code) {
        return null;
    }

    @Override
    public void display() {

    }

    @Override
    public void sort() {

    }

    @Override
    public void setSortStratery(ISortStratery sortStratery) {

    }
}
