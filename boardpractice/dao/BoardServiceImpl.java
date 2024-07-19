package boardpractice.dao;

import boardpractice.boardinterface.BoardService;
import boardpractice.dblib.BoardConnection;
import boardpractice.vo.Board;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardServiceImpl implements BoardService {
  public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public BoardConnection bc = new BoardConnection();
  public SimpleDateFormat d = new SimpleDateFormat("yyyy.MM.dd");


  public int showBoard() throws SQLException {
    String query = "SELECT*FROM Board";
    Connection connection = bc.getConnection();
    PreparedStatement pStmt = connection.prepareStatement(query);
    ResultSet rs = pStmt.executeQuery(query);
    System.out.println("---------------------------------------------------------");
    System.out.println("no\t\twriter\t\t\tdate\t\t\t\t\t\t\ttitle");
    System.out.println("---------------------------------------------------------");

    try {
        while (rs.next()) {
          int bno = rs.getInt("bno");
          String bwriter = rs.getString("bwriter");
          java.util.Date bdate = rs.getDate("bdate");
          String btitle = rs.getString("btitle");
          System.out.printf("%-5d %-11s %-17s %-20s\n",
              bno, bwriter, d.format(bdate), btitle);
        }
      } catch (NullPointerException e) {
        throw new RuntimeException(e);
      } finally {
        bc.close(connection, pStmt, rs);
      }

    System.out.println("---------------------------------------------------------");
    System.out.println("메인 메뉴:  1.Create | 2.Read  | 3.Clear | 4.Exit");
    System.out.print("메뉴 선택:  ");

    int startSwitch = 0;
    try {
      startSwitch = Integer.parseInt(br.readLine());
    } catch (NumberFormatException | IOException e) {
      throw new RuntimeException("올바른 숫자를 입력해주세요");
    }
    return startSwitch;
  }

  public void create() throws IOException {
    Date today = new Date();
    Board board = new Board();

    String query = "INSERT INTO Board ( btitle, bcontent, bwriter, bdate)"
        + " VALUES (    ?,       ?,        ?,      ?)";

    Connection connection = null;
    PreparedStatement pStmt = null;
    try {
      connection = bc.getConnection();
      pStmt = connection.prepareStatement(query);

      System.out.println("[새 게시물 입력]");
      System.out.print("제목: ");
      board.setBtitle(br.readLine());

      System.out.print("내용: ");
      board.setBcontent(br.readLine());

      System.out.print("작성자: ");
      board.setBwriter(br.readLine());


      java.sql.Date sqlDate = new java.sql.Date(today.getTime());
      board.setBdate(sqlDate);

      System.out.println("보조 메뉴: 1.OK | 2.Cancel");
      System.out.print("메뉴 선택: ");
      int num = Integer.parseInt(br.readLine());
      try {

        if (num == 1) {

          //stmt.setInt(1, board.getBno());
          pStmt.setString(1, board.getBtitle());
          pStmt.setString(2, board.getBcontent());
          pStmt.setString(3, board.getBwriter());
          pStmt.setDate(4, (java.sql.Date) board.getBdate());
          pStmt.executeUpdate();
          System.out.println("게시글이 작성되었습니다.");
        } else if (num == 2) {
          System.out.println("게시글 작성이 취소되었습니다.");
        }
      } catch (NumberFormatException e) {
        throw new RuntimeException(e);
      }

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    bc.close(connection, pStmt);
  }

  //찾은 것을 보낸다!
  public void read() throws IOException {
    String query = "SELECT * FROM board WHERE bno = ?";
    int num = 0;
    Board find = new Board();

    try {
      System.out.println("[게시물 읽기]");
      System.out.print("bno: ");
      num = Integer.parseInt(br.readLine());
    } catch (NumberFormatException e) {
      throw new RuntimeException("올바른 번호를 입력해주세요");
    }

    Connection connection = null;
    PreparedStatement pStmt = null;
    ResultSet rs = null;

    try {
      connection = bc.getConnection();
      pStmt = connection.prepareStatement(query);
      pStmt.setInt(1, num);
      rs = pStmt.executeQuery();


      if (rs.next()) {
        find.setBno(rs.getInt("bno"));
        find.setBtitle(rs.getString("btitle"));
        find.setBcontent(rs.getString("bcontent"));
        find.setBwriter(rs.getString("bwriter"));
        find.setBdate(rs.getDate("bdate"));

        System.out.println("###############");
        System.out.println("번호: " + find.getBno());
        System.out.println("제목: " + find.getBtitle());
        System.out.println("내용: " + find.getBcontent());
        System.out.println("작성자: " + find.getBwriter());
        System.out.println("날짜: " + d.format(find.getBdate()));
        System.out.println("###############");
        System.out.println("1. Update 2. Delete 3. List");
        System.out.print("메뉴 선택: ");
      } else {
        System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
        return;
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      bc.close(connection, pStmt, rs);
    }

    try {
      int Num = Integer.parseInt(br.readLine());
      switch (Num) {
        case 1 -> update(find);
        case 2 -> delete(find);
        case 3 -> list();
        default -> System.out.println("올바른 번호를 입력해주세요.");
      }
    } catch (NumberFormatException e) {
      throw new RuntimeException("올바른 번호를 입력해주세요.");

    }

  }

  public void clear() throws IOException {
    String query = "TRUNCATE table board";

    Connection connection = null;
    PreparedStatement pStmt = null;
    try {
      System.out.println("정말 게시판을 초기화하시겠습니까?");
      System.out.println("초기화된 내용은 복구되지 않습니다.");
      System.out.println("보조 메뉴: 1.OK | 2.Cancel");
      System.out.print("메뉴 선택: ");
      int num = 0;
      try {
        num = Integer.parseInt(br.readLine());
      } catch (NumberFormatException e) {
        throw new RuntimeException("올바른 번호를 입력해주세요");
      }
      if (num == 1) {
        connection = bc.getConnection();
        pStmt = bc.getConnection().prepareStatement(query);
        pStmt.executeUpdate();
        System.out.println("초기화되었습니다.");
      } else if (num == 2) {
        System.out.println("초기화가 취소되었습니다.");
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    bc.close(connection, pStmt);
  }

  @Override
  public void update(Board board) throws IOException {
    String query = "UPDATE Board SET btitle = ?, bcontent = ?, bwriter = ? WHERE bno = ?";
    Connection connection = null;
    PreparedStatement pStmt = null;
    try {
      connection = bc.getConnection();
      pStmt = connection.prepareStatement(query);

      System.out.println("[새 게시물 입력]");
      System.out.print("제목: ");
      board.setBtitle(br.readLine());

      System.out.print("내용: ");
      board.setBcontent(br.readLine());

      System.out.print("작성자: ");
      board.setBwriter(br.readLine());

      int num = 0;
      try {
        System.out.println("정말로 수정하시겠습니까?");
        System.out.println("보조 메뉴: 1.OK | 2.Cancel");
        System.out.print("메뉴 선택: ");
        num = Integer.parseInt(br.readLine());
      } catch (NumberFormatException e) {
        throw new RuntimeException(e);
      }

      if (num == 1) {
        pStmt.setString(1, board.getBtitle());
        pStmt.setString(2, board.getBcontent());
        pStmt.setString(3, board.getBwriter());
        pStmt.setInt(4, board.getBno());
        pStmt.executeUpdate();
        System.out.print("수정 되었습니다.");
        //수정완료
      } else if (num == 2) {
        System.out.println("수정이 취소되었습니다.");
      }

    } catch (SQLException | NullPointerException e) {
      throw new RuntimeException(e);
    } finally {
      bc.close(connection, pStmt);
    }

  }

  @Override
  public void delete(Board board) throws IOException {
    String query = "DELETE FROM Board WHERE bno = ?";

    System.out.println("정말 삭제하시겠습니까?");
    System.out.println("삭제된 내용은 복구되지 않습니다.");
    System.out.println("보조 메뉴: 1.OK | 2.Cancel");
    System.out.print("메뉴 선택: ");
    int num = Integer.parseInt(br.readLine());

    Connection connection = null;
    PreparedStatement pStmt = null;
    try {

      if (num == 1) {
        connection = bc.getConnection();
        pStmt = bc.getConnection().prepareStatement(query);
        pStmt.setInt(1, board.getBno());
        pStmt.executeUpdate();
        System.out.println(board.getBno() + "번 게시글이 삭제되었습니다.");
      } else if (num == 2) {
        System.out.println("게시글 삭제가 취소되었습니다.");
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      bc.close(connection, pStmt);
    }
  }

  @Override
  public void list() {

  }
}