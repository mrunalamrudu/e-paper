<%-- 
    Document   : comp_view
    Created on : Feb 9, 2018, 3:56:18 PM
    Author     : Chetan_Kumar
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@include file="connect.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Complaints</title>
    </head>
    <body background="cream.jpg">
    <center>
        <body>
        <b><font size="9">Complaints</font></b>
        <table border="1">
            <br><br>
            <th>Full Name</th>
            <th>Email ID</th>
            <th>Department</th>
            <th>Complaint</th>
            
        
        
         <%
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM COMPLAINT  ");
           
         while(rs.next())
     {%> 
     
     <tbody>
        <tr>
                    <td><%= rs.getString(1)%></td>
  .                 <td><%= rs.getString(2)%></td>
                    <td><%= rs.getString(3)%></td>
                    <td><%= rs.getString(4)%></td>
                    
        </tr>           
    </tbody>
    <%  }
       %>
        </table>
    </center>
</body>   
</html>