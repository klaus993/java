package algo3;

/**
 * Created by Klaus on 3/4/2017.
 */

public class MontoInvalido extends Exception {
    public MontoInvalido() { super("El monto especificado es inválido"); }
    public MontoInvalido(String message) { super(message); }
    public MontoInvalido(String message, Throwable cause) { super(message, cause); }
    public MontoInvalido(Throwable cause) { super(cause); }
}