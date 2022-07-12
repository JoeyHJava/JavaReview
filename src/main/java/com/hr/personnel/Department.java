package com.hr.personnel;

public class Department {
    String name;
    String location;
    com.hr.personnel.Employee[] employees = new Employee[100];
    int currentIndex = 0;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addEmployee(com.hr.personnel.Employee employee){
        employees[currentIndex] = employee;
        currentIndex = currentIndex + 1;
    }
//    com.hr.personnel.Employee[] employees array with size of 100

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked(){
        for (int i = 0; i < currentIndex; i++) {
            employees[i].work();
            System.out.println( employees[i].work());
        }
        return currentIndex;
    }

    public double computeDepartmentMonthlyTotalCompensation(){
        double totalComp = 0.0;
        for (int i = 0; i < currentIndex; i++) {
            totalComp = totalComp + employees[i].computeMonthlyCompensation();
        }
            return totalComp;
    }
}