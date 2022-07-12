package gov.irs;

class IRS {
    private TaxPayer[] taxPayers = new TaxPayer[100];
    private int currentIndex = 0; // for dealing with the array

    public IRS() {
    }

    void register(TaxPayer taxPayer){
        taxPayers[currentIndex++] = taxPayer;
    }
    double computeTotalMonthlyTaxToCollect(){
        double taxCollected = 0.0;
        for (int i = 0; i < currentIndex; i++) {
            taxCollected = taxCollected + taxPayers[i].computeMonthlyTaxToPay();
        }
        return taxCollected;
    }
}