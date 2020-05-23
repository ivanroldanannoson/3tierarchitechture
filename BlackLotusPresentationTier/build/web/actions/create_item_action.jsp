
<%@page import="data.Item"%>
<%@page import="business.ResponseObject"%>
<%@page import="data.Category"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="org.apache.catalina.connector.Request"%>
<%@page import="data.Login"%>
<%@page import="business.BusinessTier"%>
<%@page import="business.BusinessTier_Service"%>
<%
    String name = request.getParameter("name");
    String price = request.getParameter("price");
    String quantity = request.getParameter("quantity");
    String category = request.getParameter("category");
    
    if (name != null && price != null&& quantity != null&& category != null) {
        BusinessTier_Service dataServiceService = new BusinessTier_Service();
        BusinessTier proxy = dataServiceService.getBusinessTierPort();

        Item item = new Item();
        item.setName(name);
        item.setPrice(Float.parseFloat(price));
        item.setQty(Integer.parseInt(quantity));
        item.setCategoryType(Integer.parseInt(category));
         int userId = Integer.parseInt(request.getSession().getAttribute("userId").toString());
        item.setAddedBy(userId);

        ResponseObject returnResponse = proxy.createItem(item);
        switch (returnResponse.getCode()) {
            case 200:
                response.sendRedirect("../item.jsp");
                break;
            case 500:
                request.getSession().setAttribute("message", returnResponse.getMessage());
                response.sendRedirect("../item.jsp");
                break;
        }
    } else {
        request.getSession().setAttribute("isLoggedIn", false);
        request.getSession().setAttribute("message", "Enter email and password");
        response.sendRedirect("../item.jsp");
    }

%>