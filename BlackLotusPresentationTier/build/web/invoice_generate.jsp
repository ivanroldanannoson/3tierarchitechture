<%-- 
    Document   : invoice_generate
    Created on : Jan 23, 2020, 6:29:45 PM
    Author     : ivanroldan
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="data.Item"%>
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
        <title>Black lotus - Generate invoice</title>

        <style>
            form{
                margin: 20px 0;
            }
            form input, button{
                padding: 5px;
            }
            table{
                width: 100%;
                margin-bottom: 20px;
                border-collapse: collapse;
            }
            table, th, td{
                border: 1px solid #cdcdcd;
            }
            table th, table td{
                padding: 10px;
                text-align: left;
            }
        </style>
        <%
            BusinessTier_Service businessTier_Service = new BusinessTier_Service();
            BusinessTier businessTier = businessTier_Service.getBusinessTierPort();
        %>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
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
                        <li class="nav-item ">
                            <a class="nav-link" href="vendor_dashboard.jsp">Home </a>
                        </li>

                        <li class="nav-item active">
                            <a class="nav-link" href="invoice_generate.jsp">Generate order</a>
                        </li>

                        <li class="nav-item ">
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
            <h1 class="display-4">Generate invoice</h1>

            <div class="container">
                <div class="row">

                    <div class="col-sm-6">
                        <div class="col-12 shadow-lg p-3 mb-5 bg-white rounded">
                            <c:if test = "${not empty item_no_quantity_message}">
                                <div class="alert alert-danger" role="alert">
                                    ${item_no_quantity_message}
                                    <% session.removeAttribute("item_no_quantity_message");%>
                                </div>
                            </c:if>
                            <form action="actions/add_to_cart.jsp" method="POST">

                                <div class="form-group">
                                    <label for="email">Select Item : </label>
                                    <select class="form-control" name = "itemId" id="itemId"">
                                        <%
                                            for (Item item : businessTier.getItems().getItem()) {
                                                out.print("<option value='" + item.getId() + "'>" + item.getName() + "</option>");
                                            }
                                        %>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="email">Enter quantity :</label>
                                    <input  class="form-control" type="number" min="1" name="qty" id="qty" placeholder="Quantity" required>
                                </div>
                                <div class="form-group">
                                    <button type="submit" class="btn btn-primary">Add item to order</button>
                                </div>


                            </form>
                        </div>
                    </div>


                    <div class="col-sm-6">

                        <h2>Invoice details</h2>
                        <div class="col-12 shadow-lg p-3 mb-5 bg-white rounded">
                            <%
                                Date dNow = new Date();
                                SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd");
                                out.print("<b>Invoice Date : </b>" + ft.format(dNow) + "</br></br>");
                                if (request.getSession().getAttribute("total") == null) {
                                    out.print("<b>Total :</b> 0.0" + "</br></br>");
                                } else {
                                    out.print("<b>Total : </b>" + request.getSession().getAttribute("total") + "</br></br>");
                                }
                            %>

                            <c:choose>
                                <c:when test="${empty items_list}">
                                    <a class="btn btn-primary disabled" href="actions/generate_invoice.jsp" role="button">Generate invoice</a>
                                    <a class="btn btn-danger disabled" href="actions/clear_cart.jsp" role="button">Clear invoice</a>
                                </c:when>    
                                <c:otherwise> 
                                    <a class="btn btn-primary" href="actions/generate_invoice.jsp" role="button">Generate invoice</a>
                                    <a class="btn btn-danger" href="actions/clear_cart.jsp" role="button">Clear invoice</a>
                                </c:otherwise>
                            </c:choose>

                        </div>
                    </div>
                </div>
            </div>


            <div class="container ">
                <c:choose>
                    <c:when test="${empty items_list}">
                        <h1 class="display-4">No items</h1>
                        <p class="lead">
                            Please add items to generate invoice
                        </p>
                    </c:when>    
                    <c:otherwise> 
                        <table class="table-striped table-dark">
                            <thead>
                                <tr>
                                    <th>Item</th>
                                    <th>Quantity</th>
                                    <th>Total</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${items_list}" var="tmp">
                                    <tr>
                                        <td>${tmp.name}</td>
                                        <td>${tmp.qty}</td>
                                        <td>(${tmp.qty* tmp.price})</td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </c:otherwise>
                </c:choose>

            </div>


        </div>



    </body>
</html>
