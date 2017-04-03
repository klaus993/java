package algo3;

import composition.exercise.InsufficientFundsException;

/**
 * Created by Klaus on 3/4/2017.
 */
public class Main {

    public static void main(String[] args) throws MontoInvalido, InsufficientFundsException {
        Cuenta cuenta = new Cuenta(1, 1234);
        System.out.println(cuenta.getSaldo());
        cuenta.depositar(10);
        System.out.println(cuenta.getSaldo());
        try {
            cuenta.extraer(12344);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
