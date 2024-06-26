package org.example;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import org.example.calculator.Calculator;
import org.example.calculator.PositiveNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculate")

public class CalculatorServlet extends GenericServlet {
    private static final Logger log = LoggerFactory.getLogger(CalculatorServlet.class);

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        log.info("service");
        int operand1 = Integer.parseInt(request.getParameter("operand1"));
        String operator = request.getParameter("operator");
        int operand2 = Integer.parseInt(request.getParameter("operand2"));

        int result = Calculator.calculator(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));

        PrintWriter writer = response.getWriter();
        writer.println(result);
    }

}
