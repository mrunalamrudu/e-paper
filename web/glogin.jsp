<%-- 
    Document   : glogin
    Created on : Feb 8, 2018, 9:18:32 PM
    Author     : Chetan_Kumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <center>
    <body background="bluebg.jpg">
        <form action="glogin_action.jsp">
        <b><font size=10>Guest Login</font></b>
        <table>
            <tr>
                <td>Reg No:</td><td><input type="text" name="regno" value="" /></td>
            </tr>
            <tr>
                <td>Name</td><td><input type="text" name="name" value="" /></td>
            </tr>
        </table>
        <input type="submit" value="submit" name="ss" /> <input type="reset" value="cancel" name="cc" />
        </form>
    </body>
    </center>
</html>