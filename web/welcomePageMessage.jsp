<%-- 
    Document   : welcomePageMessage
    Created on : Jan 31, 2014, 4:10:58 PM
    Author     : Damian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Object message = request.getAttribute("message");
        %>
        
        <h1><%=message %></h1>
    </body>
</html>
