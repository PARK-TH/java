package ClassPrac7;

public class Bike extends Wheeler {

  public Bike(){

  }

  public Bike(int velocity, int wheelNumber, String carName){
    super(velocity, wheelNumber, carName);
  }

  @Override
  public void speedUp(int speed) {
    System.out.println("바이크의 속도가 "+speed+ " 상승했습니다.");
    System.out.println("현재 속도는 "+ (speed+velocity) + "입니다.");
  }

  @Override
  public void speedDown(int speed) {
    System.out.println("바이크의 속도가 "+speed+ " 감속했습니다.");
    System.out.println("현재 속도는 "+ (speed+velocity) + "입니다.");
  }

  @Override
  public void stop() {
    super.stop();
  }


}
