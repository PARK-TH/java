package boardpractice;

import boardpractice.dao.BoardServiceImpl;
import boardpractice.vo.Board;
import java.io.IOException;
import java.sql.SQLException;

public class BoardMain {

  public static void main(String[] args) {
    BoardServiceImpl service = new BoardServiceImpl();
    boolean running = true;

    try {
      while (running) {
        switch (service.showBoard()) {
          case 1 -> service.create();
          case 2 -> service.read();
          case 3 -> service.clear();
          case 4 -> running = false;
          default -> System.out.println("올바른 숫자를 입력해주세요.");
        }
      }
    } catch (IOException | SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
