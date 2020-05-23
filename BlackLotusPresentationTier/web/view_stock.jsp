<%-- 
    Document   : vendor_dashboard
    Created on : Jan 21, 2020, 8:34:58 PM
    Author     : ivanroldan
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="data.Item"%>
<%@page import="java.util.List"%>
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
        <title>Black lotus - View stock</title>
        <style>
            .form-inline .form-group {
  margin-right:4px;
}
            </style>
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

                        <li class="nav-item">
                            <a class="nav-link" href="invoice_generate.jsp">Generate order</a>
                        </li>

                        <li class="nav-item active">
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
            <%
                BusinessTier_Service businessTier_Service = new BusinessTier_Service();
                BusinessTier businessTier = businessTier_Service.getBusinessTierPort();
            %>
            <h1>Stock</h1>

            <form action="actions/search_stock.jsp" method="POST">

                <div class="form-inline">
                    <label for="search_text">Search :</label>
                    <input class="form-control mr-1"  type="text" name="search_text" id="search_text" placeholder="Search text" required>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </form><br>


            <table class="table table-bordered table-striped">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Name</th>
                        <th scope="col">Price</th>
                        <th scope="col">Quantity</th>
                        <th scope="col">Category</th>
                    </tr>
                </thead>
                <tbody>
                    <c:choose>
                        <c:when test="${empty searchItems}">

                            <%            
                                List<Item> itemsNonFilter = businessTier.getItems().getItem();
                                for (int i = 0; i < itemsNonFilter.size(); i++) {
                                    out.print("<tr>");
                                    out.print("<td>" + itemsNonFilter.get(i).getId() + "</td>");
                                    out.print("<td>" + itemsNonFilter.get(i).getName() + "</td>");
                                    out.print("<td>" + itemsNonFilter.get(i).getPrice() + "</td>");
                                    out.print("<td>" + itemsNonFilter.get(i).getQty() + "</td>");
                                    Category category = (Category) businessTier.getCategoryById(itemsNonFilter.get(i).getCategoryType()).getObject();
                                    out.print("<td>" + category.getName() + "</td>");
                            
                                    out.print("</tr>");
                                }
                            %>
                        </c:when>

                        <c:otherwise>
                            <%    
                                ArrayList<Item> items = (ArrayList) request.getSession().getAttribute("searchItems");
                                for (int i = 0; i < items.size(); i++) {
                                    out.print("<tr>");
                                    out.print("<td>" + items.get(i).getId() + "</td>");
                                    out.print("<td>" + items.get(i).getName() + "</td>");
                                    out.print("<td>" + items.get(i).getPrice() + "</td>");
                                    out.print("<td>" + items.get(i).getQty() + "</td>");
                                    Category category = (Category) businessTier.getCategoryById(items.get(i).getCategoryType()).getObject();
                                    out.print("<td>" + category.getName() + "</td>");
                            
                                    out.print("</tr>");
                                }
                                request.getSession().removeAttribute("searchItems");
                            %>
                        </c:otherwise>
                    </c:choose>

                </tbody>


            </table>
        </div>
    </body>
</html>
