<%-- 
    Document   : index
    Created on : Jan 12, 2020, 11:05:32 AM
    Author     : ivanroldan
--%>

<%@page import="model.Order"%>
<%@page import="data.DBUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Data Tier</h1>
        <%
            DBUtil bUtil = new DBUtil();
            //out.print(bUtil.updatePasswordByEmail("test@amb.com", "asda"));
            //out.print(bUtil.getLastInsertedIdForTest("category"));
            %>
    </body>
</html>
