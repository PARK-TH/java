package InterfaceHW1;

public class Dog extends Animal {

  Dog(int speed){
    super(speed);
  }

  public void run(int hours){
    distance = speed*((double)hours/2);
  }
}
