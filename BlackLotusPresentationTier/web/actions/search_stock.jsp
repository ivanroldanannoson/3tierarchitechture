<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="data.Item"%>
<%@page import="business.BusinessTier"%>
<%@page import="business.BusinessTier_Service"%>
<%
    String searchText = request.getParameter("search_text");

    BusinessTier_Service businessTier_Service = new BusinessTier_Service();
    BusinessTier businessTier = businessTier_Service.getBusinessTierPort();

    List<Item> items = businessTier.searchOrCheckStockCakeByItemNameOrCode(searchText).getItem();
    request.getSession().setAttribute("searchItems", items);

    response.sendRedirect("../view_stock.jsp");

%>