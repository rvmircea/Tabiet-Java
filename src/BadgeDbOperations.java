import BazaDeDateExemplu.BdExemplu;

import java.sql.*;
import java.time.LocalDateTime;

public class BadgeDbOperations {

  public void create(Integer tabietId,String numeBadge,String mesajIncrj) throws SQLException {
          Connection myConn = BdExemplu.getConnection();
          LocalDateTime now = LocalDateTime.now();
          try (PreparedStatement pstmt = myConn.prepareStatement("insert into badge (tabiet_id,nume_badge,data_obtinere,mesaj_incrj) values (?,?,?,?)")) {
              pstmt.setString(1, String.valueOf(tabietId));
              pstmt.setString(2, numeBadge);
              pstmt.setString(3, String.valueOf(now));
              pstmt.setString(4, mesajIncrj);

              pstmt.executeUpdate();

          }
      }





    public void FindById(Integer badgeId) throws SQLException {
        Connection myConn = BdExemplu.getConnection();
        try {

            //PreparedStatement pstmt = myConn.prepareStatement("Select * from appuser where nume like ?");
            String sql = "Select * from badge where badge_id='" + badgeId + "'";

            Statement st = myConn.createStatement();

            ResultSet rs =  st.executeQuery(sql);

            while (rs.next()) {
                Integer bId = rs.getInt("badge_id");
                Integer btabietId = rs.getInt("tabiet_id");
                String bNume = rs.getString("nume_badge");
                String bDataObtinere = rs.getString("data_obtinere");
                String bNivel = rs.getString("nivel_badge");
                String bMesaj = rs.getString("mesaj_incrj");

                System.out.println("\n" + bId + "\t" + btabietId + "\t" + bNume + "\t" + bDataObtinere + "\t" +bNivel  + "\t" +bMesaj);

            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }

  }


