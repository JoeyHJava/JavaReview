package gov.irs;

import com.hr.personnel.Employee;
import com.hr.personnel.SalariedEmployee;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class IRSTest extends TestCase {

    @Test
    public void testComputeTotalMonthlyTaxToCollect() {
        IRS fist = new IRS();

        Assert.assertEquals(0.0, fist.computeTotalMonthlyTaxToCollect(), 0.01);
    }
}