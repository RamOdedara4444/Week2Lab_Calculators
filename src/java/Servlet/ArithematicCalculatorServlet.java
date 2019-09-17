/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 798125
 */
public class ArithematicCalculatorServlet extends HttpServlet {

   
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/calculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int first = Integer.valueOf(request.getParameter("first"));
        int second = Integer.valueOf(request.getParameter("second"));
        String operation=request.getParameter("operation");
        int result=0;
        
        System.out.println("result");
       if(operation.equals("+")){
       result= first + second; 
       }else if(operation.equals("-")){
       result= first - second; 
       }else if(operation.equals("div")){
        result= first/second; 
       }else{
       
       result= first*second;
       }
        
        
        
        request.setAttribute("result", result);
        // to view print statements see the Output window -> Apache Tomcat tab
        System.out.println(first);
        System.out.println(second);
        // to view log statements see the Output window -> Apache Tomcat Log tab
        
        
        
        
        
        
        
     
        getServletContext().getRequestDispatcher("/WEB-INF/calculator.jsp").forward(request, response);
    }

}
