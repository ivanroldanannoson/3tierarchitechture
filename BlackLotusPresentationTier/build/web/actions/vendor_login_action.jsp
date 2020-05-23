
<%@page import="data.Vendor"%>
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

        ResponseObject returnResponse = proxy.vendorLogin(login);
        switch (returnResponse.getCode()) {
            case 200:
                Vendor vendor = (Vendor) returnResponse.getObject();
                request.getSession().setAttribute("username", username);
                request.getSession().setAttribute("vendorId", vendor.getId());
                request.getSession().setAttribute("isVendorLoggedIn", true);
                response.sendRedirect("../vendor_dashboard.jsp");
                break;
            case 500:
                request.getSession().setAttribute("message", returnResponse.getMessage());
                response.sendRedirect("../vendor_login.jsp");
                break;
        }
    } else {
        request.getSession().setAttribute("message", "Enter email and password");
        response.sendRedirect("../vendor_login.jsp");
    }

%>