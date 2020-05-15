import JavaMail.Mailer;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
       // AppUsersDbOperations audop = new AppUsersDbOperations();
       // audop.FindByName("Ghinet");


      //  BadgeDbOperations a2 = new BadgeDbOperations();
        //a2.create("Ghinet","Rares", "grares@gmail.com","0755541414","14444444444","123456");
        //a2.create("Cura de slabire","Program specializat, regim 30 de zile");
        //a2.create(104,"Inceputul aventurii", "Te vei simti plin de viata !");

       // a2.FindById(1);
       // BdExemplu.commit();
       // BdExemplu.closeConnection();
        Mailer.send("vmircea1771@gmail.com","Anaspiderman17718","rares.ghinet@yahoo.com","Buna seara!","Multumesc ca ai primit mesajul!");
    }
}
