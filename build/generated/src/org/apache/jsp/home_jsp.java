package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"nav_files/css3menu1/style.css\" type=\"text/css\" /><style type=\"text/css\">._css3m{display:none}</style>\n");
      out.write("\n");
      out.write("        <title>AU-Paper</title>\n");
      out.write("        <head>\n");
      out.write("<style>\n");
      out.write("div.container {\n");
      out.write("    width: 100%;\n");
      out.write("    border: 1px solid gray;\n");
      out.write("}\n");
      out.write("\n");
      out.write("header, footer {\n");
      out.write("    padding: 1em;\n");
      out.write("    color: white;\n");
      out.write("    background-color: black;\n");
      out.write("    clear: left;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav {\n");
      out.write("    float: left;\n");
      out.write("    max-width: 160px;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 1em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("   \n");
      out.write("nav ul a {\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("article {\n");
      out.write("    margin-left: 170px;\n");
      out.write("    border-left: 1px solid gray;\n");
      out.write("    padding: 1em;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>E-Paper</header>\n");
      out.write("        <nav>\n");
      out.write("            <ul id=\"css3menu1\" class=\"topmenu\">\n");
      out.write("        \n");
      out.write("        <li class=\"topfirst\"><a href=\"alogin.jsp\" style=\"width:115px;\">Admin Login</a></li>\n");
      out.write("\t<li class=\"topfirst\"><a href=\"wh.jsp\" style=\"width:115px;\">What's Happening</a></li>\n");
      out.write("\t<li class=\"topmenu\"><a href=\"dept.jsp\" style=\"width:115px;\">Department Info</a></li>\n");
      out.write("\t<li class=\"topmenu\"><a href=\"acad.jsp\" style=\"width:115px;\">Academics</a></li>\n");
      out.write("\t<li class=\"topmenu\"><a href=\"gallery.jsp\" style=\"width:115px;\">Gallery</a></li>\n");
      out.write("\t<li class=\"toplast\"><a href=\"comp.jsp\" style=\"width:115px;\">Complaints</a></li>\n");
      out.write("        </ul>\n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("        <article>\n");
      out.write("            asx%%\n");
      out.write("        </article>\n");
      out.write("        <footer><a herf=\"about.jsp\">About AU</a></footer>\n");
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
