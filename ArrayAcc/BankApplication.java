package ArrayAcc;

import java.util.Scanner;

public class BankApplication extends Account {
  public static int FirstMoney;
  static Scanner BAsc = new Scanner(System.in);
  static String[] array = new String[100];
  String[] id;
  int cnt = 0;

  void accCreate() {
    System.out.println("-----------");
    System.out.println("계좌생성");
    System.out.println("-----------");
    System.out.print("계좌번호: ");
    String str = BAsc.nextLine();
    System.out.print("계좌주: ");
    String str1 = BAsc.nextLine();
    System.out.print("초기입금액: ");
    FirstMoney = Integer.parseInt(BAsc.nextLine());
    System.out.print("결과: 계좌가 생성되었습니다.");
    array[cnt] = str + "\t\t" + str1 + "\t\t" + FirstMoney;
    System.out.println(array[cnt]);
    cnt++;
  }

  void check() {
    for (int i = 0; i < array.length; i++) {
      if (cnt > i) {
        System.out.println(array[i]);
      } else if (i > cnt) {
      } else if (i == 0) {
        System.out.println("개설된 계좌가 없습니다.");
      }
    }

  }

  void accSave() {
    int try1 =0;
    System.out.println("-----------");
    System.out.println("예금");
    System.out.println("-----------");
    System.out.print("계좌번호: ");
    String str = BAsc.nextLine();
    for (int i = 0; i < cnt; i++) {
        String[] strChange = array[i].split("\t\t");
      if (strChange[0].equals(str)) {
        save();
      }
      }
    }
  }



