import javax.swing.*;
import java.sql.*;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        String password = "Anaspiderman17298";
        String url ="jdbc:mysql://localhost:3306/testbd";
        String user = "root";
        try {
            Connection myConn = DriverManager.getConnection(url,user, password);

            Statement myStmt = myConn.createStatement();
            String sql = "select * from utilizator";
            ResultSet rs = myStmt.executeQuery(sql);
            while  (rs.next()){

                System.out.println(rs.getString("name") +" " +  rs.getString("birth"));

               // System.out.println(rs.getString("birth"));
            }


            rs.close();
            myStmt.close();
            myConn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
