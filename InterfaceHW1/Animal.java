package InterfaceHW1;

public abstract class Animal {
  int speed;
  double distance;

  Animal(int speed){
    this.speed = speed;
  }

  abstract void run(int hours);


  public double getDistance() {
    return distance;
  }
}
