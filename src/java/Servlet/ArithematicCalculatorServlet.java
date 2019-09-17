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
        String f = request.getParameter("first");
        String s = request.getParameter("second");
        String operation=request.getParameter("operation");
        int result=0;
        String m="your result is ";
        String m1= "Please Enter the Numbers First";
        String m2= "Please Enter the Number Not String";
        String m3= "Please Enter the Number not String";
      
        System.out.println("result");
        
        try{
         if (f== null || f.equals("") || s== null || s.equals("")) {
             request.setAttribute("message1",m1);
            getServletContext().getRequestDispatcher("/WEB-INF/calculator.jsp")
                    .forward(request, response);
            return;
        }
        }catch(Exception e)
        {request.setAttribute("message2",m2);
            getServletContext().getRequestDispatcher("/WEB-INF/calculator.jsp")
                    .forward(request, response);
            return;
        }
        
             request.setAttribute("message",m);
       
        
             int second=0;
        int first=0;
        
      
        try{
            try{
            first = Integer.valueOf(request.getParameter("first"));
        second = Integer.valueOf(request.getParameter("second"));
            }catch(Exception e)
            {
             request.setAttribute("message3",m3);
            getServletContext().getRequestDispatcher("/WEB-INF/calculator.jsp")
                    .forward(request, response);
            return;
            
            }
       if(operation.equals("+")){
       result= first + second; 
       }else if(operation.equals("-")){
       result= first - second; 
       }else if(operation.equals("div")){
        result= first/second; 
       }else{
       
       result= first*second;
       }
        }catch(Exception e)
                {
                
                request.setAttribute("message3",m3);
            getServletContext().getRequestDispatcher("/WEB-INF/calculator.jsp")
                    .forward(request, response);
            return;
                }
        
        
        request.setAttribute("result", result);
        request.setAttribute("message", m);
        // to view print statements see the Output window -> Apache Tomcat tab
        System.out.println(first);
        System.out.println(second);
        // to view log statements see the Output window -> Apache Tomcat Log tab
        
        
        
        
        
        
        
     
        getServletContext().getRequestDispatcher("/WEB-INF/calculator.jsp").forward(request, response);
    }

}
