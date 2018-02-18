<%-- 
    Document   : comp_action
    Created on : Feb 9, 2018, 3:29:37 PM
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
        String fullname=request.getParameter("fullname");
         String email=request.getParameter("email");
          String dept=request.getParameter("dept");
           String comp=request.getParameter("comp");
                  
        
         
        PreparedStatement ps=con.prepareStatement("insert into COMPLAINT values(?,?,?,?)");
       ps.setString(1,fullname);
        ps.setString(2,email);
         ps.setString(3,dept);
          ps.setString(4,comp);
           
        
       
       
       int k=ps.executeUpdate();
        if(k!=0)
        {
            out.println("inserted succesfully");
            response.sendRedirect("home.jsp");
        }
        %>
        
    </body>
</html>