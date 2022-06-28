package org.apache.jsp.cEmail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import location.locationHot;

public final class sendSuEmail_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

    if (request.getAttribute("nextAdd") != null) {
     

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("        <title>FPT University Academic Portal</title>\r\n");
      out.write("\r\n");
      out.write("        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\" />\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"75x75\" href=\"img/d.png\" />\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"https://s3.ap-northeast-1.amazonaws.com/h.files/images/1655654596490_Cn6PveFXv2.png\" />\r\n");
      out.write("\r\n");
      out.write("        <!--     Fonts and icons     -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- CSS Files -->\r\n");
      out.write("        <!--<link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />-->\r\n");
      out.write("        <link href=\"css/login/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <!--<link href=\"assets/css/material-bootstrap-wizard.css\" rel=\"stylesheet\" />-->\r\n");
      out.write("        <link href=\"css/login/material-bootstrap-wizard.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <!-- CSS Just for demo purpose, don't include it in your project -->\r\n");
      out.write("        <link href=\"css/login/demo.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/load/loadCss.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <style>\r\n");
      out.write("            #imgEmail {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 300px;\r\n");
      out.write("                padding: 0px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #imgEmail img {\r\n");
      out.write("                margin-left: auto;\r\n");
      out.write("                margin-right: auto;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 100%;\r\n");
      out.write("                object-fit: contain;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"preloder\">\r\n");
      out.write("            <div class=\"loader\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"image-container set-full-height\" style=\"background-image: url('https://i.imgur.com/duhzz35.jpeg')\">\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <div class=\"logo-container\">\r\n");
      out.write("                    <div class=\"logo\">\r\n");
      out.write("                        <img src=\"https://s3.ap-northeast-1.amazonaws.com/h.files/images/1655654596490_Cn6PveFXv2.png\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"brand\">\r\n");
      out.write("                        FPT University \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-8 col-sm-offset-2\">\r\n");
      out.write("                        <!--      Wizard container        -->\r\n");
      out.write("                        <div class=\"wizard-container\">\r\n");
      out.write("                            <div class=\"card wizard-card\" style=\"padding-bottom: 0;\" data-color=\"red\" id=\"wizard\">\r\n");
      out.write("                                <div class=\"wizard-header\" style=\"padding-bottom: 0;\">\r\n");
      out.write("                                    <h3 class=\"wizard-title\">\r\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                    </h3>\r\n");
      out.write("                                    <h5>Lưu ý: Thư có thể nằm trong Thư rác (Junk Mail). Chức năng có hiệu lực trong vòng 1 ngày</h5>\r\n");
      out.write("                                    <div id='imgEmail'>\r\n");
      out.write("                                        <img src=\"https://png.pngtree.com/element_our/20190601/ourlarge/pngtree-check-mark-gold-foil-material-element-image_1345783.jpg\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"wizard-footer\" style=\"text-align: center\">\r\n");
      out.write("                            ");

                            locationHot location = new locationHot();
                            
                            
      out.write("\r\n");
      out.write("                           \r\n");
      out.write("                            <a href=\"https://mail.google.com/mail/u/1/?pli=1#all\"><button type='button' class='btn btn-next btn-fill btn-danger btn-wd' name='login' value='' >Move Email</button></a>\r\n");
      out.write("                            <a href=\"http://localhost:");
      out.print(location.getLocal());
      out.write("/Project_G10_SE1629/home\"><button type='button' id=\"signup\"  class='btn btn-finish  btn-fill btn-danger btn-wd' name='signup' >Move Home</button></a>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("    <!--   Core JS Files   -->\r\n");
      out.write("    <!--<script src=\"assets/js/jquery-2.2.4.min.js\" type=\"text/javascript\"></script>-->\r\n");
      out.write("    <script src=\"js/login/jquery-2.2.4.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"js/login/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <!--<script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>-->\r\n");
      out.write("    <script src=\"js/login/jquery.bootstrap.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!--  Plugin for the Wizard -->\r\n");
      out.write("    <script src=\"js/login/material-bootstrap-wizard.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!--  More information about jquery.validate here: http://jqueryvalidation.org/\t -->\r\n");
      out.write("    <script src=\"js/login/jquery.validate.min.js\"></script>\r\n");
      out.write("    <script src=\"js/login/main.js\"></script>\r\n");
      out.write("</html>\r\n");
}else{
        response.sendRedirect("home");
    }

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
