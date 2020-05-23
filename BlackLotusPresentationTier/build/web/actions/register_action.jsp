
<%@page import="business.ResponseObject"%>
<%@page import="data.Register"%>
<%@page import="business.BusinessTier_Service"%>
<%@page import="business.BusinessTier"%>
<%
    String first_name = request.getParameter("first_name");
    String last_name = request.getParameter("last_name");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    int user_role = 2;

    if (first_name != null && last_name != null && email != null && password != null) {
        BusinessTier_Service dataServiceService = new BusinessTier_Service();
        BusinessTier proxy = dataServiceService.getBusinessTierPort();

        Register register = new Register();
        register.setName(first_name.concat(" ").concat(last_name));
        register.setEmail(email);
        register.setPassword(password);
        register.setUserRole(user_role);

        ResponseObject returnResponse = proxy.userRegister(register);
        switch (returnResponse.getCode()) {
            case 200:
                request.getSession().setAttribute("registeredEmail", returnResponse.getObject());
                response.sendRedirect("../index.jsp");
                break;
            case 500:
                request.getSession().setAttribute("register_error_message", returnResponse.getMessage());
                response.sendRedirect("../member_register.jsp");
                break;
        }
    } else {
        request.getSession().setAttribute("register_error_message", "Enter all fields");
        response.sendRedirect("../member_register.jsp");
    }

%>