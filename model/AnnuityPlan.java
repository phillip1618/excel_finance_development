public class AnnuityPlan {
    private double withdrawal;
    private double duration;

    public AnnuityPlan(double withdrawal, double duration) {
        this.withdrawal = withdrawal;
        this.duration = duration;
    }

    public double returnWithdrawal() {
        return this.withdrawal;
    }

    public static void main(String... arg) {
        AnnuityPlan obj = new AnnuityPlan(3000, 20);
        System.out.println(obj.returnWithdrawal());
    }

}