package ClassPrac3;

public class Sparrow{
  String Name;
  int legs;
  int length;

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public int getLegs() {
    return legs;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  void fly(String oldName1){
    System.out.println(oldName1+"("+this.Name+")가 "+"날아다닙니다.");
  }
  void sing(String oldName1){
    System.out.println(oldName1+"("+this.Name+")가 "+"소리내어 웁니다.");
  }

  public String toString(String oldName1){
    return oldName1+"의 이름은 " + this.Name + "입니다.";
  }

  Sparrow(String Name,int legs, int length){
    this.Name = Name;
    this.legs = legs;
    this.length =length;
  }

}