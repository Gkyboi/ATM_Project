import java.util.HashMap;
import java.util.Scanner;

public class atmMenu {
    public static void atmWelcome(){
        System.out.println("Welcome to the X Bank ATM!");
        System.out.println("Please Type Your Unique ID and Password");
    }
    public static void atmOptions(){
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Transfer Money to Another Account");
        System.out.println("4. Exit");
    }
    public static void atmReceipt(){
        System.out.println("Would you like to receive a receipt?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Scanner scanner = new Scanner(System.in);
        int receiptOption;
        receiptOption = scanner.nextInt();
        atmCountdown.atmTransactionDelay();
        if(receiptOption==1){
            System.out.println("Please take your receipt");
        }
        else
            System.out.println("Thank you for protecting nature :)");
    }
}
