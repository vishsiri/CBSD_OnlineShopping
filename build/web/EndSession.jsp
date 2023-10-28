<%-- 
    Document   : ErrorSession
    Created on : Oct 28, 2023, 10:26:53 PM
    Author     : svish
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <%
            out.println("<h2> Your session has ended! <br> Please select the product again. </h2>");
        %>
        <form action="index.jsp" method="POST" >
            <input type="submit" value="Buy Again" name="Buy Again"/>
        </form>
    </body>
</html>
