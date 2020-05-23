
<%@page import="business.ResponseObject"%>
<%@page import="data.Category"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="org.apache.catalina.connector.Request"%>
<%@page import="data.Login"%>
<%@page import="business.BusinessTier"%>
<%@page import="business.BusinessTier_Service"%>

<%
    String id = request.getParameter("category_id");
    String name = request.getParameter("category_name");
    String description = request.getParameter("category_description");

    if (id != null && name != null && description != null) {
        BusinessTier_Service dataServiceService = new BusinessTier_Service();
        BusinessTier proxy = dataServiceService.getBusinessTierPort();

        Category category = new Category();
        category.setId(Integer.parseInt(id));
        category.setName(name);
        category.setDescription(description);
        int userId = Integer.parseInt(request.getSession().getAttribute("userId").toString());
        category.setAddedBy(userId);

        ResponseObject returnResponse = proxy.editCategory(category);
        switch (returnResponse.getCode()) {
            case 200:
                request.getSession().setAttribute("sucess_message", returnResponse.getMessage());
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