package com.Student.CORE;

public class Student implements Comparable<Student>{
    private  int code;
    private String name;
    private String birtDate;

    public Student() {
    }

    public Student(int code, String name, String birtDate) {
        this.code = code;
        this.name = name;
        this.birtDate = birtDate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(String birtDate) {
        this.birtDate = birtDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", birtDate=" + birtDate +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.code;
    }
}
