public class CheckInAccount extends BankAccount {
    private int transactioncounter;

    public CheckInAccount(double intialAmount){
        super(intialAmount);
        transactioncounter = 0;
    }

    // epanaorismos / epikalipsi methodou
    //everride th methodo
    public void deposit(double amount){
        transactioncounter++;
        super.deposit(amount);

        if (transactioncounter > 3 ){
            deductFees();
        }
    }

    public void deductFees(){
        balance -= 0.5;
    }

    public void printData(){
        System.out.println("Checking Account");
        System.out.println("Balance: " + balance + "free limit: 3 trans.");
    }
}
