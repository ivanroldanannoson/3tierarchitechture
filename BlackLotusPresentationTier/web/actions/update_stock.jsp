<%@page import="business.BusinessTier"%>
<%@page import="business.BusinessTier_Service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="data.Item"%>
<%

    ArrayList<Item> items = (ArrayList<Item>) request.getSession().getAttribute("stock_items_list");

    BusinessTier_Service dataServiceService = new BusinessTier_Service();
    BusinessTier proxy = dataServiceService.getBusinessTierPort();

    proxy.updateStock(items);
    request.getSession().removeAttribute("stock_items_list");

    response.sendRedirect("../view_stock.jsp");

%>