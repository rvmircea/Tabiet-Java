import BazaDeDateExemplu.BdExemplu;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.Date;

public class TabietDbOperations {

    public void create(String tabietNume, String tabietDesc) throws SQLException {
        Connection myConn = BdExemplu.getConnection();
        LocalDateTime now = LocalDateTime.now();
        try (PreparedStatement pstmt = myConn.prepareStatement("insert into tabiet (tabiet_Nume,tabiet_desc,tabiet_datainc) values (?,?,?)")) {
            pstmt.setString(1, tabietNume);
            pstmt.setString(2, tabietDesc);
            pstmt.setString(3, String.valueOf(now));

            pstmt.executeUpdate();

        }
    }


    public void FindById(Integer tabietId) throws SQLException {
        Connection myConn = BdExemplu.getConnection();
        try {

            //PreparedStatement pstmt = myConn.prepareStatement("Select * from appuser where nume like ?");
            String sql = "Select * from tabiet where tabiet_id='" + tabietId + "'";

            Statement st = myConn.createStatement();

            ResultSet rs =  st.executeQuery(sql);

            while (rs.next()) {
                Integer tId = rs.getInt("tabiet_id");
                String tNume = rs.getString("tabiet_nume");
                String tDesc = rs.getString("tabiet_desc");
                String tData = rs.getString("tabiet_datainc");
                String tProgres = rs.getString("tabiet_progres");
                String tStatus = rs.getString("tabiet_status");
                Integer tBadge_id = rs.getInt("badge_id");
                System.out.println("\n" + tId + "\t" + tNume + "\t" + tDesc + "\t" + tData + "\t" + tProgres + "\t" + tStatus + "\t" + tBadge_id);

            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
