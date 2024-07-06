package ClassPrac7;


 public abstract class Wheeler{
  protected int velocity;
  protected String carName;
  protected int wheelNumber;

 public Wheeler(){

 }

 public Wheeler(int velocity, int wheelNumber, String carName){
   this.velocity = velocity;
   this.wheelNumber = wheelNumber;
   this.carName = carName;
 }

 abstract public void speedUp(int speed);
 
 abstract public void speedDown(int speed);
 
 public void stop(){
	 velocity = 0;
   System.out.println(this.carName + "가 정지합니다.");
   System.out.println(this.carName + "의 속도는 " + this.velocity+"입니다.");
 }
}

