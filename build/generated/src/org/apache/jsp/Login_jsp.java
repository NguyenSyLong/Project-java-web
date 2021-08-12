package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <link href=\"css/newcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("            function myFunction() {\n");
      out.write("                {\n");
      out.write("               var user = document.getElementById(\"username\").value;\n");
      out.write("               var password = document.getElementById(\"password\").value;\n");
      out.write("               if(user.length == 0 )\n");
      out.write("               {\n");
      out.write("                   alert('Username cannot be blank!');\n");
      out.write("                   return;\n");
      out.write("               }else if( password.length == 0){\n");
      out.write("                   alert('Password cannot be blank!');\n");
      out.write("                   return;\n");
      out.write("               }\n");
      out.write("               document.getElementById(\"frmAdd\").submit();\n");
      out.write("            }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <div id=\"login\">\n");
      out.write("            <h3 class=\"text-center text-white pt-5\">Login form</h3>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                \n");
      out.write("                <div id=\"login-row\" class=\"row justify-content-center align-items-center\">\n");
      out.write("                    \n");
      out.write("                    <div id=\"login-column\" class=\"col-md-6\">\n");
      out.write("                       \n");
      out.write("                        <div id=\"login-box\" class=\"col-md-12\">\n");
      out.write("                            \n");
      out.write("                            <form id=\"login-form\" class=\"form\" action=\"login\" method=\"post\">\n");
      out.write("                                \n");
      out.write("                                <h6 class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h6> \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"username\" class=\"text-info\">Username:</label><br>\n");
      out.write("                                    <input type=\"text\" name=\"username\" id=\"username\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"password\" class=\"text-info\">Password:</label><br>\n");
      out.write("                                    <input type=\"text\" name=\"password\" id=\"password\" class=\"form-control\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"remember-me\" class=\"text-info\"><span>Remember me</span> <span><input id=\"remember-me\" name=\"remember-me\" type=\"checkbox\"></span></label><br>\n");
      out.write("                                    <input type=\"submit\" name=\"submit\" class=\"btn btn-info btn-md\" value=\"submit\" onclick=\"myFunction()\" >\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"register-link\" class=\"text-right\">\n");
      out.write("                                    <a href=\"Register.jsp\" class=\"text-info\">Register here</a>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </form>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("            </div>\n");
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
