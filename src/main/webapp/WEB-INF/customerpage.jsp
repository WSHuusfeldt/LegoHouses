<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <h1>Hello <%=request.getParameter("email")%> </h1>
        You are now logged in.

        <table>
            <tr><td>Create order</td>
                <td>
                    <form name="createorder" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="orderpage">
                        <input type="submit" value="Create order">
                        
                    </form>
                </td>
                <td>See your orders</td>
            </tr>
        </table>
    </body>
</html>
