package com.exceptions;

public class Student {

    private String name;
    private String ID;
    private Integer grade;


    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }


    public String getId() {
        return ID;
    }

    public void setGrade(Integer grade) {
            this.grade = grade;
    }

    public Integer getGrade(){
        return grade;
    }

}
