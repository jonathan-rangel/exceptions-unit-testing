package com.exceptions;

import java.util.List;

public class Group {

    private int maxOccupancy;
    private Student student;

    public Group(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void add(Student student) {
    }

    public List<Student> getStudents() {
    }

    public int availability() {
        int i = student - maxOccupancy;
    }
}
