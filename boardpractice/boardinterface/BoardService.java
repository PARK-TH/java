package boardpractice.boardinterface;

import boardpractice.vo.*;
import java.io.IOException;
import java.sql.SQLException;

public interface BoardService {
  void create() throws IOException, SQLException;
  void read() throws IOException;
  void clear() throws IOException;

  void update(Board board) throws IOException;
  void delete(Board board) throws IOException;
  void list() throws IOException;
}