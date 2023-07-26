public class RewardValue {

    private double cash;
    private double miles;
    private double newCash;
    private double newMiles;

    public RewardValue (double cashValue){
        this.cash = cashValue;
        this.newMiles = (cashValue / 0.0035);
    }

    public RewardValue (int milesValue){
        this.miles = milesValue;
        this.newCash = (milesValue * 0.0035);
    }

    public double getCashValue(){
        return newCash;
    }

    public double getMilesValue(){
        return this.newMiles;
    }


}
