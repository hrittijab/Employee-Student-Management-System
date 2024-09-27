/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment3;

import java.util.ArrayList;

/**
 *
 * @author 88019
 */
public class Student extends Person{
    private double gpa;
    
    ArrayList<Course> courseList = new ArrayList<>();

    public Student(String name, String address, int birthday, int birthmonth, 
            int birthyear){
        super(name,address,birthday,birthmonth,birthyear);

        this.gpa=gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "gpa=" + gpa + ", courseList=" + courseList + '}';
    }
    
    public double calcGPA(){
        double count=courseList.size();
        double total=0;
        for (Course i:courseList){
            total+=i.getMark();
        }
        gpa=total/count;
        return gpa;
    }
    public void addCourse(String courseName,double mark){
        if (courseList.size()==12){
            System.out.println("Full limit");
        }
        else{
            Course courseNam1 = new Course(courseName,mark);
            courseList.add(courseNam1);
        }
            
        }
    public void printReport(){
        System.out.println("===============================================");
        System.out.println(super.getId());
        System.out.println(super.getName());
        System.out.println(super.getAddress());
        System.out.println("--------------------------------------------");
        double count=courseList.size();
        double total=0;
        for (Course i:courseList){
            System.out.println(i.courseName+"    "+i.getMark());
        }
        System.out.println();
        System.out.println("GPA:"+"    "+gpa);
        System.out.println("===============================================");
    }
    
}
