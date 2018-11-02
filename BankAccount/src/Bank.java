import java.util.ArrayList;

public class Bank {

    private ArrayList <BankAccount> accounts = new ArrayList<BankAccount>();

    public void addAccount(BankAccount aAccount){
        accounts.add(aAccount);
    }

    public void printAllData(){
        System.out.println("Bank Account");
        for( BankAccount c : accounts)
            c.printData();
    }
}
