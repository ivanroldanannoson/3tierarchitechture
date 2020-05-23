
<%@page import="data.Register"%>
<%@page import="business.ResponseObject"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="org.apache.catalina.connector.Request"%>
<%@page import="data.Login"%>
<%@page import="business.BusinessTier"%>
<%@page import="business.BusinessTier_Service"%>
<%
    String username = request.getParameter("username");

    if (username != null) {
        BusinessTier_Service dataServiceService = new BusinessTier_Service();
        BusinessTier proxy = dataServiceService.getBusinessTierPort();


        ResponseObject returnResponse = proxy.forgotPasswordVendor(username);
        switch (returnResponse.getCode()) {
            case 200:
                String password = (String)returnResponse.getObject();
                
                request.getSession().setAttribute("messageSuccess", returnResponse.getMessage());
                response.sendRedirect("../vendor_forgot_password.jsp");
                break;
            case 500:
                request.getSession().setAttribute("message", returnResponse.getMessage());
                response.sendRedirect("../vendor_forgot_password.jsp");
                break;
        }
    } else {
        request.getSession().setAttribute("message", "Enter email");
        response.sendRedirect("../vendor_forgot_password.jsp");
    }

%>