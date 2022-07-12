package com.hr.personnel;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.LocalDate;

public class SalariedEmployeeTest extends TestCase {

    @Test
    public void testComputeMonthlyTaxToPay() {
        SalariedEmployee brown = new SalariedEmployee("brown", LocalDate.of(2020, 05, 05), 1000.0);
        Employee one = new SalariedEmployee("brown", LocalDate.of(2020, 05, 05), 1000.0);
        ((SalariedEmployee) one).getMonthlySalary();
    }
}