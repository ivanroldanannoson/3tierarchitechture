<%@page import="java.util.ArrayList"%>
<%@page import="data.Item"%>
<%@page import="business.BusinessTier"%>
<%@page import="business.BusinessTier_Service"%>
<%

    request.getSession().removeAttribute("stock_items_list");
    response.sendRedirect("../stock_update.jsp");

%>