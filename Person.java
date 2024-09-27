/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment3;

/**
 *
 * @author 88019
 */
public class Person {
    protected String name;
    protected String address;
    protected int birthday;
    protected int birthmonth;
    protected int birthyear;
    static int id=1;

    public String getAddress() {
        return address;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getBirthmonth() {
        return birthmonth;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public static int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address +
                ", birthday=" + birthday + ", birthmonth=" + birthmonth + 
                ", birthyear=" + birthyear + '}';
    }
    
    
    
    
    public Person(String name, String address, int birthday,int birthmonth,
            int birthyear){
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.birthmonth = birthmonth;
        int nextId=id;
        id+=3;
}
    public Person(){
        name= "Test Name";
        address= "Test Address";
        birthday=1;
        birthmonth=1;
        birthyear=2000;
        
    }

    public String getName() {
        return name;
    }
    
}
