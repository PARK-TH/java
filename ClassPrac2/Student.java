package ClassPrac2;

public class Student {
  private String Name;
  private int Age;
  private int Id;

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

  public int getId() {
    return Id;
  }

  public void setId(int Id) {
    this.Id = Id;
  }

  /*Student(String Name, int Age, int Id){
    this.Name = Name;
    this.Age = Age;
    this.Id = Id;
  }*/

  public void print(){
    System.out.print("이\t름 : "+this.Name+"\t\t");
    System.out.print("나\t이 : "+this.Age+"\t\t");
    System.out.print("학\t\t번 : "+this.Id+"\t\t\n");
  }
}
