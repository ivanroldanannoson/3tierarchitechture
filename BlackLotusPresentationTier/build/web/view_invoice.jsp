<%-- 
    Document   : view_invoice
    Created on : Jan 25, 2020, 11:35:06 AM
    Author     : ivanroldan
--%>

<%@page import="data.Vendor"%>
<%@page import="data.Item"%>
<%@page import="data.Order"%>
<%@page import="business.BusinessTier_Service"%>
<%@page import="business.BusinessTier"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>  
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Black lotus - View invoice</title>


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
                color : white;
            }
            table, th, td{
                border: 1px solid #cdcdcd;
                color : white;
            }
            table th, table td{
                padding: 10px;
                text-align: left;
                color : white;
            }

            @media print {
                #printbtn {
                    display :  none;
                }
            }
        </style>
        <script>
            function myFunction() {
                window.print();
            }
        </script>
    </head>
    <body>

        <div class="container">
            <c:choose>
                <c:when test = "${not empty isVendorLoggedIn}">
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

                </c:when> 
                <c:otherwise>

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
                </c:otherwise>    
            </c:choose>

            <div class="container" >
                <br>
                <div class="shadow-lg p-3 mb-5 bg-white rounded"id = "invoice">
                    <div class="row">
                        <div class="col-sm-6">
                            <h1>Invoice</h1><br>
                        </div>
                        <div class="col-sm-6">

                            <input class="btn btn-info" id ="printbtn" type="button" 
                                   value="Print this page" onclick="window.print();" 
                                   style="float: right;" data-html2canvas-ignore="false">
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-6 ">
                            <div class="row">
                                <div class="col-sm-4">
                                    <img src="images/icon.png" width = "150"/>
                                </div>

                                <div class="col-sm-8">
                                    <h4>Black lotus</h4>
                                    No .1,</br>Dharmapala Mawatha,</br>Colombo - 01</br></br>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 ">


                            <%double total = 0.0;
                                if (request.getParameter("invoice_id") != null) {
                                    BusinessTier_Service businessTier_Service = new BusinessTier_Service();
                                    BusinessTier businessTier = businessTier_Service.getBusinessTierPort();

                                    int orderId = Integer.parseInt(request.getParameter("invoice_id"));
                                    Order order = businessTier.getOrderById(orderId);

                                    out.print("<b>Invoice Id :</b> " + request.getParameter("invoice_id") + "</br>");
                                    out.print("<b>Invoice Date : </b>" + order.getOrderDate() + "</br>");

                                    Vendor vendor = businessTier.getVendorById(order.getVendorId());
                                    out.print("<b>Vendor Name : </b>" + vendor.getName() + "</br></br>");

                            %>
                        </div>

                    </div>
                    <table class="table-striped table-dark">
                        <thead>
                            <tr>
                                <th>Item</th>
                                <th>Quantity</th>
                                <th>Unit price</th>
                                <th>Amount</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%                                    for (Item item : order.getOrderItem()) {
                                        total += item.getPrice() * item.getQty();

                                        out.print("<tr>");
                                        out.print("<td>" + item.getName() + "</td>");
                                        out.print("<td>" + item.getQty() + "</td>");
                                        out.print("<td>" + item.getPrice() + "</td>");
                                        out.print("<td>" + item.getQty() * item.getPrice() + "</td>");
                                        out.print("</tr>");

                                    }

                                } else {
                                    out.print("Order id required");
                                }


                            %>
                        </tbody>
                    </table>

                    <div class="row">
                        <div class="col-sm-8"></div>
                        <div class="col-sm-4">
                            <p class='text-right p-3 mb-2 bg-success text-white'><b>Total </b> <% out.print(total);%> </p></br></br>
                        </div>

                    </div>


                </div>

            </div>
        </div>

    </body>

</html>
