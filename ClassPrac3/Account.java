package ClassPrac3;

public class Account{
  private String AccNo;
  private int Balance;

  public String getAccNo() {
    return AccNo;
  }

  public void setAccNo(String accNo) {
    AccNo = accNo;
  }

  public int getBalance() {
    return Balance;
  }

  public void setBalance(int balance) {
    Balance = balance;
  }

  public void save(int save){
    Balance += save;
    System.out.println(AccNo +" 계좌에 "+ save + "만원이 입금되었습니다.");
  }

  public void deposit(int deposit){
    Balance -= deposit;
    System.out.println(AccNo +" 계좌에 "+ deposit + "만원이 입금되었습니다.");

  }

}