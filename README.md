# Employee-Student-Management-System

This project is designed to manage employee and student information, including course enrollment and pay calculations. It implements classes for `Course`, `Employee`, `Hourly Employee`, `Salary Employee`, and `Student` with various functionalities.

## Features
- **Course Management**: Track courses and marks.
- **Employee Management**: Manage employee details and payroll calculations.
- **GPA Calculation**: Calculate and display student GPA based on enrolled courses.
- **Paycheck Generation**: Print paychecks for hourly and salaried employees.

# Course
# Purpose:
Represents a course with its associated details such as the course name and the mark obtained by the student.
# Attributes:
mark: The score or grade the student received in the course.
courseName: The name of the course.
# Methods:
Constructor: Initializes the course with its name and mark.
getMark(): Returns the mark for the course.
getCourseName(): Returns the name of the course.
setMark(): Allows updating the mark for the course.
toString(): Provides a string representation of the course details.

# Person
# Purpose: 
Serves as a base class for Employee and Student, encapsulating common attributes and behaviors for individuals.
# Attributes:
name: The name of the person.
address: The residential address.
birthday, birthmonth, birthyear: The person's date of birth.
id: A unique identifier for each person, which auto-increments.
# Methods:
Constructor: Initializes a person with name, address, and birth date.
getters: Methods to retrieve personal attributes (name, address, etc.).
toString(): Returns a string representation of the person's details.

# Employee
# Purpose:
Represents an employee, extending Person and adding attributes and methods specific to employees, such as work hours and benefits.
# Attributes:
hoursWorked: The total number of hours worked by the employee.
pensionPlan: The contribution amount for the employee's pension.
eInsurance: The amount for employee insurance.
# Methods:
Constructor: Initializes an employee with personal details and default values for hours worked and benefits.
getters: Accessor methods for employee-specific attributes.
toString(): Returns a string representation of the employee’s details.

# HourlyEmp
# Purpose:
Extends Employee to represent hourly employees, providing functionality to calculate gross pay based on hours worked and hourly rate.
# Attributes:
hourlyrate: The hourly wage for the employee.
grosspay: Total earnings before deductions.
taxAmount: The total tax calculated based on gross pay.
pensionpay: The total pension contribution based on gross pay.
insurance: The total insurance contribution based on gross pay.
netpay: The take-home pay after deductions.
# Methods:
Constructor: Initializes an hourly employee with personal details and hourly rate.
calcGrossPay(): Calculates the gross pay based on hours worked.
calcTax(): Computes the tax based on yearly income.
calcEi(): Calculates Employment Insurance contribution.
calcCpp(): Calculates Canada Pension Plan contribution.
printPayCheque(): Outputs a formatted pay slip for the employee.

# SalaryEmp
# Purpose:
Extends Employee to represent salaried employees, providing methods to calculate their gross pay, tax, and net pay.
# Attributes:
salary: The annual salary for the employee.
grosspay: The monthly gross pay calculated from the salary.
taxAmount: The total tax calculated based on gross pay.
pensionpay: The pension contribution based on gross pay.
insurance: The insurance contribution based on gross pay.
netpay: The take-home pay after deductions.
# Methods:
Constructor: Initializes a salaried employee with personal details and salary.
calcGrossPay(): Calculates the monthly gross pay from the annual salary.
calcTax(): Computes the tax based on annual salary.
calcCpp(): Calculates Canada Pension Plan contribution.
calcEi(): Calculates Employment Insurance contribution.
calcNetPay(): Computes the net pay after all deductions.
printPayCheque(): Outputs a formatted pay slip for the employee.

# Student
# Purpose:
Extends Person to represent students, managing their enrolled courses and calculating their GPA.
# Attributes:
gpa: The calculated GPA for the student.
courseList: A list of courses the student is enrolled in.
# Methods:
Constructor: Initializes a student with personal details.
calcGPA(): Calculates the GPA based on the marks from enrolled courses.
addCourse(): Adds a new course to the student's course list, enforcing a maximum limit.
printReport(): Outputs the student's information along with their courses and GPA.
