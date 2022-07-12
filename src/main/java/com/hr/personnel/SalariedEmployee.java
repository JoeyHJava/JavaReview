package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

//    public SalariedEmployee(String name, LocalDate localDate) {
//        super(name, localDate);
//    }

    public SalariedEmployee(String name, LocalDate localDate, double monthlySalary) {
        super(name, localDate);
        this.monthlySalary = monthlySalary;
    }


    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public double computeMonthlyCompensation() {
        return this.monthlySalary;
    }

    @Override
    public double computeMonthlyTaxToPay(){
        return computeMonthlyCompensation() * HOURL_TAX_RATE;
    }
}