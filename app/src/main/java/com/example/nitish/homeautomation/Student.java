package com.example.nitish.homeautomation;

public class Student implements MyInterface {
    String name;
    String rollNumber;
    String marks;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", marks='" + marks + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }


    public void add() {
        System.out.print("add ");

    }

    public void delete() {
        System.out.print("add ");
    }
}
