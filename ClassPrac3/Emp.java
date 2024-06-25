package ClassPrac3;

  public class Emp {
  private String Id;
  private String Name;
  private double BaseSalry;

    public String getId() {
      return Id;
    }

    public void setId(String str1) {
      Id = str1;
      System.out.println("입력된 아이디는 " + this.Id + " 입니다.");
    }

    public String getName() {
      return Name;
    }

    public void setName(String str2) {
      Name = str2;
      System.out.println("입력된 이름은 " + this.Name + " 입니다.");

    }

    public double getBaseSalry() {
      return BaseSalry;
    }

    public void setBaseSalry(double baseSalry) {
      BaseSalry = baseSalry;
    }
    public String toString() {
      return Name + "("+Id+") 사원의 기본급은 "
          + (int)BaseSalry+"원 입니다.\n봉급 = " + (BaseSalry + (BaseSalry*30));
    }

  }