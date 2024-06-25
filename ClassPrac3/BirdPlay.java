package ClassPrac3;

public class BirdPlay {
 
	public static void main(String[] args){

		Duck duck = new Duck("오리", 2, 18);

		String oldName = duck.getName();
		duck.setName("꽥꽥이");
		duck.fly(oldName);
		duck.sing(oldName);
		System.out.println(duck.toString(oldName));
		
		Sparrow sparrow = new Sparrow("참새", 2 ,7);
		String oldName1 = sparrow.getName();
		sparrow.setName("짹짹");
		sparrow.fly(oldName1);
		sparrow.sing(oldName1);
		System.out.println(sparrow.toString(oldName1));

	}


}
