package ClassPrac7;

public class Prob1 {

  public static void main(String[] args) {
    //Wheeler wheeler = new Bike();
    Bike bike = new Bike(30, 2, "스쿠터");
    Truck truck = new Truck(50,4,"포터");

    bike.speedUp(15);
    bike.speedDown(10);
    bike.stop();


    truck.speedUp(40);
    truck.speedDown(20);
    truck.stop();
  }
}
