<%-- 
    Document   : stock_update
    Created on : Jan 25, 2020, 4:17:37 PM
    Author     : ivanroldan
--%>

<%@page import="data.Item"%>
<%@page import="business.BusinessTier"%>
<%@page import="business.BusinessTier_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Black lotus - Stock update</title>

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
                        <li class="nav-item ">
                            <a class="nav-link" href="member_dashboard.jsp">Home </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="category.jsp">Category <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="item.jsp">Item</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="view_orders.jsp">Orders</a>
                        </li>


                        <li class="nav-item active">
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
            <h1 class="display-4">Stock update</h1>

            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <%
                            BusinessTier_Service businessTier_Service = new BusinessTier_Service();
                            BusinessTier businessTier = businessTier_Service.getBusinessTierPort();
                        %>
                        <form action="actions/stock_update_cart.jsp" method="POST">

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
                                <button type="submit" class="btn btn-primary">Add item to stock update</button>
                                <c:choose>
                                    <c:when test="${empty stock_items_list}">
                                        <a class="btn btn-primary disabled" href="actions/update_stock.jsp" role="button">Update stock</a>
                                        <a class="btn btn-danger disabled" href="actions/clear_cart_stock_update.jsp" role="button">Clear</a>
                                    </c:when>    
                                    <c:otherwise> 
                                        <a class="btn btn-primary" href="actions/update_stock.jsp" role="button">Update stock</a>
                                        <a class="btn btn-danger" href="actions/clear_cart_stock_update.jsp" role="button">Clear</a>
                                    </c:otherwise>
                                </c:choose>


                            </div>


                        </form>
                    </div>

                    <div class="col-sm-6">
                        <c:choose>
                            <c:when test="${empty stock_items_list}">
                                <h1 class="display-4">No items</h1>
                                <p class="lead">
                                    Please add items to update stock
                                </p>
                            </c:when>    
                            <c:otherwise> 
                                <table class="table-striped table-dark">
                                    <thead>
                                        <tr>
                                            <th>Item</th>
                                            <th>Quantity</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${stock_items_list}" var="tmp">
                                            <tr>
                                                <td>${tmp.name}</td>
                                                <td>${tmp.qty}</td>
                                            </tr>
                                        </c:forEach>

                                    </tbody>
                                </table>
                            </c:otherwise>
                        </c:choose>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
