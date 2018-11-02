
//kloronomei apo tin bankAccount, prosthetw extends kai to onoma ths klasis poy thelw na klironomisw, den xreiazete
//allo auto arkei
public class SavingAccount extends BankAccount {
    // thelw na ftiaksw mia idikoteriki katigoria trapezikon logariasmon pou exei kai epipleon xaraktiristika
    // stin prokimeni periptosi na exei epitokio
    private double interestRate;

    public SavingAccount(double initialAmount, double rate){
        super(initialAmount);
        interestRate = rate;
    }

    //mporoume na baloyme mia methodo pou na thetei timi sto epitokio
    public void setInterestRate(Double rate){
        interestRate = rate;
    }

    // mporw na prosuetw kai epipleon methodous me eidikoteres symperifores
    public void addInterest(){

        double interest = getBalance() * interestRate;
        balance = balance + interest;

    }

    public void printData(){
        System.out.println("Saving Account");
        System.out.println("Balance: " + balance + " Rate: " + interestRate);
    }
}
