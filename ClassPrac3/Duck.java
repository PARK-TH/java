package ClassPrac3;

public class Duck{
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

  void fly(String oldName){
    System.out.println(oldName+"("+this.Name+")는 "+"날지 않습니다.");
  }
  void sing(String oldName){
    System.out.println(oldName+"("+this.Name+")는 "+"소리내어 웁니다.");
  }

  public String toString(String oldName){
    return oldName+"의 이름은 " + this.Name + "입니다.";
  }

  Duck(String Name,int legs, int length){
    this.Name = Name;
    this.legs = legs;
    this.length =length;
  }

}