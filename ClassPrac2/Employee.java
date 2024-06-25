package ClassPrac2;

public class Employee {
  private String Name;
  private int Age;
  private String Dept;

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public int getAge() {
    return Age;
  }

  public void setAge(int age) {
    Age = age;
  }

  public String getDept() {
    return Dept;
  }

  public void setDept(String dept) {
    Dept = dept;
  }

  public void print(){
    System.out.print("이\t름 : "+this.Name+"\t\t");
    System.out.print("나\t이 : "+this.Age+"\t\t");
    System.out.print("부\t\t서 : "+this.Dept+"\t\t\n");
  }
}
