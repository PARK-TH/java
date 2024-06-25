package ClassPrac;

public class Movie {
  //필드
  private String title;
  private String genre;

  //메소드
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public void play(String title, String genre){
    System.out.println(this.title+ "("+this.genre+") 상영중입니다.");
  }
}
