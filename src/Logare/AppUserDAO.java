package Logare;

import BazaDeDateExemplu.BdExemplu;
import Pachet1.AppUser2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AppUserDAO {

    public AppUser2 checkLogin(String email, String password) throws SQLException {

        Connection con = BdExemplu.getConnection();
               String sql = "SELECT * FROM appuser WHERE email = ? and parola = ?";
               PreparedStatement statement = con.prepareStatement(sql);
               statement.setString(1, email);
               statement.setString(2, password);

        ResultSet result = statement.executeQuery();


            AppUser2 appUser2 = null;

        if (result.next()) {
             appUser2 = new AppUser2();
           // appUser2.setNume(result.getString("nume"));
           // appUser2.setUserId(result.getInt("user_id"));
           // System.out.println(appUser2.getNume());
            appUser2.setEmail(email);
        }


        return appUser2;
           }

}
