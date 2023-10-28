<%-- 
    Document   : OnlineCatelog
    Created on : Oct 28, 2023, 9:33:19 PM
    Author     : svish
--%>

<%@page import="controller.CentreControl"%>
<%@page import="model.Products"%>
<%@page import="model.ProductTable"%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping Page</title>
    </head>
    <jsp:useBean id="product" class="model.Products" scope="request"/>
    <%
        List<Products> products = CentreControl.getAllProducts();
        Iterator<Products> itr = products.iterator();
    %>    
    <body>
    <center>
        <form name="addProducts" action="Cart" method="POST" >
            <h1>DVD Catalog</h1>
            <table border="1">
                <tr>
                    <th>DVD Names</th>
                    <th>Role</th>
                    <th>Year</th>
                    <th>Price</th>
                    <th>Quantity</th>
                </tr>
                <%
                    while (itr.hasNext()) {
                        product = itr.next();
                        out.println("<tr>");
                        out.println("<td> <input type=\"checkbox\" name=\"movies\" value=\"" + product.getMovie() + "\"/>" + product.getMovie() + "</td>");
                        out.println("<td> " + product.getRating() + "</td>");
                        out.println("<td> " + product.getYearcreate() + "</td>");
                        out.println("<td> " + product.getPrice() + "</td>");
                        out.println("<td> <input type=\"text\" value=\"\" name=\"quantity\" size=\"8\" /></td>");
                        out.println("<tr>");
                    }
                %>
            </table>
            <input type="submit" value="Add To Cart" name="Add To Cart"/>
        </form>
    </center>
</body>
</html>