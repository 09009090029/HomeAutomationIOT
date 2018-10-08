package com.example.nitish.homeautomation;

public class HomeTest {

    public static void main(String[] ar) {
        Student student = new Student();
        student.setMarks("23");
        student.setRollNumber("01");
        student.setName("Nitish Kumar");
        student.add();
        student.delete();
        System.out.print("student = " + student.toString());
        // log
    }
}
