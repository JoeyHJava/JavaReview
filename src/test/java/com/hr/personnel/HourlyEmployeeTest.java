package com.hr.personnel;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class HourlyEmployeeTest extends TestCase {

    @Test
    public void testComputeMonthlyTaxToPay() {
        HourlyEmployee roam = new HourlyEmployee("roam", LocalDate.of(20202, 05, 06), 10,10.0);

        double monthlyTaxPay = roam.computeMonthlyTaxToPay();
        Assert.assertEquals(50.0, monthlyTaxPay, 0.01);
    }
}