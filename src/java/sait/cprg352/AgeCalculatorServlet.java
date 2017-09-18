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
        getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
        String Age = request.getParameter("age");
        
        if(Age == null || Age.isEmpty()){
            request.setAttribute("errorMessage", "You must give your current age");
            
            getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").
                    forward(request, response);
            
        }
        request.setAttribute("nextYearAge", Integer.parseInt(Age)+1);
        
            }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
