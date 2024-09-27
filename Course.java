/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment3;


/**
 *
 * @author 88019
 */
public class Course {
    protected double mark;
    protected String courseName;
    
    public Course(String courseName, double mark){
        this.mark=mark;
        this.courseName=courseName;
    
            
}   

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Course{" + "mark=" + mark + ", courseName=" + courseName + '}';
    }

    public double getMark() {
        return mark;
    }

    public String getCourseName() {
        return courseName;
    }
    
    
}
