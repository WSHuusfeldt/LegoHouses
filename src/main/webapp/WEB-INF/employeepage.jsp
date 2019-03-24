<%-- 
    Document   : employeepage.jsp
    Created on : Aug 24, 2017, 6:31:57 AM
    Author     : kasper
--%>

<%@page import="java.util.List"%>
<%@page import="DBAccess.Order"%>
<%@page import="FunctionLayer.LogicFacade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%  LogicFacade lf = new LogicFacade();
    String email = request.getParameter("email");
    List<Order> orders = lf.getOrders();
    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee home page</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style type="text/css">
            .bs-example{
                margin: 20px;
            }
        </style>
    </head>
    <body>
        <h1>Hello <%=request.getParameter("email")%> </h1>
        You are now logged in as a EMPLOYEE of our wonderful site.
        <div class="bs-example">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Order ID</th>
                        <th>User ID</th>
                        <th>Length</th>
                        <th>Width</th>
                        <th>Height</th>
                        <th>Status</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Order o : orders) { %>
                    <tr>
                        <th><%=o.getOrderId() %></th>
                        <th><%=o.getUserId() %></th>
                        <th><%=o.getLength() %></th>
                        <th><%=o.getWidth() %></th>
                        <th><%=o.getHeight() %></th>
                        <th><a href="legolist?orderId=<%= o.getOrderId() %>"><button class="btn btn-info">Vis stykliste</button></a></th>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
    </body>
</html>
