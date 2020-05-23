<%@page import="java.util.ArrayList"%>
<%@page import="data.Item"%>
<%@page import="business.BusinessTier"%>
<%@page import="business.BusinessTier_Service"%>
<%
    String itemId = request.getParameter("itemId");
    String quantity = request.getParameter("qty");

    BusinessTier_Service businessTier_Service = new BusinessTier_Service();
    BusinessTier businessTier = businessTier_Service.getBusinessTierPort();
    Item item = (Item) businessTier.getItemById(Integer.parseInt(itemId)).getObject();

    item.setQty(Integer.parseInt(quantity));

    ArrayList<Item> items = null;

    if (request.getSession().getAttribute("stock_items_list") != null) {
        items = (ArrayList<Item>) request.getSession().getAttribute("stock_items_list");
        items.add(item);
    } else {
        items = new ArrayList<Item>();
        items.add(item);
    }
    request.getSession().setAttribute("stock_items_list", items);

    response.sendRedirect("../stock_update.jsp");

%>