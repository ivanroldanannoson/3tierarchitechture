<%@page import="java.util.ArrayList"%>
<%@page import="data.Item"%>
<%@page import="business.BusinessTier"%>
<%@page import="business.BusinessTier_Service"%>
<%

    request.getSession().removeAttribute("total");
    request.getSession().removeAttribute("items_list");
    response.sendRedirect("../invoice_generate.jsp");

%>