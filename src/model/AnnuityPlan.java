package src.model;

import java.lang.Math;

public class AnnuityPlan {
    private double annuityWithdrawal;
    private double annuityDuration;
    private int annuityCompoundFrequency;
    private double annuityInterest;

    public AnnuityPlan(double withdrawal, int duration, int compoundFrequency, double interest) {
        annuityWithdrawal = withdrawal;
        annuityDuration = duration;
        annuityCompoundFrequency = compoundFrequency;
        annuityInterest = interest;
    }

    public double getWithdrawal() {
        return annuityWithdrawal;
    }

    public void setWithdrawal(double newWithdrawal) {
        annuityWithdrawal = newWithdrawal;
    }

    public double getDuration() {
        return annuityDuration;
    }

    public void setDuration(double newDuration) {
        annuityDuration = newDuration;
    }
    
    public int getCompoundFrequency() {
        return annuityCompoundFrequency;
    }

    public void setCompoundFrequency(int newCompoundFrequency) {
        annuityCompoundFrequency = newCompoundFrequency;
    }

    public double getInterest() {
        return annuityInterest;
    }

    public void setInterest(double newInterest) {
        annuityInterest = newInterest;
    }

    public static Double[] getCashFlows(double withdrawal, int duration, int compoundFrequency, double interest) {
        int totalPeriods = duration * compoundFrequency;
        Double[] cashFlows = new Double[totalPeriods];

        for (int i = 0; i < totalPeriods; i++) {
            cashFlows[i] = withdrawal * Math.pow(1 + interest, i);
        }

        return cashFlows;
    }

    public static void main(String... arg) {
        AnnuityPlan obj = new AnnuityPlan(3000, 20, 4, 0.04);
        System.out.println(obj.getWithdrawal());
        Double[] cashFlows = new Double[80];
        cashFlows = AnnuityPlan.getCashFlows(3000, 20, 4, 0.04);

        for (int i = 0; i < cashFlows.length; i++) {
            System.out.println(cashFlows[i]);
        }
    }

}