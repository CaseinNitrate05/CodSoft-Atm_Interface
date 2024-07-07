import java.util.Scanner;

public class AtmApp{
    void atmMenu(){
        System.out.println("\nWelcome to ATM!");
        System.out.println("Please chose a option:");
        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
    }
    public static void main(String args[])
    {
        Atm a=new Atm();
        AtmApp app=new AtmApp();
        Scanner s=new Scanner(System.in);
        while(true)
        {
            app.atmMenu();
            int ch;
            System.out.println("\nEnter your choice:");
            ch=s.nextInt();
            switch(ch)
            {
                case 1:a.withdraw();
                break;

                case 2:a.deposit();
                break;

                case 3:a.checkBalance();
                break;

                case 4:
                System.out.println("-----------------------------------------");
                System.out.println("Thank you for using the ATM. Goodbye!");
                System.out.println("-----------------------------------------");
                return;

                default:System.out.println("Invalid choice. Please try again.");
            }
            
        }
    }
}