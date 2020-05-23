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

    if (Integer.parseInt(quantity) <= item.getQty()) {
        item.setQty(Integer.parseInt(quantity));

        double total = 0.0;
        ArrayList<Item> items = null;
        if (request.getSession().getAttribute("total") != null) {
            total = Double.parseDouble(request.getSession().getAttribute("total").toString());
        }
        if (request.getSession().getAttribute("items_list") != null) {
            total = (total + (item.getPrice() * Integer.parseInt(quantity)));
            items = (ArrayList<Item>) request.getSession().getAttribute("items_list");
            items.add(item);
        } else {
            total = (double) (item.getPrice() * Integer.parseInt(quantity));
            items = new ArrayList<Item>();
            items.add(item);
        }
        request.getSession().setAttribute("total", total);
        request.getSession().setAttribute("items_list", items);
    } else {
        request.getSession().setAttribute("item_no_quantity_message", "Quantity not available");
    }
    response.sendRedirect("../invoice_generate.jsp");

%>