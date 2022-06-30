package org.apache.jsp.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(7);
    _jspx_dependants.add("/index/../subIndex/home.jsp");
    _jspx_dependants.add("/index/../subIndex/MoveClass.jsp");
    _jspx_dependants.add("/index/../subIndex/MoveClassWithOther.jsp");
    _jspx_dependants.add("/index/../subIndex/RegisterExtraCourses.jsp");
    _jspx_dependants.add("/index/../subIndex/RegisterImproveMark.jsp");
    _jspx_dependants.add("/index/../subIndex/SendApplication.jsp");
    _jspx_dependants.add("/index/../subIndex/changePassword.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_var_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_var_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_var_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

if (request.getSession().getAttribute("dalogin") == null) {
            response.sendRedirect("home");
        }
if (request.getSession().getAttribute("st_login_successful") == null) {
            response.sendRedirect("index");
        }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>FPT University Academic Portal</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"https://s3.ap-northeast-1.amazonaws.com/h.files/images/1655654596490_Cn6PveFXv2.png\" />\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                font-family: \"Verdana\",sans-serif;\r\n");
      out.write("                transition: background-color .5s;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .sidenav {\r\n");
      out.write("                height: 100%;\r\n");
      out.write("                width: 0;\r\n");
      out.write("                position: fixed;\r\n");
      out.write("                z-index: 1;\r\n");
      out.write("                top: 0;\r\n");
      out.write("                left: 0;\r\n");
      out.write("                background-image: linear-gradient(to right top, #d7e6f9, #f3d3b4, #ffffff);\r\n");
      out.write("                overflow-x: hidden;\r\n");
      out.write("                transition: 0.5s;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .sidenav a {\r\n");
      out.write("                padding: 8px 8px 8px 32px;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                font-size: 15px;\r\n");
      out.write("                color: #818181;\r\n");
      out.write("\r\n");
      out.write("                display: block;\r\n");
      out.write("                transition: 0.3s;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .sidenav a:hover {\r\n");
      out.write("                color: #f1f1f1;\r\n");
      out.write("                background-color: #2196F3;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .sidenav a:active {\r\n");
      out.write("                background-color: #4121f3;\r\n");
      out.write("                color: #f1f1f1;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .acti10 {\r\n");
      out.write("                background-color: #4121f3;\r\n");
      out.write("                color: #f3d3b4;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            .sidenav .closebtn {\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                top: 0;\r\n");
      out.write("                right: 25px;\r\n");
      out.write("                font-size: 36px;\r\n");
      out.write("                margin-left: 50px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #main {\r\n");
      out.write("                transition: margin-left .5s;\r\n");
      out.write("                padding: 16px;\r\n");
      out.write("                float: left;\r\n");
      out.write("                width: 10%;\r\n");
      out.write("                height: 100%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #right {\r\n");
      out.write("\r\n");
      out.write("                float: right;\r\n");
      out.write("                width: 89%;\r\n");
      out.write("                height: 100%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            @media screen and (max-height: 450px) {\r\n");
      out.write("                .sidenav {\r\n");
      out.write("                    padding-top: 15px;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .sidenav a {\r\n");
      out.write("                    font-size: 18px;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            body {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 100vh;\r\n");
      out.write("                background-image: linear-gradient(to right top, #d7e6f9, #f3d3b4, #ffffff);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            .clear {\r\n");
      out.write("                clear: both;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .sidenav .closebtn{\r\n");
      out.write("                padding: 1px !important;\r\n");
      out.write("                margin: 5px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"mySidenav\" class=\"sidenav\">\r\n");
      out.write("            <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a><br /><br /><br />\r\n");
      out.write("            <form>\r\n");
      out.write("\r\n");
      out.write("                <a ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(" href=\"index?sid=1\">Home</a>\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <a ");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write(" href=\"index?sid=7\">Change Password</a>\r\n");
      out.write("                <a href=\"LogOutController?LogId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giaoDien}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                    <i class=\"uil uil-signout\"></i>\r\n");
      out.write("                    <span class=\"link-name\">Logout</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div id=\"main\">\r\n");
      out.write("                <span id=\"p\" style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\">&#9776</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"right\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"hearder\">");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clear\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("\r\n");
      out.write("            function openNav() {\r\n");
      out.write("\r\n");
      out.write("                document.getElementById(\"mySidenav\").style.width = \"20%\";\r\n");
      out.write("                document.getElementById(\"main\").style.marginLeft = \"18%\";\r\n");
      out.write("                document.body.style.backgroundColor = \"rgba(0,0,0,0.4)\";\r\n");
      out.write("                document.getElementById(\"p\").innerHTML = \"\";\r\n");
      out.write("                document.getElementById(\"right\").style.width = \"80%\";\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function closeNav() {\r\n");
      out.write("\r\n");
      out.write("                document.getElementById(\"mySidenav\").style.width = \"0\";\r\n");
      out.write("                document.getElementById(\"main\").style.marginLeft = \"0px\";\r\n");
      out.write("                document.body.style.backgroundColor = \"white\";\r\n");
      out.write("                document.getElementById(\"p\").innerHTML = \"&#9776\";\r\n");
      out.write("                document.getElementById(\"right\").style.width = \"89%\";\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        <!--   Core JS Files   -->\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giaoDien == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    _jspx_th_c_if_0.setVar("t");
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        class=\"acti10\"\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st_login_successful.getStatus().id!=1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    _jspx_th_c_if_1.setVar("t");
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <a ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write(" href=\"index?sid=2\">MoveClass\r\n");
        out.write("                    </a>\r\n");
        out.write("                    <a ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write(" href=\"index?sid=3\">MoveClassWithOther</a>\r\n");
        out.write("                    <a ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write(" href=\"index?sid=4\">RegisterExtraCourses</a>\r\n");
        out.write("                    <a ");
        if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write(" href=\"index?sid=5\">RegisterImproveMark</a>\r\n");
        out.write("                    <a ");
        if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write(" href=\"index?sid=6\">SendApplication</a>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giaoDien == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    _jspx_th_c_if_2.setVar("t");
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            class=\"acti10\"\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giaoDien == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    _jspx_th_c_if_3.setVar("t");
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            class=\"acti10\"\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giaoDien == 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    _jspx_th_c_if_4.setVar("t");
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            class=\"acti10\"\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giaoDien == 5}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    _jspx_th_c_if_5.setVar("t");
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            class=\"acti10\"\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giaoDien == 6}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    _jspx_th_c_if_6.setVar("t");
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            class=\"acti10\"\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_var_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giaoDien == 7}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    _jspx_th_c_if_7.setVar("t");
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        class=\"acti10\"\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_var_test.reuse(_jspx_th_c_if_7);
    return false;
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
        out.write("\r\n");
        out.write("                        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        ");
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        ");
        if (_jspx_meth_c_when_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        ");
        if (_jspx_meth_c_when_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                    ");
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giaoDien == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>JSP Page</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <h4>Thông báo:</h4>\n");
        out.write("        <h4>Tình trạng sinh viên: <span style=\"color: red\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st_login_successful.getStatus().getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span> </h4>\n");
        out.write("        \n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\r\n");
        out.write("                        ");
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

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giaoDien == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Move Class</title>\n");
        out.write("        <style>\n");
        out.write("            *{\n");
        out.write("                font-family: \"Verdana\",sans-serif;\n");
        out.write("            }\n");
        out.write("            body{\n");
        out.write("                margin: auto;\n");
        out.write("                align-items: center;\n");
        out.write("                justify-content: center;\n");
        out.write("            }\n");
        out.write("\n");
        out.write("            table{\n");
        out.write("                font-size: 18px;\n");
        out.write("                border: 0.1px solid #917881;\n");
        out.write("                margin-bottom: 10px;\n");
        out.write("                border-radius: 10px;\n");
        out.write("                justify-content: space-between;\n");
        out.write("                border-spacing: 20px;\n");
        out.write("                padding: 1rem;\n");
        out.write("            }\n");
        out.write("            .move{\n");
        out.write("                width: 100%;\n");
        out.write("                max-width: 55rem;\n");
        out.write("                background-color: #fff;\n");
        out.write("                border-radius: 10px;\n");
        out.write("                padding: 2rem 1rem;\n");
        out.write("                margin: auto;\n");
        out.write("            }\n");
        out.write("\n");
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
        out.write("\n");
        out.write("            <div class=\"title\">\n");
        out.write("                <h1> Move Class </h1>\n");
        out.write("            </div>\n");
        out.write("\n");
        out.write("            <div class=\"table\">\n");
        out.write("                <table>\n");
        out.write("                    <tr>\n");
        out.write("                        <td>\n");
        out.write("                            Campus:\n");
        out.write("                        </td>\n");
        out.write("                        <td>\n");
        out.write("                            <select style=\"border-radius: 10px; padding: 5px\">\n");
        out.write("                                ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </select>\n");
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
        out.write("                </table>                \n");
        out.write("            </div>\n");
        out.write("                <div class=\"textA\" style=\"text-align: center\">\n");
        out.write("                <input style=\"margin-left: 350px;background-color: beige;border-radius: 10px; padding: 5px\" type=\"submit\" name=\"OK\" value=\"Send\"> \n");
        out.write("                <input style=\"background-color:gainsboro;border-radius: 10px; padding: 5px \" type=\"reset\" name=\"cancel\" value=\"Cancel\">  \n");
        out.write("            </div>               \n");
        out.write("        </div>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_forEach_0.setVar("t");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCampus}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(">FU-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    </option>\n");
          out.write("                                ");
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

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${campusin_signup == t.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        selected\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giaoDien == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Move Class With Other Student</title>\n");
        out.write("       <style>\n");
        out.write("            *{\n");
        out.write("                font-family: \"Verdana\",sans-serif;\n");
        out.write("            }\n");
        out.write("            body{\n");
        out.write("               margin: auto;\n");
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
        out.write("            }\n");
        out.write("            .move{\n");
        out.write("                width: 100%;\n");
        out.write("                max-width: 80%;\n");
        out.write("                background-color: #fff;\n");
        out.write("                border-radius: 10px;\n");
        out.write("                padding: 2rem 1rem;\n");
        out.write("                margin: auto;\n");
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
        out.write("                <h1> Move Class With Other Student </h1>\n");
        out.write("            </div>\n");
        out.write("            <div class=\"table\">\n");
        out.write("\n");
        out.write("                <table>\n");
        out.write("                    <tr>\n");
        out.write("                        <td>\n");
        out.write("                            Campus:\n");
        out.write("                        </td>\n");
        out.write("                        <td>\n");
        out.write("                            <select style=\"border-radius: 10px; padding: 5px\">\n");
        out.write("                                ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </select>\n");
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
        out.write("                            Student A:\n");
        out.write("                        </td>\n");
        out.write("                        <td>\n");
        out.write("                            <input style=\"border-radius: 10px; padding: 5px\" type=\"text\" name=\"nameA\">\n");
        out.write("                        </td>\n");
        out.write("                        <td>\n");
        out.write("                            Exchange With Student B:\n");
        out.write("                        </td>\n");
        out.write("                        <td>\n");
        out.write("                            <input style=\"border-radius: 10px; padding: 5px\" type=\"text\" name=\"nameB\">\n");
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
        out.write("                    <input style=\"margin-left: 400px;background-color: beige;border-radius: 10px; padding: 5px\" type=\"submit\" name=\"OK\" value=\"Send\"> \n");
        out.write("                    <input style=\"background-color:gainsboro;border-radius: 10px; padding: 5px \" type=\"reset\" name=\"cancel\" value=\"Cancel\">  \n");
        out.write("                </div>\n");
        out.write("        </div>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_c_forEach_1.setVar("t");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCampus}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write(">FU-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    </option>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${campusin_signup == t.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        selected\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giaoDien == 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \r\n");
        out.write("                            ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Register Extra Courses</title>\n");
        out.write("        <style>\n");
        out.write("            *{\n");
        out.write("                font-family: \"Verdana\",sans-serif;\n");
        out.write("            }\n");
        out.write("            body{\n");
        out.write("               margin: auto;\n");
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
        out.write("            }\n");
        out.write("            .regis{\n");
        out.write("                width: 100%;\n");
        out.write("                max-width: 80%;\n");
        out.write("                background-color: #fff;\n");
        out.write("                border-radius: 10px;\n");
        out.write("                padding: 2rem 1rem;\n");
        out.write("                  margin: auto;\n");
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
        out.write("        <div class=\"regis\">\n");
        out.write("            <div class=\"title\">\n");
        out.write("\n");
        out.write("                <h1> Register Extra Courses </h1>\n");
        out.write("            </div>\n");
        out.write("            <div class=\"table\">\n");
        out.write("\n");
        out.write("                <table>\n");
        out.write("                    <div class=\"input\">\n");
        out.write("                        \n");
        out.write("                        <tr>\n");
        out.write("                            <td>\n");
        out.write("                                Campus:\n");
        out.write("                            </td>\n");
        out.write("                            <td>\n");
        out.write("                                <select style=\"border-radius: 10px; padding: 5px\">\n");
        out.write("                                    ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                </select>\n");
        out.write("                            </td>\n");
        out.write("                        </tr>\n");
        out.write("                        <tr>\n");
        out.write("                            <td>\n");
        out.write("                                Subject Code:\n");
        out.write("                            </td>\n");
        out.write("                            <td>\n");
        out.write("                                <input style=\"border-radius: 10px; padding: 5px\" type=\"text\" name=\"subject\">  \n");
        out.write("                            </td>\n");
        out.write("                        </tr>\n");
        out.write("                        <tr>\n");
        out.write("                            <td>\n");
        out.write("                                Class:\n");
        out.write("                            </td>\n");
        out.write("                            <td>\n");
        out.write("                                <input style=\"border-radius: 10px; padding: 5px\" type=\"text\" name=\"class\">\n");
        out.write("                            </td>\n");
        out.write("                        </tr>\n");
        out.write("                        <tr>\n");
        out.write("                            <td>\n");
        out.write("                                Thời gian học:\n");
        out.write("                            </td>\n");
        out.write("                            <td>\n");
        out.write("                                <input style=\"border-radius: 10px; padding: 5px\" type=\"date\" name=\"time\">\n");
        out.write("                            </td>\n");
        out.write("                        </tr>\n");
        out.write("                        \n");
        out.write("                    </div>\n");
        out.write("                </table>\n");
        out.write("            </div>\n");
        out.write("            <div>\n");
        out.write("                    <input style=\"margin-left: 230px;background-color: beige;border-radius: 10px; padding: 5px\" type=\"submit\" name=\"OK\" value=\"Send\"> \n");
        out.write("                    <input style=\"background-color:gainsboro;border-radius: 10px; padding: 5px \" type=\"reset\" name=\"cancel\" value=\"Cancel\">  \n");
        out.write("                </div>\n");
        out.write("        </div>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_c_forEach_2.setVar("t");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCampus}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write(">FU-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    </option>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${campusin_signup == t.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        selected\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giaoDien == 5}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \r\n");
        out.write("                            ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Register To Improve Mark</title>\n");
        out.write("        <style>\n");
        out.write("             *{\n");
        out.write("                font-family: \"Verdana\",sans-serif;\n");
        out.write("            }\n");
        out.write("            body{\n");
        out.write("                margin: auto;\n");
        out.write("                align-items: center;\n");
        out.write("                justify-content: center;\n");
        out.write("            }\n");
        out.write("\n");
        out.write("            table{\n");
        out.write("                font-size: 18px;\n");
        out.write("                border: 0.1px solid #917881;\n");
        out.write("                margin-bottom: 10px;\n");
        out.write("                border-radius: 10px;\n");
        out.write("                justify-content: space-between;\n");
        out.write("                border-spacing: 20px;\n");
        out.write("                padding: 1rem;\n");
        out.write("            }\n");
        out.write("            .regis{\n");
        out.write("                width: 100%;\n");
        out.write("                max-width: 80%;\n");
        out.write("                background-color: #fff;\n");
        out.write("                border-radius: 10px;\n");
        out.write("                padding: 2rem 1rem;\n");
        out.write("                  margin: auto;\n");
        out.write("            }\n");
        out.write("            .title{\n");
        out.write("                text-align: center;\n");
        out.write("            }\n");
        out.write("            .table{\n");
        out.write("                display: flex;\n");
        out.write("                align-items: center;\n");
        out.write("                justify-content: center;\n");
        out.write("            }\n");
        out.write("         \n");
        out.write("        </style>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <div class=\"regis\">\n");
        out.write("            <div class=\"title\">\n");
        out.write("\n");
        out.write("                <h1> Register To Improve Mark </h1>\n");
        out.write("            </div>\n");
        out.write("            <div class=\"table\">\n");
        out.write("\n");
        out.write("                <table>\n");
        out.write("                    <div class=\"input\">\n");
        out.write("                        \n");
        out.write("                        <tr>\n");
        out.write("                            <td>\n");
        out.write("                                Campus:\n");
        out.write("                            </td>\n");
        out.write("                            <td>\n");
        out.write("                                <select style=\"border-radius: 10px; padding: 5px\">\n");
        out.write("                                    ");
        if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                </select>\n");
        out.write("                            </td>\n");
        out.write("                        </tr>\n");
        out.write("                        <tr>\n");
        out.write("                            <td>\n");
        out.write("                                Subject Code:\n");
        out.write("                            </td>\n");
        out.write("                            <td>\n");
        out.write("                                <input style=\"border-radius: 10px; padding: 5px\" type=\"text\" name=\"subject\">  \n");
        out.write("                            </td>\n");
        out.write("                        </tr>\n");
        out.write("                        <tr>\n");
        out.write("                            <td>\n");
        out.write("                                Class:\n");
        out.write("                            </td>\n");
        out.write("                            <td>\n");
        out.write("                                <input style=\"border-radius: 10px; padding: 5px\" type=\"text\" name=\"class\">\n");
        out.write("                            </td>\n");
        out.write("                        </tr>\n");
        out.write("                        <tr>\n");
        out.write("                            <td>\n");
        out.write("                                Thời gian học:\n");
        out.write("                            </td>\n");
        out.write("                            <td>\n");
        out.write("                                <input style=\"border-radius: 10px; padding: 5px\" type=\"date\" name=\"time\">\n");
        out.write("                            </td>\n");
        out.write("                        </tr>\n");
        out.write("                        \n");
        out.write("                    </div>\n");
        out.write("                </table>\n");
        out.write("            </div>\n");
        out.write("            <div>\n");
        out.write("                    <input style=\"margin-left: 230px;background-color: beige;border-radius: 10px; padding: 5px\" type=\"submit\" name=\"OK\" value=\"Send\"> \n");
        out.write("                    <input style=\"background-color:gainsboro;border-radius: 10px; padding: 5px \" type=\"reset\" name=\"cancel\" value=\"Cancel\">  \n");
        out.write("                </div>\n");
        out.write("        </div>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_4);
    _jspx_th_c_forEach_3.setVar("t");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCampus}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write(">FU-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    </option>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${campusin_signup == t.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        selected\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_c_when_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_5.setPageContext(_jspx_page_context);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giaoDien == 6}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \r\n");
        out.write("                            ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Send an application</title>\n");
        out.write("        <style>\n");
        out.write("            *{\n");
        out.write("                font-family: \"Verdana\",sans-serif;\n");
        out.write("            }\n");
        out.write("            body{\n");
        out.write("                margin: auto;\n");
        out.write("                align-items: center;\n");
        out.write("                justify-content: center;\n");
        out.write("            }\n");
        out.write("\n");
        out.write("            table{\n");
        out.write("                font-size: 18px;\n");
        out.write("                border: 0.1px solid #917881;\n");
        out.write("                margin-bottom: 10px;\n");
        out.write("                border-radius: 10px;\n");
        out.write("                justify-content: space-between;\n");
        out.write("                border-spacing: 20px;\n");
        out.write("                padding: 1rem;\n");
        out.write("            }\n");
        out.write("            td{\n");
        out.write("                justify-content: space-between;\n");
        out.write("            }\n");
        out.write("            .move{\n");
        out.write("                width: 100%;\n");
        out.write("                max-width: 80%;\n");
        out.write("                background-color: #fff;\n");
        out.write("                border-radius: 10px;\n");
        out.write("                padding: 2rem 1rem;\n");
        out.write("                margin: auto;\n");
        out.write("            }\n");
        out.write("            .title{\n");
        out.write("                text-align: center;\n");
        out.write("            }\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("        </style>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <form>\n");
        out.write("            <div class=\"move\">\n");
        out.write("                <div class=\"title\">\n");
        out.write("                    <h1 > Send An Application  </h1>\n");
        out.write("                </div>\n");
        out.write("                <div class=\"a\">\n");
        out.write("                    <table>\n");
        out.write("                        <tr>\n");
        out.write("                            <td>\n");
        out.write("                                Application type\n");
        out.write("                            </td>\n");
        out.write("                            <td>\n");
        out.write("                                <select style=\"background: #fff; font-size: 18px; border-color: orange; border-radius: 10px; padding: 5px\">\n");
        out.write("                                    <option>Đăng kí thi cải thiện điểm</option>\n");
        out.write("                                    <option>Chuyển đổi tín chỉ</option>\n");
        out.write("                                    <option>Đề nghị chuyển cơ sở</option>\n");
        out.write("                                    <option>Đề nghị chuyển ngành</option>\n");
        out.write("                                </select>\n");
        out.write("                            </td>\n");
        out.write("                        </tr>\n");
        out.write("                        <tr>\n");
        out.write("                            <td class=\"i\">\n");
        out.write("                                Purpose:\n");
        out.write("                            </td>\n");
        out.write("                            <td>\n");
        out.write("                                <textarea style=\"border-radius: 10px; padding: 5px\" id=\"id\" name=\"purpose\" rows=\"25\" cols=\"100\"></textarea>\n");
        out.write("                            </td>\n");
        out.write("                        </tr>\n");
        out.write("                    </table>\n");
        out.write("                </div>\n");
        out.write("                <div class=\"submit\">\n");
        out.write("                    <br><input style=\"background-color: beige; font-size: 18px; margin-left: 280px;border-radius: 10px;padding: 5px\" type=\"submit\" name=\"OK\" value=\"Send\">\n");
        out.write("\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("        </form>\n");
        out.write("\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
    return false;
  }

  private boolean _jspx_meth_c_when_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_6.setPageContext(_jspx_page_context);
    _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giaoDien == 7}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
    if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \r\n");
        out.write("                            ");
        out.write('\n');
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Forgot Password</title>\n");
        out.write("        <style>\n");
        out.write("            *{\n");
        out.write("                font-family: \"Verdana\",sans-serif;\n");
        out.write("            }\n");
        out.write("            body{\n");
        out.write("                margin: auto;\n");
        out.write("                align-items: center;\n");
        out.write("                justify-content: center;\n");
        out.write("            }\n");
        out.write("\n");
        out.write("            table{\n");
        out.write("                font-size: 18px;\n");
        out.write("                border: 0.1px solid #917881;\n");
        out.write("                margin-bottom: 10px;\n");
        out.write("                border-radius: 10px;\n");
        out.write("                justify-content: space-between;\n");
        out.write("                border-spacing: 20px;\n");
        out.write("                padding: 1rem;\n");
        out.write("            }\n");
        out.write("            .regis{\n");
        out.write("                width: 100%;\n");
        out.write("                max-width: 35rem;\n");
        out.write("                background-color: #fff;\n");
        out.write("                border-radius: 10px;\n");
        out.write("                padding: 2rem 1rem;\n");
        out.write("                margin: auto;\n");
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
        out.write("        <div class=\"regis\">\n");
        out.write("            <div class=\"title\">\n");
        out.write("\n");
        out.write("                <h1> Forgot Passwor </h1>\n");
        out.write("            </div>\n");
        out.write("            <div class=\"table\">\n");
        out.write("                <form action=\"changePasswor\" method=\"Post\">\n");
        out.write("                    <table>\n");
        out.write("                        <div class=\"input\">\n");
        out.write("                            ");
        if (_jspx_meth_c_if_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                            <tr>\n");
        out.write("                                <td>\n");
        out.write("                                    Old Password:\n");
        out.write("                                </td>\n");
        out.write("                                <td>\n");
        out.write("\n");
        out.write("                                    <input type=\"text\" name=\"oldpass\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${oldpass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" required style=\"border-radius: 10px; padding: 5px\">\n");
        out.write("                                </td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td>\n");
        out.write("                                    New Password:\n");
        out.write("                                </td>\n");
        out.write("                                <td>\n");
        out.write("                                    <input type=\"text\" name=\"newpass\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newpass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" required style=\"border-radius: 10px; padding: 5px\"> \n");
        out.write("                                </td>\n");
        out.write("                            </tr>\n");
        out.write("                            ");
        if (_jspx_meth_c_if_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            <tr>\n");
        out.write("                                <td>\n");
        out.write("                                    Confirm Password:\n");
        out.write("                                </td>\n");
        out.write("                                <td>\n");
        out.write("                                    <input style=\"border-radius: 10px; padding: 5px\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${confirm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" required type=\"text\" name=\"confirm\">\n");
        out.write("                                </td>\n");
        out.write("                            </tr>\n");
        out.write("                            ");
        if (_jspx_meth_c_if_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        </div>\n");
        out.write("                    </table>\n");
        out.write("            </div>\n");
        out.write("            <div>\n");
        out.write("                <input style=\"margin-left: 230px;background-color: beige;border-radius: 10px; padding: 5px\" type=\"submit\" name=\"OK\" value=\"Change\"> \n");
        out.write("                </form>\n");
        out.write("            </div>\n");
        out.write("        </div>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
    return false;
  }

  private boolean _jspx_meth_c_if_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_6);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${oldPass_mess != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <tr>\n");
        out.write("                                    <td></td>\n");
        out.write("                                    <td><span style=\"color: red\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${oldPass_mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span></td>\n");
        out.write("                                </tr>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }

  private boolean _jspx_meth_c_if_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_13.setPageContext(_jspx_page_context);
    _jspx_th_c_if_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_6);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.confirm_mess != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
    if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <tr>\n");
        out.write("                                    <td></td>\n");
        out.write("                                    <td><span style=\"color: red\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.confirm_mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span></td>\n");
        out.write("                                </tr>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
    return false;
  }

  private boolean _jspx_meth_c_if_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_14.setPageContext(_jspx_page_context);
    _jspx_th_c_if_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_6);
    _jspx_th_c_if_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${change_pass_succ != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
    if (_jspx_eval_c_if_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <tr>\n");
        out.write("                                    <td></td>\n");
        out.write("                                    <td><span style=\"color: blue\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${change_pass_succ}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span></td>\n");
        out.write("                                </tr>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
    return false;
  }
}
