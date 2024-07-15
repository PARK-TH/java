package InterfaceHW1;

public class Chicken extends Animal implements Cheatable {

  Chicken(int speed){
    super(speed);
  }

  void run(int hours) {
    distance = speed*hours;
  }

  public void fly(){
    speed *=2;
  }
}
