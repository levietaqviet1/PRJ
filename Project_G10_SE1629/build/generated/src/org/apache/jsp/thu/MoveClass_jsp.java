package org.apache.jsp.thu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MoveClass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Move Class</title>\n");
      out.write("        <style>\n");
      out.write("           *{\n");
      out.write("                font-family: \"Verdana\",sans-serif;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100vh;\n");
      out.write("                background-image: linear-gradient(to right top,#d7e6f9,#f3d3b4,#ffffff);\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                font-size: 18px;\n");
      out.write("                border: 0.1px solid #917881;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                border-spacing: 20px;\n");
      out.write("                padding: 1rem;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .move{\n");
      out.write("                width: 100%;\n");
      out.write("                max-width: 50rem;\n");
      out.write("                background-color: #fff;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                padding: 2rem 1rem;\n");
      out.write("            }\n");
      out.write("            .title{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .table{\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"move\">\n");
      out.write("            \n");
      out.write("            <div class=\"title\">\n");
      out.write("                <h1> Move Class </h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"table\">\n");
      out.write("\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Campus:\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <select style=\"border-radius: 10px; padding: 5px\"><option>FU-HL</option></select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Subject Code:\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input style=\"border-radius: 10px; padding: 5px\" type=\"text\" name=\"subject\">  \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            From Class:\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input style=\"border-radius: 10px; padding: 5px\" type=\"text\" name=\"ClassA\">\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            To Class:\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input style=\"border-radius: 10px; padding: 5px\" type=\"text\" name=\"ClassB\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                        \n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("                <div>\n");
      out.write("                    <input style=\"margin-left: 350px;background-color: beige;border-radius: 10px; padding: 5px\" type=\"submit\" name=\"OK\" value=\"Send\"> \n");
      out.write("                    <input style=\"background-color:gainsboro;border-radius: 10px; padding: 5px \" type=\"reset\" name=\"cancel\" value=\"Cancel\">  \n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
}
