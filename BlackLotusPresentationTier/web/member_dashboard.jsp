<%-- 
    Document   : member_dashboard
    Created on : Jan 20, 2020, 7:16:04 PM
    Author     : ivanroldan
--%>

<%@page import="data.Vendor"%>
<%@page import="data.Register"%>
<%@page import="java.util.List"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
        <title>Black lotus - Member dashboard</title>
    </head>
    <body>
        <%
            if (request.getSession().getAttribute("isLoggedIn") == null) {
                response.sendRedirect("index.jsp");
            }
        %>
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <a class="navbar-brand" href="member_dashboard.jsp">Black Lotus</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="member_dashboard.jsp">Home <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="category.jsp">Category</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="item.jsp">Item</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="view_orders.jsp">Orders</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="stock_update.jsp">Update stock</a>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">

                        <li>
                            <a class="btn btn-danger" style="float: right" href='actions/logout.jsp'>Logout</a>

                        </li>
                    </ul>


                </div>
            </nav>
            <h1  class="display-4">Member dashboard</h1>
            <div class="container">
                <div class="row">
                    <%
                        BusinessTier_Service businessTier_Service = new BusinessTier_Service();
                        BusinessTier businessTier = businessTier_Service.getBusinessTierPort();
                    %>
                    <div class="col-sm">
                        <div class="row">
                            <div class="col-sm">
                                <h1>Users</h1>         
                            </div>  
                            <div class="col-sm">    
                                <c:if test = "${userRole == 1}">
                                    <a class="btn btn-info" style="float: right" href='member_register.jsp'>Add user</a>

                                </c:if>
                            </div>
                        </div>
                        <table class="table table-bordered table-striped">
                            <thead class="thead-dark">
                                <tr>
                                    <th scope="col">Name</th>
                                    <th scope="col">Email</th>
                                    <th scope="col">User Role</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    List<Register> users = businessTier.getUsers();
                                    for (int i = 0; i < users.size(); i++) {
                                        out.print("<tr>");
                                        out.print("<td>" + users.get(i).getName() + "</td>");
                                        out.print("<td>" + users.get(i).getEmail() + "</td>");
                                        if (users.get(i).getUserRole() == 1) {
                                            out.print("<td>Admin</td>");
                                        } else {
                                            out.print("<td>Member</td>");
                                        }

                                        out.print("</tr>");
                                    }
                                %>
                            </tbody>


                        </table>
                    </div>
                    <div class="col-sm">
                        <div class="row">
                            <div class="col-sm">
                                <h1>Vendors</h1>      
                            </div>  
                            <div class="col-sm">         
                                <a class="btn btn-info" style="float: right" href='vendor_register.jsp'>Add vendor</a>
                            </div>
                        </div>
                        <table class="table table-bordered table-striped">
                            <thead class="thead-dark">
                                <tr>
                                    <th scope="col">Name</th>
                                    <th scope="col">Address</th>
                                    <th scope="col">Contact</th>
                                    <th scope="col">Vendor type</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    List<Vendor> vendors = businessTier.getVendors();
                                    for (int i = 0; i < vendors.size(); i++) {
                                        out.print("<tr>");
                                        out.print("<td>" + vendors.get(i).getName() + "</td>");
                                        out.print("<td>" + vendors.get(i).getAddress() + "</td>");
                                        out.print("<td>" + vendors.get(i).getContact() + "</td>");
                                        out.print("<td>" + businessTier.getVendorTypeById(vendors.get(i).getVendorType()) + "</td>");
                                        out.print("</tr>");
                                    }
                                %>
                            </tbody>


                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
