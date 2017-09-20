/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 643699
 */
public class AgeCalculatorServlet extends HttpServlet {





    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String age = request.getParameter("age");
       
        if (age == null)
        {
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        }
        
        
        if(age.isEmpty()){
            request.setAttribute("errorMessage", "You must give your current age");
            
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").
                    forward(request, response);         
        }
        
        
        
        try{
            int nextAge = Integer.parseInt(age)+1;
            String nextAgeMessage = "Your age next year will be " + nextAge;
            request.setAttribute("nextYearAge", nextAgeMessage);
        }
        
        catch(NumberFormatException e){
            request.setAttribute("errorMessage", "You must enter a number");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").
                    forward(request, response);
        
            }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
