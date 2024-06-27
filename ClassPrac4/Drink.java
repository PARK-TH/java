package ClassPrac4;

public class Drink {
  String name;
  int price;
  int count;
  int total;

  int getTotalPrice(){
    total = price*count;
    return total;
  }

  public static void printTitle(){
    System.out.println("상품명\t\t단가\t\t수량\t\t금액");
  }
  void printData(){
    System.out.println(name +"\t\t\t"+ price +"\t" + count +"\t\t\t"+getTotalPrice());
  }

  Drink(String name, int price, int count){
    this.name = name;
    this.price = price;
    this.count = count;
  }

}
