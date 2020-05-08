import java.io.FileInputStream;
import java.sql.*;
import java.sql.Connection;
import java.util.Properties;
import BazaDeDateExemplu.BdExemplu;
import com.mysql.cj.protocol.a.NativeUtils;


public class Main {
    public static void main(String[] args) throws SQLException {



    AppUsersDbOperations audop = new AppUsersDbOperations();

    //audop.create("Popescu","Gianina","giani@gmail.com","0236474448","21113232","123456");

    //BdExemplu.commit();

    audop.FindByName("Popescu");
       BdExemplu.commit();
    BdExemplu.closeConnection();



        /*
        Properties properties = new Properties();
        FileInputStream input = null;

        AppUser appUser1 = new AppUser(104, "Popescu", "George", "l@gmail.com", "12222222", "0236478784", "12345", 0);


        Connection myConn = null;

        try {

            input = new FileInputStream("src\\database.properties");
            properties.load(input);
            myConn = DriverManager.getConnection(
                    properties.getProperty("DB_URL"),
                    properties.getProperty("DB_USERNAME"),
                    properties.getProperty("DB_PASSWORD"));


            PreparedStatement stmt = myConn.prepareStatement("INSERT INTO appuser (nume, prenume,email,cnp,telefon,parola,contor_tabiet)  VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1, appUser1.getNume());
            stmt.setString(2, appUser1.getPrenume());
            stmt.setString(3, appUser1.getEmail());
            stmt.setString(4, appUser1.getCnp());
            stmt.setString(5, appUser1.getTelefon());
            stmt.setString(6, appUser1.getParola());
            stmt.setInt(7, appUser1.getContorTabiet());
            ResultSet rs = stmt.executeQuery();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myConn.close();
        }

        */

/*
            String sql = "Select * FROM appuser where email='" + appUser1.getEmail() + "' && parola='" + appUser1.getParola() + "'";

            ResultSet rs = st.executeQuery(sql);

            System.out.println(rs.getString("email"));
*/

        /*AppUser appUser1 = new AppUser(104, "Popescu", "George", "popgeo@gmail.com", " 12222222", "0236478784", "12345", 0);

        AppUser appUser2 = new AppUser("Nicu", "Violeta");
*/


       /* String password = "Anaspiderman17298";
        String url ="jdbc:mysql://localhost:3306/tabiplus";
        String user = "root";
        try {
            Connection myConn = DriverManager.getConnection(url,user, password);

            Statement myStmt = myConn.createStatement();
            String sql = "select * from appuser";
            ResultSet rs = myStmt.executeQuery(sql);
            while  (rs.next()){

                System.out.println(rs.getString("user_id") +" " +  rs.getString("nume"));

               // System.out.println(rs.getString("birth"));
            }

            rs.close();
            myStmt.close();
            myConn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }





*/

    }
}
