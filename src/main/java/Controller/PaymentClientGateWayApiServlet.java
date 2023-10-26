package Controller;

import Database.MainDatabase;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Thursday 26 October 2023
 * @Time: 6:52 AM
 */

@WebServlet(name = "PaymentClientGateWayApiServlet", value = "/PaymentClientGateWayApiServlet")
public class PaymentClientGateWayApiServlet extends HttpServlet {

    public PaymentClientGateWayApiServlet(){
        super();
    }

    MainDatabase DB = new MainDatabase();
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{

        response.setContentType("text/html");

        String payMethod = request.getParameter("paymentMethod");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String cardN = request.getParameter("cardN");
        String expiryDate = request.getParameter("expiryDate");
        String cvv = request.getParameter("cvv");

        try {
            if (DB.searchDoPaymentLastId() == 0) {
                DB.doPayment(DB.searchDoPaymentLastId() + 1, payMethod, email, username, cardN, expiryDate, cvv);
            } else {
                DB.doPayment(DB.searchDoPaymentLastId() + 1, payMethod, email, username, cardN, expiryDate, cvv);
            }
            getServletContext().getRequestDispatcher("/client_dashboard.jsp").forward(request, response);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    protected void doget(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{}
}
