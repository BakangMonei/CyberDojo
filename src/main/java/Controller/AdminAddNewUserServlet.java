package Controller;
// Working

import Database.MainDatabase;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.*;

import java.sql.SQLException;
import java.io.IOException;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Tuesday September 2023
 * @Time: 1:50 PM
 */


@WebServlet(name = "AdminAddNewUserServlet", value = "/AdminAddNewUserServlet")
public class AdminAddNewUserServlet extends HttpServlet {
    MainDatabase DB = new MainDatabase();

    public AdminAddNewUserServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String username = request.getParameter("username");


        try {
            if (DB.searchClientLastId() == 0) {
                DB.rClient(DB.searchClientLastId() + 1, firstName, lastName, email, password, username);
            } else {
                DB.rClient(DB.searchClientLastId() + 1, firstName, lastName, email, password, username);
            }
            getServletContext().getRequestDispatcher("/admin_dashboard.jsp").forward(request, response);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/signUp.jsp").forward(request, response);
    }
}