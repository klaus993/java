package algo3;

import composition.exercise.InsufficientFundsException;

/**
 * Created by Klaus on 3/4/2017.
 */
public class Cuenta {

    private Integer ID;
    private double saldo;

    public Cuenta(int ID) {
        this.ID = ID;
        this.saldo = 0.0;
    }

    public Cuenta(int ID, double saldo) {
        this.ID = ID;
        this.saldo = saldo;
    }

    public void depositar(double monto) throws MontoInvalido {
        if (monto <= 0) {
            throw new MontoInvalido();
        }
        this.saldo += monto;
    }

    public void extraer(double monto) throws MontoInvalido, InsufficientFundsException {
        if (monto <= 0) {
            throw new MontoInvalido();
        }
        if (this.ID < 10000) {
            if (monto > this.saldo) {
                throw new InsufficientFundsException();
            }
        } else {
            if (monto > this.saldo + 3000) {
                throw new InsufficientFundsException();
            }
        }
        this.saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}
