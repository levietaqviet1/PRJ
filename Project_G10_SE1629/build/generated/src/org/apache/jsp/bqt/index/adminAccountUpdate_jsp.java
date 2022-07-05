package org.apache.jsp.bqt.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminAccountUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--=== Coding by CodingLab | www.codinglabweb.com === -->\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("        <!----======== CSS ======== -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"cssBQT/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"boot/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"boot/bootstrap.css\">\r\n");
      out.write("        <!----===== Iconscout CSS ===== -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unicons.iconscout.com/release/v4.0.0/css/line.css\">\r\n");
      out.write("\r\n");
      out.write("        <!--<title>Admin Dashboard Panel</title>-->\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <form action=\"updateAccountController?ida=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.s.getAccountID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" method=\"POST\">\r\n");
      out.write("            <nav>\r\n");
      out.write("                <div class=\"logo-name\">\r\n");
      out.write("                    <div class=\"logo-image\">\r\n");
      out.write("                        <img src=\"images/logo.jpg\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <span class=\"logo_name\"><a href=\"AdminPage\" style=\"text-decoration: none;color: black\">Admin Page</a></span>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"menu-items\">\r\n");
      out.write("                    <ul class=\"nav-links\">\r\n");
      out.write("                        <li><a href=\"AdminPage\">\r\n");
      out.write("                                <i class=\"uil uil-estate\"></i>\r\n");
      out.write("                                <span class=\"link-name\">Account</span>\r\n");
      out.write("                            </a></li>                \r\n");
      out.write("                        <li><a href=\"adminKinderPageHome\">\r\n");
      out.write("                                <i class=\"uil uil-chart\"></i>\r\n");
      out.write("                                <span class=\"link-name\">Kindergartner</span>\r\n");
      out.write("                            </a></li>\r\n");
      out.write("                        <li><a href=\"#\">\r\n");
      out.write("                                <i class=\"uil uil-thumbs-up\"></i>\r\n");
      out.write("                                <span class=\"link-name\">Class</span>\r\n");
      out.write("                            </a></li>\r\n");
      out.write("                        <li><a href=\"#\">\r\n");
      out.write("                                <i class=\"uil uil-comments\"></i>\r\n");
      out.write("                                <span class=\"link-name\">Schedule</span>\r\n");
      out.write("                            </a></li>\r\n");
      out.write("                        <li><a href=\"#\">\r\n");
      out.write("                                <i class=\"uil uil-share\"></i>\r\n");
      out.write("                                <span class=\"link-name\">Attendance</span>\r\n");
      out.write("                            </a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                    <ul class=\"logout-mode\">\r\n");
      out.write("                        <li><a href=\"#\">\r\n");
      out.write("                                <i class=\"uil uil-signout\"></i>\r\n");
      out.write("                                <span class=\"link-name\">Logout</span>\r\n");
      out.write("                            </a></li>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"dashboard\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"dash-lefttop\">\r\n");
      out.write("                    <img src=\"https://i.pinimg.com/originals/72/45/fb/7245fb0ca786bb4a98fb8465e437c5bb.jpg\" alt=\"\">\r\n");
      out.write("                    <a href=\"#\">User</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-title\" style=\"text-align: center;font-size: 50px;\">Update Account</div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-content\" style=\"width: 80%;height: auto; margin-left: 10%; padding-top: 0;padding-bottom: 0;\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"exampleFormControlInput1\" class=\"form-label\">First Name</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" name=\"txtFirstName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"exampleFormControlInput1\" class=\"form-label\">Last Name</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" name=\"txtLastName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"rdCheck\" style=\"display: flex\">\r\n");
      out.write("                        <div class=\"form-check\">\r\n");
      out.write("                            <label for=\"exampleFormControlInput1\" class=\"form-label\">Gender</label>\r\n");
      out.write("                            <input type=\"radio\" name=\"gender\" \r\n");
      out.write("\r\n");
      out.write("                                   ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("                                   value=\"male\" />Male\r\n");
      out.write("                            <input type=\"radio\" name=\"gender\" \r\n");
      out.write("\r\n");
      out.write("                                   ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("                                   value=\"female\" />Female \r\n");
      out.write("                            <br/>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"exampleFormControlInput1\" class=\"form-label\">Email</label>\r\n");
      out.write("                        <input type=\"email\" class=\"form-control\" id=\"exampleFormControlInput1\" name=\"txtEmail\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"name@example.com\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"exampleFormControlInput1\" class=\"form-label\">Pass Word</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txtPassword\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"exampleFormControlInput1\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"exampleFormControlInput1\" class=\"form-label\">DOB</label>\r\n");
      out.write("                        <input type=\"date\" name=\"dob\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>(yyyy-MM-dd)<br/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"exampleFormControlInput1\" class=\"form-label\">Number Phone</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" name=\"txtPhone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.phoneNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"name@example.com\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--                    <div class=\"mb-3\">\r\n");
      out.write("                                            <label for=\"exampleFormControlTextarea1\" class=\"form-label\">Address</label>\r\n");
      out.write("                                            <textarea class=\"form-control\" id=\"exampleFormControlTextarea1\" name=\"ttAddress\"   rows=\"3\"></textarea>\r\n");
      out.write("                                        </div>-->\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"exampleFormControlInput1\" class=\"form-label\">Address</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" name=\"ttAddress\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"name@example.com\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"exampleFormControlInput1\" class=\"form-label\">Image</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" name=\"txtImg\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"name@example.com\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <label for=\"exampleFormControlInput1\" class=\"form-label\">Role</label>\r\n");
      out.write("                    <select class=\"form-select\" name=\"slRole\" aria-label=\"Default select example\">\r\n");
      out.write("                        \r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <div class=\"d-grid gap-2 d-md-block\" style=\"margin-top: 30px; margin-bottom: 30px; ;\">\r\n");
      out.write("                        <input type=\"submit\" value=\"Save\"/>\r\n");
      out.write("                        <button class=\"btn btn-primary\" type=\"button\" style=\"background-color: red;\">Cancel X</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <!-- <script src=\"agu.js\"></script> -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.gender}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                       checked=\"\"\r\n");
        out.write("                                   ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!s.gender}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                       checked=\"\"\r\n");
        out.write("                                   ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listR}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("role");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <option  value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role.role_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role.role_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
