public class RewardValue {

    private double cash;
    private int miles;

    public RewardValue (double cashValue){
        cash = cashValue;
    }

    public RewardValue (int miles){
        this.miles = miles;
    }

    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        int newMiles = (int) (cash * 0.0035);
        return newMiles;
    }


}
