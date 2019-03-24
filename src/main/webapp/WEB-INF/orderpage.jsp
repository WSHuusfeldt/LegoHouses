<%-- 
    Document   : order
    Created on : 22-03-2019, 12:28:20
    Author     : William Sehested Huusfeldt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Order</h1>
        <table>
            <tr><td>Create order</td>
                <td>
                    <form name="createorder" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="createorder">
                        <input type="text" name="length" value="length">
                        <input type="text" name="width" value="width">
                        <input type="text" name="height" value="height">
                        <input type="submit" value="Submit">
                     </form>
                </td>
            </tr>
        </table>
    </body>
</html>
