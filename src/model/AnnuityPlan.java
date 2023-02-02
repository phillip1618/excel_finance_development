package model;

import java.lang.Math;

public class AnnuityPlan {
    private double withdrawal;
    private double duration;
    private int compoundFrequency;
    private double interest;

    public AnnuityPlan(double withdrawal, int duration, int compoundFrequency, double interest) {
        this.withdrawal = withdrawal;
        this.duration = duration;
        this.compoundFrequency = compoundFrequency;
        this.interest = interest;
    }

    public double returnWithdrawal() {
        return this.withdrawal;
    }

    public double returnDuration() {
        return this.duration;
    }

    public int returnCompoundFrequency() {
        return this.compoundFrequency;
    }

    public double returnInterest() {
        return this.interest;
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
        System.out.println(obj.returnWithdrawal());
        Double[] cashFlows = new Double[80];
        cashFlows = AnnuityPlan.getCashFlows(3000, 20, 4, 0.04);

        for (int i = 0; i < cashFlows.length; i++) {
            System.out.println(cashFlows[i]);
        }
    }

}