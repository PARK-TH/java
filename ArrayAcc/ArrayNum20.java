package ArrayAcc;

import java.util.Scanner;

public class ArrayNum20 {

  static int cnt = 0;
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Account Acc = new Account();
    BankApplication BA = new BankApplication();
    boolean exit = true;
    while (exit) {
      System.out.println("---------------------------------------");
      System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금 |5.종료 ");
      System.out.println("---------------------------------------");
      System.out.print("선택>\t");
      int num = Integer.parseInt(sc.nextLine());
      switch (num) {
        case 1:
          BA.accCreate();
          break;
        case 2:
          BA.check();
          break;
        case 3:
          BA.accSave();
          break;
        case 4:
          break;
        case 5:
          System.out.println("프로그램 종료");
          System.exit(0);
          break;
      }
    }
  }

}

