package ClassPrac5;

public class Student {
private String name;
private String subject;
private int fee;
private double returnFee;

public static void main(String[] args){
	Student stu = new Student("차은우", "jspprogram", 500000);
	stu.calcReturnFee();
	stu.print(stu.name, stu.subject, stu.fee, stu.returnFee);
}


public void calcReturnFee(){
	if(subject.equals("javaprogram")){
		returnFee=(double)fee/4;
	} else if(subject.equals("jspprogram")){
    returnFee=(double)fee/5;
  } else{
    System.out.println("그런 과정명은 없습니다");
		System.exit(0);
  }
}


public void print(String name, String subject, int fee, double returnFee){
	System.out.println("이름은 " + name + "입니다.");
	System.out.println("과정명은 " + subject + "입니다.");
	System.out.println("교육비는 " + fee + " 원 입니다.");
	System.out.println("환급금은 " + returnFee + "원 입니다.");
}

public Student(String name, String subject, int fee){
  this.name = name;
  this.subject = subject;
  this.fee = fee;
}
}
