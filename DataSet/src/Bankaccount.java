public class Bankaccount implements Measurable {

    private double balance;

    public Bankaccount( double aBalance){
        balance = aBalance;
    }

    public double getBalance(){
        return balance;
    }

    @Override
    public double getMeasure() {
        return balance;
    }
}
