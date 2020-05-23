
<%@page import="data.Register"%>
<%@page import="business.ResponseObject"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="org.apache.catalina.connector.Request"%>
<%@page import="data.Login"%>
<%@page import="business.BusinessTier"%>
<%@page import="business.BusinessTier_Service"%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username != null && password != null) {
        BusinessTier_Service dataServiceService = new BusinessTier_Service();
        BusinessTier proxy = dataServiceService.getBusinessTierPort();

        Login login = new Login();
        login.setEmail(username);
        login.setPassword(password);

        ResponseObject returnResponse = proxy.checkLogin(login);
        switch (returnResponse.getCode()) {
            case 200:
                Register user = (Register) returnResponse.getObject();
                request.getSession().setAttribute("username", username);
                request.getSession().setAttribute("userId", user.getId());
                request.getSession().setAttribute("userRole", user.getUserRole());
                request.getSession().setAttribute("isLoggedIn", true);
                response.sendRedirect("../member_dashboard.jsp");
                break;
            case 500:
                request.getSession().setAttribute("message", returnResponse.getMessage());
                response.sendRedirect("../member_login.jsp");
                break;
        }
    } else {
        request.getSession().setAttribute("message", "Enter email and password");
        response.sendRedirect("../member_login.jsp");
    }

%>