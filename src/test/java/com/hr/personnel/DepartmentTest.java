package com.hr.personnel;

import junit.framework.TestCase;
import org.junit.Assert;

import java.time.LocalDate;

public class DepartmentTest extends TestCase {

    public void testAddEmployee_should_increment_number_of_employees() {
        Employee emp = new Employee("Monica", LocalDate.of(2020,4,4));
        Department dept = new Department("Monica", "Irvine");
        dept.addEmployee(emp);
        Assert.assertEquals(1, dept.currentIndex);
    }

    public void testLetEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        Department dept = new Department("John", "Jersey");
        Employee em2 = new Employee("Betty", LocalDate.of(2020,05,05));
        Employee em3 = new Employee("Brian", LocalDate.of(2020,05,05));
        dept.addEmployee(em2);
        dept.addEmployee(em3);
        Assert.assertEquals(dept.currentIndex, dept.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked());
    }
}