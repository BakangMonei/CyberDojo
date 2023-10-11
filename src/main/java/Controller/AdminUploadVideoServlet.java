package Controller;
// Working
/**
 * @Author: Monei Bakang Mothuti
 * @Date: Wednesday September 2023
 * @Time: 10:52 AM
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "AdminUploadVideoServlet", value = "/AdminUploadVideoServlet")
@MultipartConfig(maxFileSize = 1024 * 1024 * 10) // Maximum file size (10MB)
public class AdminUploadVideoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        response.setContentType("text/html");


        String dbURL = "jdbc:mysql://localhost:3306/MyAssignment"; // Change to your database URL
        String dbUser = "root";
        String dbPassword = "";
        PrintWriter pw = response.getWriter();
        Connection conn = null;

        try {
            // Initialize the database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);

            // Get the uploaded video file
            Part filePart = request.getPart("file");
            String fileName = filePart.getSubmittedFileName();
            String videoText = request.getParameter("videoText");

            // Insert the video into the database
            String sql = "INSERT INTO videos (name, content, videoText) VALUES (?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, fileName);

            // Read the video content from the input stream and set it as a parameter
            InputStream inputStream = filePart.getInputStream();
            statement.setBinaryStream(2, inputStream, (int) filePart.getSize());

            statement.setString(3, videoText);

            // Execute the SQL statement
            statement.executeUpdate();

            response.sendRedirect("admin_dashboard.jsp"); // Redirect back to the upload form
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
