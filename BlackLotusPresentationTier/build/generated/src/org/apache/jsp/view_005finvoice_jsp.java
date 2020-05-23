package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import data.Vendor;
import data.Item;
import data.Order;
import business.BusinessTier_Service;
import business.BusinessTier;

public final class view_005finvoice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>  \n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.5/jspdf.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/html2canvas/0.4.1/html2canvas.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\" integrity=\"sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Black lotus - View invoice</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            form{\n");
      out.write("                margin: 20px 0;\n");
      out.write("            }\n");
      out.write("            form input, button{\n");
      out.write("                padding: 5px;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                color : white;\n");
      out.write("            }\n");
      out.write("            table, th, td{\n");
      out.write("                border: 1px solid #cdcdcd;\n");
      out.write("                color : white;\n");
      out.write("            }\n");
      out.write("            table th, table td{\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: left;\n");
      out.write("                color : white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media print {\n");
      out.write("                #printbtn {\n");
      out.write("                    display :  none;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function myFunction() {\n");
      out.write("                window.print();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <button id=\"clickbind\">Click</button>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\" >\n");
      out.write("                <br>\n");
      out.write("                <div class=\"shadow-lg p-3 mb-5 bg-white rounded\"id = \"invoice\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <h1>Invoice</h1><br>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("\n");
      out.write("                            <input class=\"btn btn-info\" id =\"printbtn\" type=\"button\" \n");
      out.write("                                   value=\"Print this page\" onclick=\"window.print();\" \n");
      out.write("                                   style=\"float: right;\" data-html2canvas-ignore=\"false\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6 \">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <img src=\"images/icon.png\" width = \"150\"/>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <h4>Black lotus</h4>\n");
      out.write("                                    No .1,</br>Dharmapala Mawatha,</br>Colombo - 01</br></br>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6 \">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");
double total = 0.0;
                                if (request.getParameter("invoice_id") != null) {
                                    BusinessTier_Service businessTier_Service = new BusinessTier_Service();
                                    BusinessTier businessTier = businessTier_Service.getBusinessTierPort();

                                    int orderId = Integer.parseInt(request.getParameter("invoice_id"));
                                    Order order = businessTier.getOrderById(orderId);

                                    out.print("<b>Invoice Id :</b> " + request.getParameter("invoice_id") + "</br>");
                                    out.print("<b>Invoice Date : </b>" + order.getOrderDate() + "</br>");

                                    Vendor vendor = businessTier.getVendorById(order.getVendorId());
                                    out.print("<b>Vendor Name : </b>" + vendor.getName() + "</br></br>");

                            
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <table class=\"table-striped table-dark\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Item</th>\n");
      out.write("                                <th>Quantity</th>\n");
      out.write("                                <th>Unit price</th>\n");
      out.write("                                <th>Amount</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
                                    for (Item item : order.getOrderItem()) {
                                        total += item.getPrice() * item.getQty();

                                        out.print("<tr>");
                                        out.print("<td>" + item.getName() + "</td>");
                                        out.print("<td>" + item.getQty() + "</td>");
                                        out.print("<td>" + item.getPrice() + "</td>");
                                        out.print("<td>" + item.getQty() * item.getPrice() + "</td>");
                                        out.print("</tr>");

                                    }

                                } else {
                                    out.print("Order id required");
                                }


                            
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-8\"></div>\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <p class='text-right p-3 mb-2 bg-success text-white'><b>Total </b> ");
 out.print(total);
      out.write(" </p></br></br>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("    \n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty isVendorLoggedIn}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
        out.write("                        <a class=\"navbar-brand\" href=\"vendor_dashboard.jsp\">Black Lotus</a>\n");
        out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
        out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
        out.write("                        </button>\n");
        out.write("\n");
        out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
        out.write("                            <ul class=\"navbar-nav mr-auto\">\n");
        out.write("                                <li class=\"nav-item \">\n");
        out.write("                                    <a class=\"nav-link\" href=\"vendor_dashboard.jsp\">Home </a>\n");
        out.write("                                </li>\n");
        out.write("\n");
        out.write("                                <li class=\"nav-item\">\n");
        out.write("                                    <a class=\"nav-link\" href=\"invoice_generate.jsp\">Generate order</a>\n");
        out.write("                                </li>\n");
        out.write("\n");
        out.write("                                <li class=\"nav-item \">\n");
        out.write("                                    <a class=\"nav-link\" href=\"view_stock.jsp\">View stock</a>\n");
        out.write("                                </li>\n");
        out.write("                            </ul>\n");
        out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
        out.write("\n");
        out.write("                                <li>\n");
        out.write("                                    <a class=\"btn btn-danger\" style=\"float: right\" href='actions/logout.jsp'>Logout</a>\n");
        out.write("\n");
        out.write("                                </li>\n");
        out.write("                            </ul>\n");
        out.write("                        </div>\n");
        out.write("                    </nav>\n");
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
        out.write("                        <a class=\"navbar-brand\" href=\"member_dashboard.jsp\">Black Lotus</a>\n");
        out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
        out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
        out.write("                        </button>\n");
        out.write("\n");
        out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
        out.write("                            <ul class=\"navbar-nav mr-auto\">\n");
        out.write("                                <li class=\"nav-item active\">\n");
        out.write("                                    <a class=\"nav-link\" href=\"member_dashboard.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
        out.write("                                </li>\n");
        out.write("                                <li class=\"nav-item\">\n");
        out.write("                                    <a class=\"nav-link\" href=\"category.jsp\">Category</a>\n");
        out.write("                                </li>\n");
        out.write("                                <li class=\"nav-item\">\n");
        out.write("                                    <a class=\"nav-link\" href=\"item.jsp\">Item</a>\n");
        out.write("                                </li>\n");
        out.write("\n");
        out.write("                                <li class=\"nav-item\">\n");
        out.write("                                    <a class=\"nav-link\" href=\"view_orders.jsp\">Orders</a>\n");
        out.write("                                </li>\n");
        out.write("\n");
        out.write("                                <li class=\"nav-item\">\n");
        out.write("                                    <a class=\"nav-link\" href=\"stock_update.jsp\">Update stock</a>\n");
        out.write("                                </li>\n");
        out.write("                            </ul>\n");
        out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
        out.write("\n");
        out.write("                                <li>\n");
        out.write("                                    <a class=\"btn btn-danger\" style=\"float: right\" href='actions/logout.jsp'>Logout</a>\n");
        out.write("\n");
        out.write("                                </li>\n");
        out.write("                            </ul>\n");
        out.write("\n");
        out.write("\n");
        out.write("                        </div>\n");
        out.write("                    </nav>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
