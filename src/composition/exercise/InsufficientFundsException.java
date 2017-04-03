package composition.exercise;

/**
 * Created by Klaus on 3/4/2017.
 */

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() { super("The amount is greater than the account balance."); }
    public InsufficientFundsException(String message) { super(message); }
    public InsufficientFundsException(String message, Throwable cause) { super(message, cause); }
    public InsufficientFundsException(Throwable cause) { super(cause); }
}
