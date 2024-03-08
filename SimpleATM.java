import java.util.Scanner;

public class SimpleATM {
        public static void main(String[] agrs){
            int  Balance = 50000;
            int Deposit ;
            int Withdraw ;
            int Exit;
        System.out.println("1. Check Balance");
        System.out.println("2. Add Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        Scanner obj = new Scanner(System.in);
        int s = obj.nextInt();
        
        
        switch (s) {
            case 1: System.out.println("Your Current balance is: " + Balance);
                
                break;
                case 2: System.out.println("Enter the Amount : ");
                Deposit = obj.nextInt();
                Balance = Deposit + Balance;
                System.out.println("Successfully Credited your Amount.");
                System.out.println("Current Balance : " + Balance);
                break;
                case 3: System.out.println("Enter your Amount");
                Withdraw = obj.nextInt();
                if(Balance >= Withdraw){
                    Balance = Balance - Withdraw;
                    System.out.println("Successfully Withdralled.");
                    System.out.println("Current amount : " + Balance);
                }
                else{
                    System.out.println("Insufficient Balance");
                }
                case 4: System.out.println("Exiting the ATM.");
                System.exit(0);
        
            default: System.out.println("Invalid Option.");
                break;
        }
    }
}