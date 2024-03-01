import java.util.Scanner;

class ATM{
    float Balance;
    int PIN= 5674;

    public void checkPin(){
        System.out.println("Please, Enter your Pin: ");
        Scanner input = new Scanner(System.in);
        int enteredPin = input.nextInt();
        if(enteredPin == PIN){
            menu();
        } else {
            System.out.println("Enter the Valid Pin");
            menu();
        }

    }
    public void menu(){
        System.out.println("Enter your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner input = new Scanner(System.in);
        int opt = input.nextInt();
        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            WithdrawMoney();
        } else if (opt == 3) {
            depositeMoney();

        } else if (opt == 4) {
            return;

        } else {
            System.out.println("Enter a valid Choice");
        }
    }
   public void checkBalance(){
       System.out.println("Balannce" + Balance);
       menu();
   }
   public void WithdrawMoney(){
       System.out.println("Enter Amount to Withdraw: ");
       Scanner input = new Scanner(System.in);
       float amount = input.nextInt();
       if(amount > Balance){
           System.out.println("Insufficient Balance");
       }else {
           Balance = Balance - amount;
           System.out.println("Money Withdraw Successfully");

       }
       menu();
   }
   public void depositeMoney(){
       System.out.println("Enter the Amount: ");
       Scanner input = new Scanner(System.in);
       float amount = input.nextInt();
       Balance = Balance + amount;
       System.out.println("Money deposit Successfully");
       menu();
   }

}
public class ATMMachine{
    public static void main(String[] args) {
        ATM object = new ATM();
        object.checkPin();
    }

}
