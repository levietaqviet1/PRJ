package org.apache.jsp.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgotPassW_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("        <title>FPT University Academic Portal</title>\n");
      out.write("\n");
      out.write("        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"75x75\" href=\"img/d.png\" />\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"https://s3.ap-northeast-1.amazonaws.com/h.files/images/1655654596490_Cn6PveFXv2.png\" />\n");
      out.write("\n");
      out.write("        <!--     Fonts and icons     -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\" />-->\n");
      out.write("\n");
      out.write("        <!-- CSS Files -->\n");
      out.write("        <!--<link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />-->\n");
      out.write("        <link href=\"css/login/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!--<link href=\"assets/css/material-bootstrap-wizard.css\" rel=\"stylesheet\" />-->\n");
      out.write("        <link href=\"css/login/material-bootstrap-wizard.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("        <link href=\"css/login/demo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/load/loadCss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("      \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    <script src=\"js/login/jquery-2.2.4.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/login/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<!--<script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>-->\n");
      out.write("<script src=\"js/login/jquery.bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!--  Plugin for the Wizard -->\n");
      out.write("<script src=\"js/login/material-bootstrap-wizard.js\"></script>\n");
      out.write("\n");
      out.write("<!--  More information about jquery.validate here: http://jqueryvalidation.org/\t -->\n");
      out.write("<script src=\"js/login/jquery.validate.min.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"js/login/main.js\"></script>\n");
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
}
