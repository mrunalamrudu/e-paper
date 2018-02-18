package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class wh_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"><html>\n");
      out.write("    <head><META http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"></head>\n");
      out.write("    <body>\n");
      out.write("<div>\n");
      out.write("    <img src=\"wh.jpg\" width=\"=300\" height=\"100\"><h1> WHATS HAPPENING</h1>\n");
      out.write("\n");
      out.write("<h3>1.Andhra University cracks the whip on erring affiliated colleges</h3>\n");
      out.write("\n");
      out.write("<p>Directs them to clear dues; mulls the option of instalments\n");
      out.write("With the dues mounting to almost ?15 crore from the affiliated \n");
      out.write("colleges, Andhra University has taken a few tough steps to \n");
      out.write("bring the erring colleges back on the rails.</p>\n");
      out.write("\n");
      out.write("<p>Every affiliated college has to pay some amount of fees every \n");
      out.write("year for affiliation to the university and many of the colleges \n");
      out.write("have not been paying for the last five years. To get its share, \n");
      out.write("the AU has announced that such colleges will not be allowed to \n");
      out.write("conduct the examinations if the dues are not cleared.</p>\n");
      out.write("\n");
      out.write("<h3>2.School of Distance Education at AU To Be First Digital University in AP</h3>\n");
      out.write("\n");
      out.write("<p>Andhra University partnered with Tata Consultancy Services for the same\n");
      out.write("and to reach out to a large number of students. This partnership is \n");
      out.write("hoping to bring in a growth in the number of admissions in the coming \n");
      out.write("years. The School of Distance Education will use the TCS iON to offer \n");
      out.write("various services online. The services will include admissions, course \n");
      out.write("content, examination management, administrative services and more.</p>\n");
      out.write("\n");
      out.write("<h3>3.Hostel Students At Andhra University Protest Over Poor Food Quality</h3>\n");
      out.write("\n");
      out.write("<p> AU Students Hostel Food Protest. Hundreds of students of Nagarjuna \n");
      out.write("hostel staged a protest at the entrance of Andhra University yesterday \n");
      out.write("evening. They protested against the poor quality of food being provided \n");
      out.write("at the hostel mess</p>\n");
      out.write("\n");
      out.write("<h3>4.Effectiveness of Distance Education System</h3>\n");
      out.write("\n");
      out.write("<p>In essence it is based upon a longitudinal consideration of \n");
      out.write("recorded data, indicating what has been happening in the past, \n");
      out.write("what the present situation reveals, and ... of distance \n");
      out.write("education institutions namely BRAOU and School of Distance \n");
      out.write("Education of Andhra University, in terms of selected \n");
      out.write("institutional growth parameters.</p>\n");
      out.write("</div>\n");
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
