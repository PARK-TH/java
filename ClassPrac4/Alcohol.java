package ClassPrac4;

public class Alcohol extends Drink{
  double alcper;

  public static void printTitle(){
    System.out.println("상품명(도수[%])\t단가\t\t수량\t\t금액");
  }
  void printData(){
    System.out.println(name + "\t" +"("+ alcper+")"+ "\t\t" + price + "\t" + count + "\t\t\t" + getTotalPrice());
  }

  Alcohol(String name, int price, int count, double alcper){
    super(name, price, count);
    this.alcper = alcper;
  }

}
