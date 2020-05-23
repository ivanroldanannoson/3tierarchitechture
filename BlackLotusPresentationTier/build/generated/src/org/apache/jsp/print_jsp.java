package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class print_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <title></title>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-1.12.4.min.js\" integrity=\"sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ=\" crossorigin=\"anonymous\"></script>  \n");
      out.write("   <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.5/jspdf.min.js\"></script>  \n");
      out.write("   <script>  \n");
      out.write("    (function () {  \n");
      out.write("        var  \n");
      out.write("         form = $('.form'),  \n");
      out.write("         cache_width = form.width(),  \n");
      out.write("         a4 = [595.28, 841.89]; // for a4 size paper width and height  \n");
      out.write("  \n");
      out.write("        $('#create_pdf').on('click', function () {  \n");
      out.write("            $('body').scrollTop(0);  \n");
      out.write("            createPDF();  \n");
      out.write("        });  \n");
      out.write("        //create pdf  \n");
      out.write("        function createPDF() {  \n");
      out.write("            getCanvas().then(function (canvas) {  \n");
      out.write("                var  \n");
      out.write("                 img = canvas.toDataURL(\"image/png\"),  \n");
      out.write("                 doc = new jsPDF({  \n");
      out.write("                     unit: 'px',  \n");
      out.write("                     format: 'a4'  \n");
      out.write("                 });  \n");
      out.write("                doc.addImage(img, 'JPEG', 20, 20);  \n");
      out.write("                doc.save('Bhavdip-html-to-pdf.pdf');  \n");
      out.write("                form.width(cache_width);  \n");
      out.write("            });  \n");
      out.write("        }  \n");
      out.write("  \n");
      out.write("        // create canvas object  \n");
      out.write("        function getCanvas() {  \n");
      out.write("            form.width((a4[0] * 1.33333) - 80).css('max-width', 'none');  \n");
      out.write("            return html2canvas(form, {  \n");
      out.write("                imageTimeout: 2000,  \n");
      out.write("                removeContainer: true  \n");
      out.write("            });  \n");
      out.write("        }  \n");
      out.write("  \n");
      out.write("    }());  \n");
      out.write("</script>  \n");
      out.write("<script>  \n");
      out.write("    /* \n");
      out.write(" * jQuery helper plugin for examples and tests \n");
      out.write(" */  \n");
      out.write("    (function ($) {  \n");
      out.write("        $.fn.html2canvas = function (options) {  \n");
      out.write("            var date = new Date(),  \n");
      out.write("            $message = null,  \n");
      out.write("            timeoutTimer = false,  \n");
      out.write("            timer = date.getTime();  \n");
      out.write("            html2canvas.logging = options && options.logging;  \n");
      out.write("            html2canvas.Preload(this[0], $.extend({  \n");
      out.write("                complete: function (images) {  \n");
      out.write("                    var queue = html2canvas.Parse(this[0], images, options),  \n");
      out.write("                    $canvas = $(html2canvas.Renderer(queue, options)),  \n");
      out.write("                    finishTime = new Date();  \n");
      out.write("  \n");
      out.write("                    $canvas.css({ position: 'absolute', left: 0, top: 0 }).appendTo(document.body);  \n");
      out.write("                    $canvas.siblings().toggle();  \n");
      out.write("  \n");
      out.write("                    $(window).click(function () {  \n");
      out.write("                        if (!$canvas.is(':visible')) {  \n");
      out.write("                            $canvas.toggle().siblings().toggle();  \n");
      out.write("                            throwMessage(\"Canvas Render visible\");  \n");
      out.write("                        } else {  \n");
      out.write("                            $canvas.siblings().toggle();  \n");
      out.write("                            $canvas.toggle();  \n");
      out.write("                            throwMessage(\"Canvas Render hidden\");  \n");
      out.write("                        }  \n");
      out.write("                    });  \n");
      out.write("                    throwMessage('Screenshot created in ' + ((finishTime.getTime() - timer) / 1000) + \" seconds<br />\", 4000);  \n");
      out.write("                }  \n");
      out.write("            }, options));  \n");
      out.write("  \n");
      out.write("            function throwMessage(msg, duration) {  \n");
      out.write("                window.clearTimeout(timeoutTimer);  \n");
      out.write("                timeoutTimer = window.setTimeout(function () {  \n");
      out.write("                    $message.fadeOut(function () {  \n");
      out.write("                        $message.remove();  \n");
      out.write("                    });  \n");
      out.write("                }, duration || 2000);  \n");
      out.write("                if ($message)  \n");
      out.write("                    $message.remove();  \n");
      out.write("                $message = $('<div ></div>').html(msg).css({  \n");
      out.write("                    margin: 0,  \n");
      out.write("                    padding: 10,  \n");
      out.write("                    background: \"#000\",  \n");
      out.write("                    opacity: 0.7,  \n");
      out.write("                    position: \"fixed\",  \n");
      out.write("                    top: 10,  \n");
      out.write("                    right: 10,  \n");
      out.write("                    fontFamily: 'Tahoma',  \n");
      out.write("                    color: '#fff',  \n");
      out.write("                    fontSize: 12,  \n");
      out.write("                    borderRadius: 12,  \n");
      out.write("                    width: 'auto',  \n");
      out.write("                    height: 'auto',  \n");
      out.write("                    textAlign: 'center',  \n");
      out.write("                    textDecoration: 'none'  \n");
      out.write("                }).hide().fadeIn().appendTo('body');  \n");
      out.write("            }  \n");
      out.write("        };  \n");
      out.write("    })(jQuery);  \n");
      out.write("  \n");
      out.write("</script>  \n");
      out.write("    <style>  \n");
      out.write("        table {  \n");
      out.write("            font-family: arial, sans-serif;  \n");
      out.write("            border-collapse: collapse;  \n");
      out.write("            width: 100%;  \n");
      out.write("        }  \n");
      out.write("  \n");
      out.write("        td, th {  \n");
      out.write("            border: 1px solid #dddddd;  \n");
      out.write("            text-align: left;  \n");
      out.write("            padding: 8px;  \n");
      out.write("        }  \n");
      out.write("  \n");
      out.write("        tr:nth-child(even) {  \n");
      out.write("            background-color: #dddddd;  \n");
      out.write("        }  \n");
      out.write("    </style>  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <input type=\"button\" id=\"create_pdf\" value=\"Generate PDF\">  \n");
      out.write("\n");
      out.write("    <form class=\"form\" style=\"max-width: none; width: 1005px;\">  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("        <h2 style=\"color: #0094ff\">Hello</h2>  \n");
      out.write("        <h3>a bit about this Project:</h3>  \n");
      out.write("        <p style=\"font-size: large\">  \n");
      out.write("            I will demonstrate how to generate PDF file of your HTML page with CSS using JavaScript and J query.  \n");
      out.write("        </p>  \n");
      out.write("        <table>  \n");
      out.write("            <tbody>  \n");
      out.write("                <tr>  \n");
      out.write("                    <th>Company</th>  \n");
      out.write("                    <th>Contact</th>  \n");
      out.write("                    <th>Country</th>  \n");
      out.write("                </tr>  \n");
      out.write("                <tr>  \n");
      out.write("                    <td>Alfreds Futterkiste</td>  \n");
      out.write("                    <td>Maria Anders</td>  \n");
      out.write("                    <td>Germany</td>  \n");
      out.write("                </tr>  \n");
      out.write("                <tr>  \n");
      out.write("                    <td>Centro comercial Moctezuma</td>  \n");
      out.write("                    <td>Francisco Chang</td>  \n");
      out.write("                    <td>Mexico</td>  \n");
      out.write("                </tr>  \n");
      out.write("                <tr>  \n");
      out.write("                    <td>Ernst Handel</td>  \n");
      out.write("                    <td>Roland Mendel</td>  \n");
      out.write("                    <td>Austria</td>  \n");
      out.write("                </tr>  \n");
      out.write("                <tr>  \n");
      out.write("                    <td>Island Trading</td>  \n");
      out.write("                    <td>Helen Bennett</td>  \n");
      out.write("                    <td>UK</td>  \n");
      out.write("                </tr>  \n");
      out.write("                <tr>  \n");
      out.write("                    <td>Laughing Bacchus Winecellars</td>  \n");
      out.write("                    <td>Yoshi Tannamuri</td>  \n");
      out.write("                    <td>Canada</td>  \n");
      out.write("                </tr>  \n");
      out.write("                <tr>  \n");
      out.write("                    <td>Magazzini Alimentari Riuniti</td>  \n");
      out.write("                    <td>Giovanni Rovelli</td>  \n");
      out.write("                    <td>Italy</td>  \n");
      out.write("                </tr>  \n");
      out.write("            </tbody>  \n");
      out.write("        </table>  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("    </form>  \n");
      out.write("</body>\n");
      out.write("</html>");
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
}
