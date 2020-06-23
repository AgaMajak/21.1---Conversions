package servlets;

import logic.ConversionCalculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

@WebServlet("/lengthConversion")
public class LengthConversionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        request.setCharacterEncoding("UTF-8");
        String value = request.getParameter("lengthConverter");
        String operation = request.getParameter("lengthUnitChoice");
        System.out.println(operation);
        BigDecimal parsedValue;

        try {
            parsedValue = new BigDecimal(value);
        } catch (NumberFormatException exception) {
            System.err.println("To nie jest liczba");
            return;
        }
        ConversionCalculator.convertLengthAndWriteItToUser(parsedValue, operation, writer);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}