<%--
    Document   : member_login
    Created on : Jan 20, 2020, 7:01:58 PM
    Author     : ivanroldan
--%>
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
        <title>Black lotus - Member login</title>
        <style type="text/css">
            .login-form {
                width: 340px;
                margin: 50px auto;
            }
            .login-form form {
                margin-bottom: 15px;
                background: #f7f7f7;
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                padding: 30px;
            }
            .login-form h2 {
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
        
      
        <div class="login-form">
            <h1 class="display-4">Member Login</h1>
            <form action="actions/login_action.jsp" method="post">

                <c:if test = "${not empty message}">
                    <div class="alert alert-danger" role="alert">
                        ${message}
                        <% session.removeAttribute("message");%>
                    </div>
                </c:if>

                <h2 class="text-center">Log in</h2>
                <div class="form-group">
                    <c:choose>
                        <c:when test = "${not empty registeredEmail}">
                            <input type="text" class="form-control" name = "username" placeholder="Username" required="required"value=${registeredEmail}>
                            <% session.removeAttribute("registeredEmail");%>
                        </c:when> 
                        <c:otherwise>
                            <input type="text" class="form-control" name = "username" placeholder="Username" required="required">
                        </c:otherwise>    
                    </c:choose>
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" name = "password" placeholder="Password" required="required">
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-primary btn-block">Log in</button>
                </div>

            </form>
            <!--<p class="text-center"><a href="member_register.jsp">Create an Account</a></p>-->
        </div>
    </body>
</html>