package Controller;

import Database.MainDatabase;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Friday September 2023
 * @Time: 11:17 AM
 */

@WebServlet(name = "PaymentServlet", value = "/PaymentServlet")
public class PaymentServlet extends HttpServlet {
    MainDatabase DB = new MainDatabase();
    public PaymentServlet(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String paymentMethod = request.getParameter("paymentMethod");
        String username = request.getParameter("username");
        String cardN = request.getParameter("cardN");

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
