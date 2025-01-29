public class Main {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount("Hardik Mutha","12345", 44.31);
    BankAccount b2 = new BankAccount("Tanmay", "52426", 100000);
    BankAccount b3 = new BankAccount("Suswan", "425252", 5531);
    BankAccount b4 = new BankAccount("Alhad", "12469", 8583);
    System.out.println(BankAccount.BankName);
    BankAccount.setBankName("HDFC Bank");
    System.out.println(BankAccount.BankName);
    System.out.println(b1);
  }
}
