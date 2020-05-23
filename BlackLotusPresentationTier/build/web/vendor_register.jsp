<%-- 
    Document   : member_register
    Created on : Jan 20, 2020, 8:57:20 PM
    Author     : ivanroldan
--%>

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
        <title>Black lotus - Vendor register</title>
        <style type="text/css">
            .register-form {
                width: 440px;
                margin: 50px auto;
            }
            .register-form form {
                margin-bottom: 15px;
                background: #f7f7f7;
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                padding: 30px;
            }
            .register-form h2 {
                margin: 0 0 15px;
            }
            .form-control, .btn {
                min-height: 38px;
                border-radius: 2px;
            }
            .btn {
                font-size: 15px;
                font-weight: bold;
            }
        </style>
    </head>
    <body>
         <%
            if (request.getSession().getAttribute("isLoggedIn") == null) {
                response.sendRedirect("index.jsp");
            }
        %>
        <div class="register-form">
            <form class="text-center border border-light p-5" action="actions/vendor_register_action.jsp">
                <p class="h4 mb-4">Vendor Sign up</p>
                <c:if test = "${not empty register_error_message}">
                    <div class="alert alert-danger" role="alert">
                        ${register_error_message}
                        <% session.removeAttribute("register_error_message");%>
                    </div>
                </c:if>
                <div class="form-row mb-4">
                    <div class="col">
                        <input type="text" id="defaultRegisterFormFirstName" name = "first_name" class="form-control" placeholder="First name" required>
                    </div>
                    <div class="col">
                        <input type="text" id="defaultRegisterFormLastName" name = "last_name" class="form-control" placeholder="Last name" required>
                    </div>
                </div>

                <input type="email" id="defaultRegisterFormEmail" name = "email" class="form-control mb-4" placeholder="E-mail" required>
                <input type="password" id="defaultRegisterFormPassword" name = "password" class="form-control" placeholder="Password" aria-describedby="defaultRegisterFormPasswordHelpBlock" required>
                <small id="defaultRegisterFormPasswordHelpBlock" class="form-text text-muted mb-4">
                    At least 8 characters and 1 digit
                </small>
                <input type="text" name = "address" class="form-control mb-4" placeholder="Address" required>
                <input type="text" name = "contact" class="form-control mb-4" placeholder="Contact" required>

                <div class="form-group">
                    <select class="form-control" name = "user_role">
                        <option value="1">Seller</option>
                        <option value="2">Outlet</option>

                    </select>
                </div>
                <button class="btn btn-info my-4 btn-block" type="submit">Sign up</button>
                <hr>
                <p>By clicking
                    <em>Sign up</em> you agree to our
                    <a href="" target="_blank">terms of service</a>

            </form>
        </div>
    </body>
</html>
