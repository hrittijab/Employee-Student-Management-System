/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment3;

/**
 *
 * @author 88019
 */
public class Employee extends Person{
    private int hoursWorked;
    private double pensionPlan;
    private double eInsurance;

    public int getHoursWorked() {
        return hoursWorked;
    }

    
    public double getPensionPlan() {
        return pensionPlan;
    }

    public double geteInsurance() {
        return eInsurance;
    }

    @Override
    public String toString() {
        return "Employee{" + "numHours=" + hoursWorked + ", pensionPlan=" + 
                pensionPlan + ", eInsurance=" + eInsurance + '}';
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    
    

   
    public Employee(String name, String address, int birthday,int birthmonth,
            int birthyear){
        super(name, address,birthday,birthmonth,birthyear);

        this.hoursWorked=189;
        this.pensionPlan =(double) 266.67;
        this.eInsurance = (double) 74.17;
}
    
     
}
