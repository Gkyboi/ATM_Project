public class atmCountdown {
    public static void atmDelay(){
        System.out.print("Please wait... ATM tries to read your card");

        for (int i=1; i<=3; i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
        }
        System.out.println("");
    }
    public static void atmTransactionDelay(){
        System.out.println("Please wait... Your transaction is processing");
        for (int i=1; i<=5; i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
        }
        System.out.println("");
    }
}
