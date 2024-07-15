package InterfaceHW1;

public class AnimalTest {

  public static void main(String[] args) {
    Dog dog = new Dog(8);
    Chicken chicken = new Chicken(3);
    Chicken cheatableChicken = new Chicken(5);

    if(cheatableChicken instanceof Cheatable){
      cheatableChicken.fly();
    }

    for (int hours = 1; hours <=3; hours++){
      System.out.println(hours + "시간 후");

      dog.run(hours);
      chicken.run(hours);
      cheatableChicken.run(hours);

      System.out.println("개의 이동거리 = " + dog.getDistance());
      System.out.println("닭의 이동거리 = " + chicken.getDistance());
      System.out.println("날으는 닭의 이동거리 = " + cheatableChicken.distance);
    }
  }

}
