/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment3;

/**
 *
 * @author 88019
 */
public class SalaryEmp extends Employee{
    protected double salary;
    protected double grosspay;
    protected double taxAmount;
    protected double pensionpay;
    protected double insurance;
    private double netpay;
    
    public SalaryEmp(String name, String address, double salary,
            int birthday,int birthmonth,int birthyear){
        super(name, address,birthday,birthmonth,birthyear);
        this.salary=salary;
        
    
}

    @Override
    public String toString() {
        return "SalaryEmp{" + "salary=" + salary + ", grosspay=" + grosspay + 
                ", taxAmount=" + taxAmount + '}';
    }
    

    
    public double calcGrossPay(){
        grosspay=salary/12;
        return grosspay;
    }
    public double calcTax(){
        if (salary<14000){
            taxAmount=0;
        }
        else if(salary>=14000 && salary<=49999.99){
            taxAmount=0.15*salary;
        }
        else if(salary>=50000 && salary<=99999.99){
            taxAmount=0.21*salary;
        }
        else if(salary>=100000 && salary<=149999.99){
            taxAmount=0.26*salary;
        
    }
        else{
            taxAmount=0.29*salary;
        }
        return taxAmount;
    }
    public double calcCpp(){
        pensionpay=0.0545*grosspay;
        if (pensionpay<=super.getPensionPlan()){
            pensionpay=super.getPensionPlan();
        }
        return pensionpay; 
    }
    public double calcEi(){
        insurance=0.0158*grosspay;
        if (insurance<=super.geteInsurance()){
            insurance=super.geteInsurance();
        
        }
        return insurance; 
    }
    public double calcNetPay(){
        double netpay1=grosspay-super.getPensionPlan()-super.geteInsurance()
                -taxAmount;
        return netpay1;
    }
    public void printPayCheque(){
        System.out.println("===============================================");
        System.out.println(super.getId());
        System.out.println(super.getName());
        System.out.println(super.getAddress());
        System.out.println("--------------------------------------------");
        System.out.println("Hours worked: 189.00   "+ salary);
        System.out.println("--------------------------------------------");
        System.out.println("Gross Pay: " + grosspay);
        System.out.println("Tax: "+ taxAmount);
        System.out.println("CPP: "+pensionpay);
        System.out.println("EI: "+insurance);
        System.out.println("");
        System.out.println("Net Pay:       "+netpay);
        
    }
}
