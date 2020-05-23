
<%@page import="data.Vendor"%>
<%@page import="business.ResponseObject"%>
<%@page import="data.Register"%>
<%@page import="business.BusinessTier_Service"%>
<%@page import="business.BusinessTier"%>
<%
    String first_name = request.getParameter("first_name");
    String last_name = request.getParameter("last_name");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    String address = request.getParameter("address");
    String contact = request.getParameter("contact");
    int user_role = Integer.parseInt(request.getParameter("user_role"));
    int userId = Integer.parseInt(request.getSession().getAttribute("userId").toString());

    if (first_name != null && last_name != null && email != null && password != null&& address != null&& contact != null) {
        BusinessTier_Service dataServiceService = new BusinessTier_Service();
        BusinessTier proxy = dataServiceService.getBusinessTierPort();

        Vendor vendor = new Vendor();
        vendor.setName(first_name.concat(" ").concat(last_name));
        vendor.setEmail(email);
        vendor.setPassword(password);
        vendor.setAddress(address);
        vendor.setContact(contact);
        vendor.setVendorType(user_role);
        vendor.setAddedBy(userId);
       
        ResponseObject returnResponse = proxy.vendorRegister(vendor);
        switch (returnResponse.getCode()) {
            case 200:
                request.getSession().setAttribute("registeredEmail", returnResponse.getObject());
                response.sendRedirect("../index.jsp");
                break;
            case 500:
                request.getSession().setAttribute("register_error_message", returnResponse.getMessage());
                response.sendRedirect("../vendor_register.jsp");
                break;
        }
    } else {
        request.getSession().setAttribute("register_error_message", "Enter all fields");
        response.sendRedirect("../vendor_register.jsp");
    }

%>