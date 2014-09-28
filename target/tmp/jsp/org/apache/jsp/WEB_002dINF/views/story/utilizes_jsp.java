package org.apache.jsp.WEB_002dINF.views.story;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class utilizes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>工具类演示</title>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t$(\"#utilizes-tab\").addClass(\"active\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>工具类演示</h1>\r\n");
      out.write("\t<h2>XML/JSON操作演示</h2>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>基于JAXB2.0的Java-XML绑定, 演示根元素是List, 属性是List与Map等特殊情况.</li>\r\n");
      out.write("\t\t<li>万能老倌Dom4j.</li>\r\n");
      out.write("\t\t<li>性能最快功能也最丰富的JSON转换类库Jackson.</li>\r\n");
      out.write("\t\t<li>在JaxbDemo.java中演示XML与Java对象的转换及Dom4j的使用.</li>\r\n");
      out.write("\t\t<li>在JsonDemo.java中演示Jackson远超同类JSON库的转化能力.</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t\r\n");
      out.write("\t<hr/>\r\n");
      out.write("\t\r\n");
      out.write("\t<h2>Email演示</h2>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>简单文本邮件演示.</li>\r\n");
      out.write("\t\t<li>带附件的MIME邮件演示, 使用Freemarker模板创建HTML内容.</li>\r\n");
      out.write("\t\t<li>在综合演示用例中保存用户时，发送两种邮件.<br /> 演示邮箱名为springside3.demo@gmail.com, 密码为demoforyou.</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t\r\n");
      out.write("\t<hr/>\r\n");
      out.write("\t\r\n");
      out.write("\t<h2>日志演示</h2>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>Log4JManager: 通过JMX动态查询与改变Logger的日志等级与Appender, 详见JMX页面.</li>\r\n");
      out.write("\t\t<li>Log4MockjAppender: 在测试用例中验证日志的输出, 在Schedule测试用例使用MockAppender校验日志输出.</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t\r\n");
      out.write("\t<hr/>\r\n");
      out.write("\t\r\n");
      out.write("\t<h2>其他常用工具</h2>\r\n");
      out.write("\t<p>全部演示在org.springside.examples.showcase.utilities目录</p>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>JodaTime: 日期操作.</li>\r\n");
      out.write("\t\t<li>Dozer: 不同类型的对象互相复制与转换。</li>\r\n");
      out.write("\t\t<li>Apache Commons IO: IO操作。</li>\r\n");
      out.write("\t\t<li>Apache Commons Lang Validate: 防御式编程，校验输入参数.</li>\r\n");
      out.write("\t\t<li>Apache Commons Lang StringUtils: 字符串操作.</li>\r\n");
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
