<%-- 
    Document   : calculator
    Created on : Sep 13, 2019, 3:52:17 PM
    Author     : 798125
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arthematic Calculator</title>
    </head>
    <body>
        <form action="arithematic" method="post">
          First: <input type="text" name="first" value="${f}" ></input>
          Second:<input type="text" name="second"  value="${s}"></input> 
          <input type="submit" name="operation" value="+"></input>
          <input type="submit" name="operation" value="-"></input>
          <input type="submit" name="operation" value="*"></input>
          <input type="submit" name="operation" value="%"></input>
      </form>
          <h1></h1>
          <h1>${result}</h1>
    </body>
</html>
