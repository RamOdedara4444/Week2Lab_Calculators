<%-- 
    Document   : agecalculator
    Created on : Sep 13, 2019, 3:18:42 PM
    Author     : 798125
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <form action="age" method="post">
          Enter Your Age: <input type="text" name="age" value="" ></input>
            <h4>${message1}  ${aa}</h4>  
            <h4>${message2}</h4>
          <h4>${message}</h4>  <br>
          <input type="submit" name="Age next Birthday" value="Age next Birthday"></input> 
            </form>
          <a href="/Week2lab_calculators/arithematic">Arthematic Calculator</a>
              </body>
    </body>
</html>
