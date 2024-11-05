import java.util.HashMap;
import java.util.Scanner;

public class atmInterface {
    public static void main(String[] args) {
        bankUser u1 = new bankUser("Alperen","1","1234",5000);
        bankUser u2 = new bankUser("Oguz","2","4321",10000);
        Scanner option = new Scanner(System.in);
        String userPassword;
        String uniqueId;
        atmCountdown.atmDelay();
        atmMenu.atmWelcome();
        uniqueId = option.nextLine();
        userPassword = option.nextLine();
        HashMap<String, String> bank_user_info = new HashMap<String, String>();
        bank_user_info.put("Alperen","1234");
        bank_user_info.put("Oguz","4321");

        boolean bool = true;

        while (bool=true){

            if(bank_user_info.get(uniqueId).equals(userPassword)){
                atmMenu.atmOptions();
                int transactionOption = option.nextInt();
                if(transactionOption==1){
                    System.out.println("Enter how much money you want to deposit");
                    int depositAmount;
                    depositAmount = option.nextInt();
                    atmCountdown.atmTransactionDelay();
                    u1.deposit(depositAmount);

                }
                else if(transactionOption==2){
                    System.out.println("Enter how much money you want to withdraw");
                    int withdrawAmount;
                    withdrawAmount = option.nextInt();
                    atmCountdown.atmTransactionDelay();
                    u1.withdraw(withdrawAmount);
                }
                else if(transactionOption==3){
                   // System.out.println("Please type the receiver name: "); // Disabled because its predefined in line 48. u1 >> u2
                    String receiverAcc = option.nextLine();
                    System.out.println("Please type the amount: ");
                    int transferAmount;
                    transferAmount = option.nextInt();
                    atmCountdown.atmTransactionDelay();
                    u1.transfer(transferAmount,u2);
                }
                else if(transactionOption==4){
                    atmMenu.atmReceipt();
                    System.out.println("Please take your card");
                    bool = false;
                    return;
                }
                else
                    System.out.println("Please select a valid option!");
            }
            else
                System.out.println("Invalid Password");

        }

    }
}
