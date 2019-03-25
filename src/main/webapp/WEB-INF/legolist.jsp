<%-- 
    Document   : legolist
    Created on : 24-03-2019, 14:08:05
    Author     : William Sehested Huusfeldt
--%>


<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="DBAccess.Calculator"%>
<%@page import="DBAccess.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Map<String, Integer> bricks = (Map<String, Integer>) session.getAttribute("bricks");
    Order order = (Order) session.getAttribute("order");
    //Order order;
    //if (session.getAttribute("order") != null) {
    //    order = (Order) session.getAttribute("order");
    //    HashMap bricks = calc.calcBricks(order);
    //}
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
        <h1>Stykliste for ordre: <%=request.getParameter("orderId")%> </h1>
        <div class="bs-example">
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Type/Side</th>
                        <th>2x4</th>
                        <th>2x2</th>
                        <th>2x1</th>
                        <th>I alt</th>
                        <th>I alt x Højde</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th>Type af klodser</th>
                        <th><%=bricks.get("2x4")%></th>
                        <th><%=bricks.get("2x2")%></th>
                        <th><%=bricks.get("2x1")%></th>
                        <th><%=bricks.get("2x4") + bricks.get("2x2") + bricks.get("2x1")%></th>
                        <th><%=(bricks.get("2x4") + bricks.get("2x2") + bricks.get("2x1"))*order.getHeight()%></th>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
