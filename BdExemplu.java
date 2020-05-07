package BazaDeDateExemplu;

import java.sql.*;


public class BdExemplu {

    private static final String url = "jdbc:mysql://localhost:3306/tabiplus";
    private static final String user = "root";
    private static final String password = "Anaspiderman17298";

    private static Connection myConn = null;

    private BdExemplu(){}

    public static Connection getConnection(){

        if(myConn == null)
            creaateConnection();
        return myConn;
    }

    public static void creaateConnection(){
        try{
            myConn = DriverManager.getConnection(url,user,password);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void closeConnection(){
        try{
            myConn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void commit(){

        try{
            myConn.setAutoCommit(false);
            myConn.commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void rollback(){


        try {
            myConn.setAutoCommit(false);
            myConn.rollback();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
