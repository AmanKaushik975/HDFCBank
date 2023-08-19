public class Main {
    public static void main(String[] args) {
        HDFCBank aman = new HDFCBank("aman" , "aman123",2000);
        System.out.println(aman);
        System.out.println(aman.fetchBalance("aman123"));
        System.out.println(aman.addMoney(300.5));
        System.out.println(aman.withdrawMoney(200 , "aman123"));
        System.out.println(aman.calIntrest(3));
    }
}