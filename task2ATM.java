import java.util.Scanner;
public class task2ATM {
    private static double balance = 5000.0;
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        int choice;

        do{
            System.out.println("Welcome to the ATM interface");
            System.out.println("1.Check your account balance:");
            System.out.println("2.Deposit:");
            System.out.println("3.Withdraw:");
            System.out.println("4.Exit:");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                  checkBalance();
                  break;

                case 2:
                  deposit(scanner);
                  break;

                case 3:
                  withdraw(scanner);
                  break;

                case 4:
                  System.out.println("Thank you for using the ATM interface.GOODBYE!");
                  break;

                default:
                  System.out.println("Invalid Choice.Please enter another number between 1 to 4.");
            }
        }while(choice!=4);
       // Scanner.close();


    }
    private static void checkBalance(){
        System.out.println("Your current balance is:Rs" + balance);
    }
    private static void deposit(Scanner scanner){
        System.out.println("Enter the amount to deposit:");
        double amount = scanner.nextDouble();

        balance += amount;
        System.out.println("Deposit Successful.\n Your new balance is: Rs"+ balance);
    }
    private static void withdraw(Scanner scanner){
        System.out.println("Enter the amount to withdraw:");
        double amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insuufficient funds. \nWithdrawal failed");
        }else{
            balance-=amount;

            System.out.println("Withdrawal successful.\n Your new balance is: Rs" + balance);
        }
    }
    
}
