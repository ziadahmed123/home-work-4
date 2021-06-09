package hw4;
import java.text.NumberFormat;
/**
 *
 * @author omar
 */


public class E_Wallet {

    private NumberFormat fmt = NumberFormat.getCurrencyInstance();
    protected double balance;
    protected String email;
    private float amount;
  
  /** constructor sets the amount to be paid 
    * 
    * @param amount
    **/
  public E_Wallet (float amount) {
    this.amount = amount;
  }
  
  /** get the amount to be paid 
    * @return the mount that needs to be paid. 
    */
  public float getAmount () {
    return amount;
  }
// @param constructor

    public E_Wallet(String user) {
        email = user;
        balance = 0;
    }
    
    /**
     * function to validate the transaction, then pay the needed amount by the
     * user.
     *
     * @param amount
     * @return 
     * @Return the new balance.
     */
    public double Pay(double amount) {
        if (amount < 0) // payment value by negative
        {
            System.out.println();
            System.out.println("Error: payment amount is invalid.");
            System.out.println(email + " " + fmt.format(amount));
        } else {
            balance = balance + amount;
        }
        return balance;
    }

    /**
     * function to validate the transaction, then collect the needed amount from
     * the user.
     *
     * @param amount
     * @param fee
     * @return 
     * @Return the new balance.
     */
    public double Collect(double amount, double fee) // collecting by playground owner
    {
        amount += fee;
        if (amount < 0) // collecting value by negative
        {
            System.out.println();
            System.out.println("Error, Collecting amount is invalid.");
            System.out.println("User: " + email);
            System.out.println("Requested: " + fmt.format(amount));
        } else if (amount > balance) // collecting value is morethan the amount
        {
            System.out.println();
            System.out.println("Error, Insufficient money.");
            System.out.println("User: " + email);
            System.out.println("Requested: " + fmt.format(amount));
            System.out.println("Available: " + fmt.format(balance));
        } else {
            balance = balance - amount;
        }
        return balance;
    }
    
}

