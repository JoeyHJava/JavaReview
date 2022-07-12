package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

class HRClient {
    public static void main(String[] args) {
        Employee salaried1 = new SalariedEmployee("Terry", LocalDate.of(2020,1,1), 100.00);
        Employee salaried2 = new SalariedEmployee("Sarah", LocalDate.of(2020,2,2), 200.00);

        Employee hourly = new HourlyEmployee("Helio", LocalDate.of(2020,3,3), 40, 50);
        System.out.println(salaried1.getEmployeeInf());
        System.out.println(salaried2.getEmployeeInf());
        System.out.println(hourly.getEmployeeInf());

        Department department = new Department("dept", "nashville");

        department.addEmployee(salaried1);
        department.addEmployee(salaried2);
        int numberEmployeeWorked = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        System.out.println(numberEmployeeWorked);
        System.out.println(department.computeDepartmentMonthlyTotalCompensation());
    }

}
