package Controller;

import Database.MainDatabase;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.sql.*;
import java.io.IOException;
import java.util.Random;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Wednesday September 2023
 * @Time: 11:31 AM
 */

@WebServlet(name = "AdminAddAdmins", value = "/AdminAddAdmins")
public class AdminAddAdmins extends HttpServlet {

    MainDatabase DB = new MainDatabase();

    public AdminAddAdmins() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstname"); // done
        String lastName = request.getParameter("lastname"); // done
        String username = request.getParameter("username"); // done
        String email = request.getParameter("email"); // done
        String address = request.getParameter("address"); // done
        String phone = request.getParameter("phone"); // done
        String gender = request.getParameter("gender"); // done
        String omang = request.getParameter("omang"); // done

        try {
            if (DB.searchEmployeeLastId() == 0) {
                DB.registerEmployeeeeee(DB.searchEmployeeLastId() + 1, firstName, lastName, email, String.valueOf(generatePassword(8)), Integer.parseInt(phone), gender, username, omang, address);
            } else {
                DB.registerEmployeeeeee(DB.searchEmployeeLastId() + 1, firstName, lastName, email, String.valueOf(generatePassword(8)), Integer.parseInt(phone), gender, username, omang, address);
            }
            getServletContext().getRequestDispatcher("/admin_dashboard.jsp").forward(request, response);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    private static char[] generatePassword(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));


        for (int i = 4; i < length; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }
}
