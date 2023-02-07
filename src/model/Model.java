package src.model;

public class Model {
    private double annuityInterest;
    private int startYear;
    private int endYear;
    private double lumpSum;
    private AnnuityPlan[] annuityPlanArray;

    public double getAnnuityInterest() {
        return annuityInterest;
    }

    public void setAnnuityInterest(double newAnnuityInterest) {
        annuityInterest = newAnnuityInterest;
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
}
