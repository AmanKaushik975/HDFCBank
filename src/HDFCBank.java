import java.util.UUID;

public class HDFCBank implements BankAccountInterface{

    private String name;

    private String accountNo;

    private String passwword;

    private double balance;

    final double roi = 7.1;

    final String IFSCCode = "HDFC1234";

    // default cons
    public HDFCBank() {

    }



    // para cons
    public HDFCBank(String name, String passwword, double balance) {
        this.name = name;
        this.passwword = passwword;
        this.balance = balance;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }


    // Getter And Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPasswword() {
        return passwword;
    }

    public void setPasswword(String passwword) {
        this.passwword = passwword;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRoi() {
        return roi;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    @Override
    public double fetchBalance(String password) {
        if(this.passwword.equals(password)){
            return this.balance;
        }
        return -1;
    }

    @Override
    public String addMoney(double amount) {
            this.balance += amount;

            return "Available Balance";
    }

    @Override
    public String withdrawMoney(double money, String password) {
        if(this.passwword.equals(password)){
            if(this.balance < money){
                return "Insuficient Balance";
            }
            this.balance -= money;
            return "Amount deducted : " +money+" ,Available Balance "+this.balance;
        }
        return "Incorrect Password";
    }

    @Override
    public String changePassword(String oldPass, String newPass) {
        if(oldPass.equals(passwword)){
            this.passwword = newPass;
            return "Password Changed Successfully!";
        }
        return " Password not match!!";
    }

    @Override
    public double calIntrest(int year) {
        return (this.balance*year+roi)/100.0;
    }

    @Override
    public String toString() {
        return "HDFCBank{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", passwword='" + passwword + '\'' +
                ", balance=" + balance +
                ", roi=" + roi +
                ", IFSCCode='" + IFSCCode + '\'' +
                '}';
    }
}
