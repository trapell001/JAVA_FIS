package com.Student.DAO;

import com.Student.CORE.Student;

public interface IStudentDAO {
    public void addStudent(Student student);
    public Student removeStudent(int code);
    public void display();
    public void sort();
    public void setSortStratery(ISortStratery sortStratery) ;

}
