import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;

// Import Database Connection Class file
import BazaDeDateExemplu.BdExemplu;
//import .DatabaseConnection;

// Servlet Name
@WebServlet(name = "/InsertData")
public class InsertData extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

        /*try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tabiplus","root","Anaspiderman17298");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        */
        Connection con = BdExemplu.getConnection();


        try {

            // Initialize the database


            // Create a SQL query to insert data into demo table
            // demo table consists of two columns, so two '?' is used
            PreparedStatement st = con.prepareStatement("insert into appuser(nume,prenume,email,telefon,cnp,parola) values(?,?,?,?,?,?)");



            // Same for second parameter
           // st.setString(1, request.getParameter("user_id"));
            //System.out.println(request.getParameter("user_id"));


            st.setString(1, request.getParameter("nume"));
            st.setString(2, request.getParameter("prenume"));
            st.setString(3, request.getParameter("email"));
            st.setString(4, request.getParameter("telefon"));
            st.setString(5, request.getParameter("cnp"));
            st.setString(6, request.getParameter("parola"));


            // Execute the insert command using executeUpdate()
            // to make changes in database
            st.executeUpdate();

            // Close all the connections
            st.close();
            con.close();

            // Get a writer pointer
            // to display the successful result
            PrintWriter out = response.getWriter();
            out.println("text");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}