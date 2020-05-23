<%-- 
    Document   : vendor_dashboard
    Created on : Jan 21, 2020, 8:34:58 PM
    Author     : ivanroldan
--%>

<%@page import="business.BusinessTier_Service"%>
<%@page import="business.BusinessTier"%>
<%@page import="data.Order"%>
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
        <title>Black lotus - Vendor dashboard</title>
    </head>
    <body>
        <%
            if (request.getSession().getAttribute("isVendorLoggedIn") == null) {
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
                        <li class="nav-item active">
                            <a class="nav-link" href="vendor_dashboard.jsp">Home <span class="sr-only">(current)</span></a>
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="invoice_generate.jsp">Generate order</a>
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="view_stock.jsp">View stock</a>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">

                        <li>
                            <a class="btn btn-danger" style="float: right" href='actions/logout.jsp'>Logout</a>

                        </li>
                    </ul>


                </div>
            </nav>
            <h1>Vendor dashboard</h1>
            
            <div class="container">
                <div class="row">
                    <%
                BusinessTier_Service businessTier_Service = new BusinessTier_Service();
                BusinessTier businessTier = businessTier_Service.getBusinessTierPort();
            %>
            <h4>Orders</h4>

            <table class="table table-bordered table-striped">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">Order ID</th>
                        <th scope="col">Order Date</th>
                        <th scope="col"></th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        int vendorId =Integer.parseInt(request.getSession().getAttribute("vendorId").toString());
                        for(Order order : businessTier.getOrdersByVendor(vendorId)) {
                            out.print("<tr>");
                            out.print("<td>" + order.getId()+ "</td>");
                            out.print("<td>" + order.getOrderDate() + "</td>");
                            out.print("<td>" + "<a href='view_invoice.jsp?invoice_id=" + order.getId()+"'>View invoice</a>" + "</td>");

                            out.print("</tr>");
                        }
                    %>
                </tbody>


            </table>
                </div>
            </div>
        </div>
    </body>
</html>
