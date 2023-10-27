package Controller;

import Database.MainDatabase;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Friday 27 October 2023
 * @Time: 01:44 AM
 */

@WebServlet(name = "ProfileServlet", value = "/ProfileServlet")
public class ProfileServlet extends HttpServlet {
    MainDatabase DB = new MainDatabase();
    public ProfileServlet(){
        super();
    }

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/MyAssignment";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE email = ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                request.setAttribute("user", rs);
                request.getRequestDispatcher("/profile_dashboard.jsp").forward(request, response);
            } else {
                response.getWriter().println("No user found with that email.");
            }

            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error fetching user details.");
        }
    }

    // If you want the same functionality on doGet, you can delegate the call
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }


}
