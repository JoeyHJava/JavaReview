package com.hr.corp;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CorporationTest extends TestCase {

    @Test
    public void testComputeMonthlyTaxToPay() {
        Corporation corp = new Corporation("first", 150.00);
        double one = corp.computeMonthlyTaxToPay();
        Assert.assertEquals(15.00, one, 0.01);

    }

}