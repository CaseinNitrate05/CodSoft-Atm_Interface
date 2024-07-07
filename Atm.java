import java.util.Scanner;

class Atm{
    protected float amount;
    protected float minBalance;
    protected float balance;
    
    Atm(){
        Scanner s=new Scanner(System.in);
    
        System.out.print("Enter the initial balance:");
        balance = s.nextFloat();
        System.out.print("\nEnter the minimum balance:");
        minBalance=s.nextFloat();
        if (balance < minBalance) {
            System.out.println("\nInitial balance cannot be less than the minimum balance. Please restart the program.");
            System.exit(1);
        }
    }
    void checkBalance(){
        System.out.println("-----------------------------------------");
        System.out.println("Balance:"+balance);
        System.out.println("-----------------------------------------");
    }

    void withdraw(){
        Scanner s1=new Scanner(System.in);
        System.out.print("\nEnter the amount to withdraw:");
        amount=s1.nextFloat();
        if((balance-amount)>=minBalance)
        {
            balance=balance-amount;
            System.out.println("-----------------------------------------");
            System.out.println("Withdrawal successful");
            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
            System.out.println("-----------------------------------------");
        }
        else{
            System.out.println("-----------------------------------------");
            System.out.println("Insufficient Balance");
            System.out.println("-----------------------------------------");
        }
    }
    void deposit(){
        Scanner s2=new Scanner(System.in);
        System.out.print("\nEnter the amount to deposit:");
        amount=s2.nextFloat();
        balance=balance+amount;
        System.out.println("-----------------------------------------");
        System.out.println("Deposit Successful");
        System.out.println("Deposit Amount: " + amount);
        System.out.println("Balance: " + balance);
        System.out.println("-----------------------------------------");
    }

}
