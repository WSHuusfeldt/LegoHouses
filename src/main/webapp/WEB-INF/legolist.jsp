<%-- 
    Document   : legolist
    Created on : 24-03-2019, 14:08:05
    Author     : William Sehested Huusfeldt
--%>

<%@page import="DBAccess.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Order order = (Order) session.getAttribute("order");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <title>JSP Page</title>
    </head>
    <body>
    <table class="table">
        <thead class="thead-dark">
            <tr>
                <th scope="col"># Order ID</th>
                <th scope="col">User ID</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <th scope="row"><%= order.getOrderId()%></th>
                <td><%= order.getUserId()%></td>
            </tr>
        </tbody>
    </table>
</body>
</html>
