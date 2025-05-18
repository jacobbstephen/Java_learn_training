package exceptions.advanced.bankingApp;

class InsufficientBalance extends Exception {
    public InsufficientBalance(String str) {
        super(str);
    }
}

