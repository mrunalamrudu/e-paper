<%-- 
    Document   : comp_del_action
    Created on : Feb 9, 2018, 3:59:44 PM
    Author     : Chetan_Kumar
--%>


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
String csrvid=request.getParameter("del");
Statement st=con.createStatement();
int k=st.executeUpdate("delete from COMPLAINT where email='"+email+"'");
if(k!=0)
{
    response.sendRedirect("admin_login.jsp");
}
%>
    </body>
</html>