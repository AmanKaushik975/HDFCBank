public interface BankAccountInterface {
        // all funnctions
    double fetchBalance(String password);

    String addMoney(double amount);

    String withdrawMoney(double money , String password);

    String changePassword(String oldPass , String newPass);

    double calIntrest(int year);

}
