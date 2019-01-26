package homework15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver").newInstance();
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }

    Connection conn = null;
    try {
      conn = DriverManager
          .getConnection("jdbc:mysql://s3.thehost.ua/itea2?" + "user=helen&password=123456");
      System.out.println("Connection OK");
    } catch (SQLException ex) {
      // handle any errors
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
    }

    Statement st = null;
    try {
      st = conn.createStatement();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    String sql = "SELECT * FROM ss";
    ResultSet rs = null;
    try {
      rs = st.executeQuery(sql);
      System.out.println("ResultSet OK");
    } catch (SQLException e) {
      System.out.println("bad sql");
      e.printStackTrace();
    }
    if (rs != null) {
      try {
        System.out.println();
        while (rs.next()) {
          System.out.println(rs.getString(5));
        }
        rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    String sqlAdd = "INSERT INTO ss VALUES(10,'Schelk','Alex','Man',23)";
    try {
      st.execute(sqlAdd);
      System.out.println("INSERT OK");
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

}
