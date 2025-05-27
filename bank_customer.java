


 class bank_cus {
    String custName;
    String custId;
    String custAddress;

    public bank_cus(String name, String id, String address) {
        this.custName = name;
        this.custId = id;
        this.custAddress = address;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer ID: " + custId);
        System.out.println("Customer Address: " + custAddress);
    }
}

public class bank_customer {
    public static void main(String[] args) {
        bank_cus customer = new bank_cus("John Doe", "CUST123", "123 Main St");
        bank_tran transaction = new bank_tran("SBI", "John Doe", "Savings", "ACC987654", 10000.50);

        customer.displayCustomerDetails();
        transaction.displayTransactionDetails();
    }
}

