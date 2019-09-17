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
public class AgeCalculatorServlet extends HttpServlet {


   
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Age = request.getParameter("age");
        String m="please Enter your age";
        String m1="Your next birth Date is On";
          String m2="Please Enter the Number Not String";
          int a=0;

        // to view print statements see the Output window -> Apache Tomcat tab
        System.out.println(Age);
        
        // to view log statements see the Output window -> Apache Tomcat Log tab
        log(Age);
      
        try{
            
        if (Age == null || Age.equals("")) {
              
             request.setAttribute("message",m); 
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
           
            return;
        } 
        }
        catch(Exception e)
        {
       request.setAttribute("message2",m2);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
            return;
        }
        
        try{
        a=Integer.valueOf(Age);
            a++;
        }catch(Exception e)
        {
        request.setAttribute("message2",m2);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
            return;
        }
              request.setAttribute("message1",m1);
        
     
        
        request.setAttribute("aa", a);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
    }

   
