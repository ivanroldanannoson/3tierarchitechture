<%-- 
    Document   : create_category
    Created on : Jan 22, 2020, 6:58:29 PM
    Author     : ivanroldan
--%>

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
        <title>Black lotus - Item</title>
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
                            <a class="nav-link" href="member_dashboard.jsp">Home <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="category.jsp">Category</a>
                        </li>
                        <li class="nav-item active">
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
            <h1 class="display-4">Item</h1>
            <%
                BusinessTier_Service businessTier_Service = new BusinessTier_Service();
                BusinessTier businessTier = businessTier_Service.getBusinessTierPort();
            %>
            <div class="container">
                <div class="row">

                    <div class="col-4 ">
                        <%
                            if (request.getParameter("id") != null) {%>



                        <h1 >Edit item</h1>
                        <form action="actions/edit_item_action.jsp" method="post">

                            <c:if test = "${not empty message}">
                                <div class="alert alert-danger" role="alert">
                                    ${message}
                                    <% session.removeAttribute("message");%>
                                </div>
                            </c:if>
                            <input type="hidden" name="item_id" value=<%= request.getParameter("id")%>>
                            <div class="form-group">
                                <input type="text" class="form-control" name = "item_name" placeholder="Name" required="required" value=<%= request.getParameter("name")%>>
                            </div>
                            <div class="form-group">
                                <input type="number" min="0" class="form-control" name = "item_price" placeholder="Price" required="required" value=<%= request.getParameter("price")%>>
                            </div>
                            <div class="form-group">
                                <input type="number" min="0" class="form-control" name = "item_quantity" placeholder="Quantity" required="required" value=<%= request.getParameter("qty")%>>
                            </div>
                           <input type="hidden" name="item_category" value=<%= request.getParameter("category")%>>
                            <div class="form-group">
                                <button type="submit" class="btn btn-primary btn-block">Edit item</button>
                            </div>

                        </form>
                        <% } else {
                        %>

                        <h1 >Create item</h1>
                        <form action="actions/create_item_action.jsp" method="post">

                            <c:if test = "${not empty message}">
                                <div class="alert alert-danger" role="alert">
                                    ${message}
                                    <% session.removeAttribute("message");%>
                                </div>
                            </c:if>

                            <c:if test = "${not empty sucess_message}">
                                <div class="alert alert-success" role="alert">
                                    ${sucess_message}
                                    <% session.removeAttribute("sucess_message");%>
                                </div>
                            </c:if>
                            <div class="form-group">
                                <input type="text" class="form-control" name = "name" placeholder="Name" required="required">
                            </div>
                            <div class="form-group">
                                <input type="number" min="0" class="form-control" name = "price" placeholder="Price" required="required">
                            </div>
                            <div class="form-group">
                                <input type="number" min="0" class="form-control" name = "quantity" placeholder="Quantity" required="required">
                            </div>
                            <div class="form-group">
                                <select class="form-control" name = "category">

                                    <%
                                        for (Category category : businessTier.getCategories().getCategory()) {
                                            out.print("<option value='" + category.getId() + "'>" + category.getName() + "</option>");
                                        }
                                    %>

                                </select>
                            </div>

                            <div class="form-group">
                                <button type="submit" class="btn btn-primary btn-block">Create item</button>
                            </div>

                        </form>

                        <% } %>

                    </div>
                    <div class="col-8  shadow-lg p-3 mb-5 bg-white rounded">
                        <h1>Items</h1>

                        <table class="table table-bordered table-striped">
                            <thead class="thead-dark">
                                <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Price</th>
                                    <th scope="col">Quantity</th>
                                    <th scope="col">Category</th>
                                    <th scope="col"></th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    List<Item> items = businessTier.getItems().getItem();
                                    for (int i = 0; i < items.size(); i++) {
                                        out.print("<tr>");
                                        out.print("<td>" + items.get(i).getId() + "</td>");
                                        out.print("<td>" + items.get(i).getName() + "</td>");
                                        out.print("<td>" + items.get(i).getPrice() + "</td>");
                                        out.print("<td>" + items.get(i).getQty() + "</td>");
                                        Category category = (Category) businessTier.getCategoryById(items.get(i).getCategoryType()).getObject();
                                        out.print("<td>" + category.getName() + "</td>");
                                        out.print("<td>" + "<a href='item.jsp?id=" + items.get(i).getId()
                                                + "&name=" + items.get(i).getName()
                                                + "&price=" + items.get(i).getPrice()
                                                + "&qty=" + items.get(i).getQty()
                                                + "&category=" + items.get(i).getCategoryType()+ "'>Edit</a>" + "</td>");

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
