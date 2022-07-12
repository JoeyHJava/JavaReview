package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{

    private int hoursWorkedPerMonth;
    private double hourlyRate;

    public HourlyEmployee(String name, LocalDate localDate, int hoursWorkedPerMonth, double hourlyRate) {
        super(name, localDate);
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double computeMonthlyCompensation() {
        return hourlyRate * hoursWorkedPerMonth;
    }
    @Override
    public double computeMonthlyTaxToPay(){
        return computeMonthlyCompensation() * HOURL_TAX_RATE;
    }
}