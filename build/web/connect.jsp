<%-- 
    Document   : connect
    Created on : Jan 31, 2018, 7:37:12 PM
    Author     : Chetan_Kumar
--%>

<%@page import="java.io.*" %>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>connect Page</title>
    </head>
    <body>
        <%! Connection con;%>
     <%
     Class.forName("oracle.jdbc.driver.OracleDriver");
     con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","batch2","batch2");
if(con!=null)   
out.println("connected");
     %>  
    </body>
</html>
