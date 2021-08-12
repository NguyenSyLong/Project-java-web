package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lon_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav id=\"navbar_top\" class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Quầy thuốc Tuấn Anh</a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#main_nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"main_nav\">\t\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"> Đăng nhập </a></li>\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"> Giỏ hàng </a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div> <!-- navbar-collapse.// -->\n");
      out.write("                    <form >\n");
      out.write("                        <input  type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                        <button type=\"submit\">Search</button>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div> <!-- container.// -->\n");
      out.write("            </nav>\n");
      out.write("            <nav id=\"navbar_top\" class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Brand</a>\n");
      out.write("                    <button class=\"navbar-toggler collapsed\" type=\"button\" data-toggle=\"collapse\" data-target=\"#main_nav\" aria-expanded=\"false\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"navbar-collapse collapse\" id=\"main_nav\" style=\"\">\n");
      out.write("                        <ul class=\"navbar-nav\">\n");
      out.write("                            <li class=\"nav-item active\"> <a class=\"nav-link\" href=\"#\">Home </a> </li>\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"> About </a></li>\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"> Services </a></li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link  dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\" aria-expanded=\"false\">  More items  </a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"#\"> Submenu item 1</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"#\"> Submenu item 2 </a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"#\"> Submenu item 3 </a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"> Menu item </a></li>\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"> Menu item </a></li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link  dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\" aria-expanded=\"false\"> Dropdown right </a>\n");
      out.write("                                <ul class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"#\"> Submenu item 1</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"#\"> Submenu item 2 </a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div> <!-- navbar-collapse.// -->\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("        </header>\n");
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
