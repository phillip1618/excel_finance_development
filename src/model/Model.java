package src.model;

public class Model {
    private double annuityDiscountRate;
    private int startYear;
    private int endYear;
    private double lumpSum;
    private boolean cola;
    private AnnuityPlan[] annuityPlanArray;

    public double getAnnuityDiscountRate() {
        return annuityDiscountRate;
    }

    public void setAnnuityDiscountRate(double newAnnuityDiscountRate) {
        annuityDiscountRate = newAnnuityDiscountRate;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int newStartYear) {
        startYear = newStartYear;
    }

    public int getEndYear() {
        return endYear;
    }
    
    public void setEndYear(int newEndYear) {
        endYear = newEndYear;
    }

    public double getLumpSum() {
        return lumpSum;
    }

    public void setLumpSum(double newLumpSum) {
        lumpSum = newLumpSum;
    }

    public AnnuityPlan[] getAnnuityPlanArray() {
        return annuityPlanArray;
    }

    public void setAnnuityPlanArray(AnnuityPlan[] newAnnuityPlanArray) {
        annuityPlanArray = newAnnuityPlanArray;
    }

    public boolean getCOLA() {
        return cola;
    }

    public void setCOLA(boolean newCOLA) {
        cola = newCOLA;
    }
}
