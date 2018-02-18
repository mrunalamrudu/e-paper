package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head> \n");
      out.write("<title>About AU</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center><img src=\"bg.png\" align=\"center\" height=\"100\" width=\"100\"></center>\n");
      out.write("<P style=\"text-align:center; \"><font color=\"#0099ff\"  style=\"font-family: Arial Black;\"\">What it Signifies?</font><br><br>\n");
      out.write("    The Rising Sun with its rays of light represents the University and its many faculties of study.  The Lotus is the seat of both the Goddess of Prosperity (Lakshmi) and the Goddess of Knowledge (Saraswathi) and it is opening at the break of dawn.   The sun's rays are surmounted by the Swastika, the ancient symbol of benediction among the Aryans.  The outer circle of the crest, with its sixty-four lotus petals, represents the AU Emblemsixty-four Arts & Sciences into which all knowledge was divided in the classical tradition of India.  The ocean is the vast region of knowledge which the University should help its alumni to master.<br>\n");
      out.write("    <br> The light rays holding the benedictory Swastika bring into focus our great motto extracted from Upanishads, \" Thejasvina-Vadhitamastu \", which means, \" May the Divine Light Illuminate Our Studies \".  Underneath this complex symbolism of knowledge is the crescent Moon, esteemed in all religions; the crescent is 'Kala' a digit of Moon, and 'Kala' also means Art of Applied Science or light and charm.  Since the University bears the name of Andhra Viswa Kala Parishad, a corporation for the development of all Arts in Andhra; the crescent above the name be-speaks the light and charm and beauty of Andhra.<br><br>The two Serpents or represent the seekers and custodians of wisdom, who imbibe it from the lotus petals.  Tradition also traces back the Andhras to the ancient Nagas, who were worshippers of the Cobra and had it as their heraldic symbol.\n");
      out.write("</p>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("<p style=\"text-align:center\">Andhra University was constituted by the Madras Act of 1926. The 82-year-old institution is fortunate to have Sir C.R. Reddy as its founder Vice-Chancellor, as the steps taken by this visionary proved to be fruitful in the long run.\n");
      out.write("<br><br><br>\n");
      out.write("Andhra University is not just one of the oldest educational institutions in the country, but is also the first to be conceived as a residential and teaching-cum-affiliating University, mainly devoted to post-graduate teaching and research.\n");
      out.write("\n");
      out.write("The people of the State have an emotional attachment to the institution, since it came into being after a prolonged and collective struggle of the Telugu elite for a University in the educationally backward districts.\n");
      out.write("<br><br>\n");
      out.write("The University is spread in a sprawling campus of 422 acres dotted with 121 buildings of Academic, Administrative and support services with a plinth area of about 20 lakhs sq.ft., and 324 staff quarters. Presently the University catering the Educational needs of five green districts of Andhra Pradesh namely Visakhapatnam, East Godavari, West Godavari, Vizinagaram and Srikakulam.\n");
      out.write("</body>\n");
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
