public class BankAccount {
    String accNumber;
    double accBalance;
    String ownerName;
    String ownerAdress;
    boolean isActive;
    boolean hasDebitCard;
    String pin;
    String bankName;

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerAdress() {
        return ownerAdress;
    }

    public void setOwnerAdress(String ownerAdress) {
        this.ownerAdress = ownerAdress;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isHasDebitCard() {
        return hasDebitCard;
    }

    public void setHasDebitCard(boolean hasDebitCard) {
        this.hasDebitCard = hasDebitCard;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public BankAccount(String accNumber, double accBalance, String ownerName, String ownerAdress, boolean isActive,
            boolean hasDebitCard, String pin, String bankName) {
        this.accNumber = accNumber;
        this.accBalance = accBalance;
        this.ownerName = ownerName;
        this.ownerAdress = ownerAdress;
        this.isActive = isActive;
        this.hasDebitCard = hasDebitCard;
        this.pin = pin;
        this.bankName = bankName;
    }
    public void deposit(double amount){
        this.accBalance+=amount;
    }
    public void withdraw(double amonut){
        this.accBalance-=amonut;
    }

}
