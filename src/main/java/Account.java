public class Account {
    public String accountNumber;
    public String accountType;
    public double accountBalance;

    ;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public Account(String accountNumber, String accountType, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;

    }

    public void checkAccountBalance() {
        System.out.println("the account balance is " + getAccountBalance());


    }
    public void  deposit(double depositAmount){
        accountBalance = accountBalance + depositAmount;

    }
    public void withdrawal(double withdrawalAmount){
        accountBalance = accountBalance + withdrawalAmount;


    }



}
