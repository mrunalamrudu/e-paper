<%-- 
    Document   : comp_del
    Created on : Feb 9, 2018, 3:58:22 PM
    Author     : Chetan_Kumar
--%>

<%@include file="connect.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Complaint</title>
    </head>
    <form action="comp_del_action.jsp"
    <body>
        <center>
            <input type="text" name="del" />
            <input type="submit" value="Delete" />
        </center>
        
    </body>
</form>
</html>
