import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      BankAccount BA = new BankAccount(1000);
      SavingAccount SA = new SavingAccount(1000,0.02);
      CheckInAccount CA = new CheckInAccount(500);


      Bank bank = new Bank();
      bank.addAccount(BA);
      bank.addAccount(SA);
      bank.addAccount(CA);
      bank.printAllData();





    }
}
