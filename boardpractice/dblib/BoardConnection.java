package boardpractice.dblib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lombok.*;

@Data
public class BoardConnection {
  private static final String url = "jdbc:mysql://localhost:3306/BoardExample";
  private static final String name = "root";
  private static final String password = "Mysql1234!?";

  public Connection getConnection () {
    Connection connection = null;
    try {
      connection = DriverManager.getConnection(url, name, password);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    return connection;
  }


  public void close (Connection connection, PreparedStatement pStmt){
    try {
      if(pStmt != null)      pStmt.close();
      if(connection != null) connection.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public void close (Connection connection, PreparedStatement pStmt, ResultSet rs){
    try {
      if(pStmt != null)      pStmt.close();
      if(connection != null) connection.close();
      if(rs != null)         rs.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }


}
