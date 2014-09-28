package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Home</title>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t$(\"#index-tab\").addClass(\"active\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>What is it?</h1>\r\n");
      out.write("\t<p style=\"padding: 15px;\">各式主流的、实用的、好玩的开源项目大派对。</p>\r\n");
      out.write("\t\r\n");
      out.write("\t<h1>What is new?</h1>\r\n");
      out.write("\t<h2>4.2版</h2>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>性能监控新增Metrics/Graphite演示。</li>\r\n");
      out.write("\t\t<li>新增Hystrix演示。</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<h2>4.1版</h2>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>新增Redis演示。</li>\r\n");
      out.write("\t\t<li>新增性能监控演示。</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<h2>4.0版</h2>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>CSS 大装修完毕。</li>\r\n");
      out.write("\t\t<li>CXF的SOAP WebService 与 MyBais从Mini-Service搬了过来。</li>\r\n");
      out.write("\t\t<li>Shiro的授权演示搬了过来。</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
