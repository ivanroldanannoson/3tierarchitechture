
<%@page import="business.ResponseObject"%>
<%@page import="data.Category"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="org.apache.catalina.connector.Request"%>
<%@page import="data.Login"%>
<%@page import="business.BusinessTier"%>
<%@page import="business.BusinessTier_Service"%>
<%
    String name = request.getParameter("name");
    String description = request.getParameter("description");

    if (name != null && description != null) {
        BusinessTier_Service dataServiceService = new BusinessTier_Service();
        BusinessTier proxy = dataServiceService.getBusinessTierPort();

        Category category = new Category();
        category.setName(name);
        category.setDescription(description);
        int userId = Integer.parseInt(request.getSession().getAttribute("userId").toString());
        category.setAddedBy(userId);

        ResponseObject returnResponse = proxy.createCategory(category);
        switch (returnResponse.getCode()) {
            case 200:
                response.sendRedirect("../category.jsp");
                break;
            case 500:
                request.getSession().setAttribute("message", returnResponse.getMessage());
                response.sendRedirect("../category.jsp");
                break;
        }
    } else {
        request.getSession().setAttribute("isLoggedIn", false);
        request.getSession().setAttribute("message", "Enter email and password");
        response.sendRedirect("../category.jsp");
    }

%>