package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class acad_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"><html>\n");
      out.write("    <head>\n");
      out.write("        <META http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div style=\"background-color:#ebebeb\">\n");
      out.write("    <h1><center>Academics</center></h1>\n");
      out.write("<ul>\n");
      out.write("\t<li><a href=\"#0.1_\" style=\"height:15px;line-height:15px\"><span>Schedules</span></a>\n");
      out.write("\t</li>\n");
      out.write("\t<li><a href=\"https://aucoe.info/RDA/resultsnew/\" style=\"height:15px;line-height:15px\" target=\"_blank\">Results</a></li>\n");
      out.write("\t<li><a href=\"#0.1_\" style=\"height:15px;line-height:15px\"><span>Previous Question Papers</span></a>\n");
      out.write("\t</li>\n");
      out.write("\t<li><a href=\"home.jsp\" style=\"height:15px;line-height:15px\">Home</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body></html>");
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
