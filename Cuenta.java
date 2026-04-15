public class Cuenta {
    private double balance;

    public Cuenta(double initialBalance) {
        this.balance = initialBalance;
    }

    public void retirar(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Fondos insuficientes para retirar.");
        }
    }
}