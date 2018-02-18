<%-- 
    Document   : glogin_action
    Created on : Feb 8, 2018, 9:42:39 PM
    Author     : Chetan_Kumar
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@include file="connect.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String regno=request.getParameter("regno");
         String name=request.getParameter("name");
               
        
         
        PreparedStatement ps=con.prepareStatement("insert into GLOGIN values(?,?)");
       ps.setInt(1, Integer.parseInt(regno));
        ps.setString(2,name);
              
       
       
       int k=ps.executeUpdate();
        if(k!=0)
        {
            out.println("inserted succesfully");
            response.sendRedirect("guest_login.jsp");
        }
        %>
        
    </body>
</html>