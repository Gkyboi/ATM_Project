public class bankUser {
    String userName;
    String accId;
    String accPassword;
    int accBalance;

    public int getAccBalance() {
        return accBalance;
    }

    public String getAccPassword() {
        return accPassword;
    }

    public bankUser(String userName, String accId, String accPassword, int accBalance) {
        this.userName = userName;
        this.accId = accId;
        this.accPassword = accPassword;
        this.accBalance = accBalance;
    }
    public void withdraw(int amount){
        if(amount<=this.accBalance){
            this.accBalance = this.accBalance - amount;
            System.out.println("You've successfully withdrawn money!");
            System.out.println("Your new balance is: " +this.accBalance);
        }
        else
            System.out.println("Your balance is not enough for transaction");
    }
    public void deposit(int amount){
        this.accBalance = this.accBalance + amount;
        System.out.println("You've successfully deposited money!");
        System.out.println("Your new balance is: " +this.accBalance);
    }
    public void transfer(int amount, bankUser acc){
        if (amount<this.accBalance){
            this.accBalance = this.accBalance - amount;
            acc.accBalance = acc.accBalance + amount;
            System.out.println("Transfer is successfully completed");
            System.out.println("Your new balance is: "+this.accBalance);
        }
        else
            System.out.println("You do not have enough money");
    }
}
