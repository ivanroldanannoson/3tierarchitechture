<%-- 
    Document   : index
    Created on : Jan 19, 2020, 11:54:21 PM
    Author     : ivanroldan
--%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="java.util.List"%>
<%@page import="data.Item"%>
<%@page import="business.BusinessTier"%>
<%@page import="business.BusinessTier_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Black lotus</title>
    </head>
    <body>
        <%
            if (request.getSession().getAttribute("isVendorLoggedIn") != null) {
                response.sendRedirect("vendor_dashboard.jsp");
            }

            if (request.getSession().getAttribute("isLoggedIn") != null) {
                response.sendRedirect("member_dashboard.jsp");
            }
        %>
        <br>
        <br>
        <div class="col-xs-1 text-center">
            <div class="row">
                <div class="col-sm-2"></div>
                <div class="col-sm-8 shadow-lg p-3 mb-5 bg-white rounded">
                    <img src="images/icon.png" width="400"/>
                    <h1 class="display-1">Black Lotus</h1>
                    <h4>Stock management system</h4>
                    <a href="member_login.jsp" class="btn btn-primary" role="button">Member login</a>
                    <a href="vendor_login.jsp" class="btn btn-dark" role="button">Vendor login</a>
                    <br>
                    <br>
                </div>
                <div class="col-sm-2"></div>
            </div>

        </div>
    </body>
</html>
