
import java.sql.Connection;


import BazaDeDateExemplu.BdExemplu;

import java.sql.*;


public class AppUsersDbOperations {

    public void create(String nume, String prenume, String email, String telefon, String cnp, String parola) throws SQLException {
        Connection myConn = BdExemplu.getConnection();
        try (PreparedStatement pstmt = myConn.prepareStatement("insert into appuser (nume,prenume,email,telefon,cnp,parola) values (?,?,?,?,?,?)")) {
            pstmt.setString(1, nume);
            pstmt.setString(2, prenume);
            pstmt.setString(3, email);
            pstmt.setString(4, telefon);
            pstmt.setString(5, cnp);
            pstmt.setString(6, parola);
            pstmt.executeUpdate();
        }
    }

    public void FindByName(String numeUser) throws SQLException {
        Connection myConn = BdExemplu.getConnection();
        try {

            //PreparedStatement pstmt = myConn.prepareStatement("Select * from appuser where nume like ?");
            String sql = "Select * from appuser where nume='" + numeUser + "'";

            Statement st = myConn.createStatement();

            ResultSet rs =  st.executeQuery(sql);

            while (rs.next()) {
                int uId = rs.getInt("user_id");
                String uNume = rs.getString("nume");
                String uPrenume = rs.getString("prenume");
                String uEmail = rs.getString("email");
                String uCnp = rs.getString("cnp");
                String uTelefon = rs.getString("telefon");

                System.out.println("\n" + uId + "\t" + uNume + "\t" + uPrenume + "\t" + uEmail + "\t" + uCnp + "\t" + uTelefon);

            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
