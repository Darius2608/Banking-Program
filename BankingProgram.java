import java.util.*;
public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double balance = 0;
        boolean isrunning = true;
        int choice;
        while(isrunning){
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
            System.out.print("enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showbalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isrunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        System.out.println("**************************");
        System.out.println("Thank you, have a nice day");
        System.out.println("**************************");
    }
    static void showbalance(double balance){
        System.out.printf("balance: $%.2f\n", balance);
    }
    static double deposit(){
        double amount;
        System.out.print("enter an amount to be deposited: ");
        amount = scanner.nextDouble();
        if(amount<0){
            System.out.println("amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }

    }
    static double withdraw(double balance){
        double amount;
        System.out.print("enter amount to be withdrawn: ");
        amount = scanner.nextDouble();
        if(amount>balance){
            System.out.println("insufficient funds");
            return 0;
        }
        else if(amount<0){
            System.out.println("amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}
