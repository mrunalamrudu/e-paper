package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pp_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html> \n");
      out.write("<head> \n");
      out.write("<script type=\"\"text/javascript\"\"> \n");
      out.write("</script> \n");
      out.write("<title>Attach</title> \n");
      out.write("</head> \n");
      out.write("<body> \n");
      out.write("<br><br><br> \n");
      out.write("<center> \n");
      out.write("<form name=\"\"attach\"\" action=\"\"./upload_attach.jsp\"\" method=\"\"post\"\" \n");
      out.write("ENCTYPE=\"\"multipart/form-data\"\"> \n");
      out.write("<p><b>Upload No:</b><input type=\"\"text\"\" name=num size=30> </p> \n");
      out.write("<p><input type=\"\"file\"\" name=attach size=30> </p> \n");
      out.write("<br><br> \n");
      out.write("<input type=\"\"submit\"\" name=\"\"upl\"\" value=\"\"UPLOAD\"\"> \n");
      out.write("</form> \n");
      out.write("</center> \n");
      out.write("</body> \n");
      out.write("</html> \n");
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
