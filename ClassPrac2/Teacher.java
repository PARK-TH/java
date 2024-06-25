package ClassPrac2;

public class Teacher {
  private String Name;
  private int Age;
  private String Subject;

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

  public String getSubject() {
    return Subject;
  }

  public void setSubject(String subject) {
    Subject = subject;
  }

  public void print(){
    System.out.print("이\t름 : "+this.Name+"\t\t");
    System.out.print("나\t이 : "+this.Age+"\t\t");
    System.out.print("담당과목 : "+this.Subject+"\t\t\n");
  }
}
