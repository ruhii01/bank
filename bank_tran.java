package bank;

public class bank_tran {
    String accountName;
    String accountHolderName;
    String accountType;
    String accountNo;
    double balance;

    public bank_tran(String bank, String holder, String type, String number, double bal) {
        this.accountName = bank;
        this.accountHolderName = holder;
        this.accountType = type;
        this.accountNo = number;
        this.balance = bal;
    }

    public void displayTransactionDetails() {
        System.out.println("Bank Name: " + accountName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNo);
        System.out.println("Balance: " + balance);
    }
}
