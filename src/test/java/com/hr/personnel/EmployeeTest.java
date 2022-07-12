package com.hr.personnel;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class EmployeeTest extends TestCase {

    private Employee employee;

    @Before
    public void setUp() throws Exception{
        employee = new Employee("kane", LocalDate.of(2020, 1, 3));
        String work = employee.work();
        Assert.assertEquals("kane worked", work);
    }

    @Test
    public void testGetEmployeeInf_should_return_name_and_hireDate() {
        String employeeInfo = employee.getEmployeeInf();
        Assert.assertEquals("name = kane hireDate = 2020-01-03", employeeInfo);
    }


    public void testWork() {
        String work = employee.work();
        Assert.assertEquals("kane worked", work);
    }

    public void testComputeMonthlyCompensation_return_double() {
        SalariedEmployee sal = new SalariedEmployee("Tony", LocalDate.of(2020,06,07), 230.05);
        HourlyEmployee hrl = new HourlyEmployee("Paula", LocalDate.of(20202,7,7), 8, 97.00);
        SalariedEmployee tst = new SalariedEmployee("Tony", LocalDate.of(2020,06,07), 230.05);
        HourlyEmployee hl = new HourlyEmployee("Ulua", LocalDate.of(20202,7,7), 8, 97.00);

        Assert.assertEquals(tst, sal);
        Assert.assertNotEquals(hl ,hrl);
    }
}