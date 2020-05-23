<%-- 
    Document   : vendor_dashboard
    Created on : Jan 21, 2020, 8:34:58 PM
    Author     : ivanroldan
--%>

<%@page import="data.Vendor"%>
<%@page import="data.Order"%>
<%@page import="data.Category"%>
<%@page import="business.BusinessTier"%>
<%@page import="business.BusinessTier_Service"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Black lotus - View orders</title>
    </head>
    <body>
        <%
            if (request.getSession().getAttribute("isLoggedIn") == null) {
                response.sendRedirect("index.jsp");
            }
        %>
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <a class="navbar-brand" href="vendor_dashboard.jsp">Black Lotus</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item ">
                            <a class="nav-link" href="member_dashboard.jsp">Home <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="category.jsp">Category</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="item.jsp">Item</a>
                        </li>

                        <li class="nav-item active">
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
            <%
                BusinessTier_Service businessTier_Service = new BusinessTier_Service();
                BusinessTier businessTier = businessTier_Service.getBusinessTierPort();
            %>
            <h1>Orders</h1>

            <table class="table table-bordered table-striped">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">Order ID</th>
                        <th scope="col">Order Date</th>
                        <th scope="col">Vendor</th>
                        <th scope="col"></th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (Order order : businessTier.getOrders()) {
                            out.print("<tr>");
                            out.print("<td>" + order.getId() + "</td>");
                            out.print("<td>" + order.getOrderDate() + "</td>");
                            Vendor vendor = businessTier.getVendorById(order.getVendorId());
                            out.print("<td>" + vendor.getName() + "</td>");
                            out.print("<td>" + "<a href='view_invoice.jsp?invoice_id=" + order.getId() + "'>View invoice</a>" + "</td>");

                            out.print("</tr>");
                        }
                    %>
                </tbody>


            </table>
        </div>
    </body>
</html>
