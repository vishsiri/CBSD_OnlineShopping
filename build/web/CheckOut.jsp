<%-- 
    Document   : CheckOut
    Created on : Oct 28, 2023, 10:46:25 PM
    Author     : svish
--%>

<%@page import="controller.CentreControl"%>
<%@page import="model.ProductsWithQuantity"%>
<%@page import="model.Cashier"%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Confirmation Page</title>
    </head>
    <%
      CentreControl controller = CentreControl.getController(session.getId());
    %>    
    <body>
        <%
            out.println("<h1>Your Order is confirmed! <br> The total amount is $" + request.getAttribute("sumPrice") + ".00</h1>");
        %>
        <form action="index.jsp" method="POST" >
            <input type="submit" value="Buy Again" name="Buy Again"/>
        </form>
    </body>
</html>