public void depositar(double amount) {
    if (amount > 0) {
        saldo += amount;
    } else {
        throw new IllegalArgumentException("Amount must be positive");
    }
}