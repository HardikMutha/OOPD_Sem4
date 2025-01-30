public class BankAccount {
  private String nameOfDepositor;
  private String AccountNumber;
  // private String typeOfAccount;
  private double AccountBalance;
  static String BankName = "S.B.I";

  public BankAccount(String nameOfDepositor, String AccountNumber,double AccountBalance)
  {
    this.nameOfDepositor = nameOfDepositor;
    this.AccountNumber = AccountNumber;
    // this.typeOfAccount = typeOfAccount;
    this.AccountBalance = AccountBalance;
  }

  static void setBankName(String bankName)
  {
    BankName = bankName;
  }

  public void depositAmount(double Amount)
  {
    this.AccountBalance+=Amount;
  }

  public void withDrawAmmout(double Amount)
  {
    if(Amount<this.AccountBalance)
    {
      this.AccountBalance-=Amount;
    }
    else{
      System.out.println("Insufficient Balance");
    }
  }

  public String toString()
  {
    return ("Name: "+this.nameOfDepositor+"\nAccountNumber : "+this.AccountNumber+"\n Balance "+this.AccountBalance + "\nBank Name : "+BankName);
  }

}



