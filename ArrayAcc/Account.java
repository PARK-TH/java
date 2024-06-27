package ArrayAcc;

import java.util.Scanner;

public class Account extends ArrayNum20 {
  int balance = BankApplication.FirstMoney ;
  int save;
  int deposit;
  public void save() {
    System.out.print("예금액 : ");
    save = Integer.parseInt(sc.nextLine());
    if (save > 0) {
      balance += save;
      System.out.println(save+"원이 입금되었습니다.\n잔고는 "+ balance +"원입니다.");
    } else if (save < 0) {
      System.out.println("0원 이상을 입금해주세요");
      save = 0;
    }
  }
  public void deposit(){
    System.out.print("출금액 : ");
    deposit = Integer.parseInt(sc.nextLine());
    if (balance-deposit > 0) {
      this.balance -= deposit;
      System.out.println("출금이 성공되었습니다.");
    } else if (balance-deposit < 0) {
      System.out.println("0원 이하로는 출금하실 수 없습니다.");
    }
    System.out.println(balance);
  }

}
