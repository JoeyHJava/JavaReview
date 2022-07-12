package gov.irs;

public interface TaxPayer {

    public static final double HOURL_TAX_RATE = 0.5;
    public static final double CORP_TAX_RATE = 0.10;
    public double computeMonthlyTaxToPay();
}
