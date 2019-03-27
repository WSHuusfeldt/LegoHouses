<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

<%@page import="java.util.List"%>
<%@page import="Data.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    List<Order> orders = (List<Order>) session.getAttribute("orders");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
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
        You are now logged in.

        <table>
            <tr>
                <td>Du kan lave en ny ordre her:</td>
                <td>
                    <form name="createorder" action="FrontController" method="POST">
                        <input class="btn btn-info" type="hidden" name="command" value="orderpage">
                        <input class ="btn btn-info" type="submit" value="Create order">
                    </form>
                </td>
            </tr>
        </table>
        <div class="bs-example">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Order ID</th>
                        <th>User ID</th>
                        <th>Length</th>
                        <th>Width</th>
                        <th>Height</th>
                        <th>Stykliste</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Order o : orders) {%>
                    <tr>
                        <th><%=o.getOrderId()%></th>
                        <th><%=o.getUserId()%></th>
                        <th><%=o.getLength()%></th>
                        <th><%=o.getWidth()%></th>
                        <th><%=o.getHeight()%></th>
                        <th><a href="FrontController?command=legolist&orderId=<%=o.getOrderId()%>"><button class="btn btn-info">Vis stykliste</button></a></th>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
    </body>
</html>
