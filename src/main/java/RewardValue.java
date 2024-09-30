public class RewardValue {
    private double cash = -1.0;
    private int miles = -1;
    static double milesToCash = 0.0035;

    public RewardValue(double cashValue) {
        if (cashValue >= 0)
            cash = cashValue;
        else
            throw new IllegalArgumentException("cash value must be positive");
    }

    public RewardValue(int milesValue) {
        if (milesValue >= 0)
            miles = milesValue;
        else
            throw new IllegalArgumentException("miles value must be positive");
    }

    public double getCashValue() {
        if (cash != -1.0)
            return cash;
        return milesToCash * miles;
    }

    public int getMilesValue() {
        if (miles != -1)
            return miles;
        return (int) (1 / milesToCash * cash);
    }
}