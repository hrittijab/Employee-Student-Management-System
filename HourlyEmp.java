/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment3;

/**
 *
 * @author 88019
 */
public class HourlyEmp extends Employee {
    protected double hourlyrate;
    private static double grosspay;
    protected double taxAmount;
    protected double pensionpay;
    protected double insurance;
    private double netpay;
    public HourlyEmp(String name, String address, double hourlyrate,
            int birthday,int birthmonth,int birthyear){
        super(name, address,birthday,birthmonth,birthyear);
        this.hourlyrate=hourlyrate;
        
}

    @Override
    public String toString() {
        return "HourlyEmp{" + "hourlyrate=" + hourlyrate + ", taxAmount=" 
                + taxAmount + ", pensionpay=" + pensionpay + ", insurance="
                + insurance + ", netpay=" + netpay + '}';
    }

    
    
    public double calcGrossPay(){
        if (super.getHoursWorked()<=140){
            grosspay=super.getHoursWorked()*hourlyrate;
        }
        else if (super.getHoursWorked()>140 && super.getHoursWorked()<=147){
            grosspay=(140*hourlyrate)+((super.getHoursWorked()-140)*hourlyrate
                    *1.5)
                    ;
        }
        else{
            grosspay=(140*hourlyrate)+(7*hourlyrate*1.5)+
                    ((super.getHoursWorked()-147)*hourlyrate*2);

        }
        return grosspay;
    
}
        public double calcTax(){
           double taxAmount;
           double yearIncome=grosspay*12;
           
           if (yearIncome<14000){
               taxAmount=0;
           }
           else if(yearIncome>=14000 && yearIncome<=49999.99){
               taxAmount=0.15*yearIncome;
           }
           else if(yearIncome>=50000 && yearIncome<=99999.99){
               taxAmount=0.21*yearIncome;
           }
           else if(yearIncome>=100000 && yearIncome<=149999.99){
               taxAmount=0.26*yearIncome;

       }
           else{
               taxAmount=0.29*yearIncome;
           }
           return taxAmount;
       }
        public double calcEi(){
        double insurance=0.0158*grosspay;
        if (insurance<=super.geteInsurance()){
            insurance=super.geteInsurance();
        
        }
        return insurance; 
    }
        public double calcCpp(){
        double pensionpay=0.0545*grosspay;
        if (pensionpay<=super.getPensionPlan()){
            pensionpay=super.getPensionPlan();
        }
        return pensionpay; 
    }
    public void printPayCheque(double hours){
        //this
        System.out.println("===============================================");
        System.out.println(super.getId());
        System.out.println(super.getName());
        System.out.println(super.getAddress());
        System.out.println("--------------------------------------------");
        System.out.println("Hours worked: "+hours  + hourlyrate);
        System.out.println("--------------------------------------------");
        System.out.println("Gross Pay: " + grosspay);
        System.out.println("Tax: "+ taxAmount);
        System.out.println("CPP: "+pensionpay);
        System.out.println("EI: "+insurance);
        System.out.println("");
        System.out.println("Net Pay:       "+netpay);
        
    }
}