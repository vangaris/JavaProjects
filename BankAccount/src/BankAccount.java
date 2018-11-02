public class BankAccount {

    protected double balance;

    public BankAccount(){

    }
    public BankAccount(double amount){
        balance = amount;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount){
        balance= balance + amount;
    }

    public String toString(){
        return ("balance: "  + balance);
    }

    public void printData(){
        System.out.println("Normal Bank Account");
        System.out.println("Balance: " + balance);
    }

}
