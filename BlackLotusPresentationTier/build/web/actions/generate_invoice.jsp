<%@page import="business.BusinessTier"%>
<%@page import="business.BusinessTier_Service"%>
<%@page import="java.util.ArrayList"%>
<%@page import="data.Item"%>
<%

    ArrayList<Item> items = (ArrayList<Item>) request.getSession().getAttribute("items_list");

    BusinessTier_Service dataServiceService = new BusinessTier_Service();
    BusinessTier proxy = dataServiceService.getBusinessTierPort();

    int vendorId = Integer.parseInt(request.getSession().getAttribute("vendorId").toString());
    int orderId = Integer.parseInt(proxy.insertOrder(items, vendorId).getObject().toString());

    request.getSession().removeAttribute("total");
    request.getSession().removeAttribute("items_list");

    response.sendRedirect("../view_invoice.jsp?invoice_id=" + orderId);

%>