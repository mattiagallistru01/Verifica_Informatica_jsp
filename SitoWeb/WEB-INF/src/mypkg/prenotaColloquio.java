// To save as "<CATALINA_HOME>\webapps\helloservlet\WEB-INF\src\mypkg\HelloServlet.java"
package mypkg;
 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
 
public class prenotaColloquio extends HttpServlet {
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      // Set the response message's MIME type
      response.setContentType("text/html;charset=UTF-8");
      // Allocate a output writer to write the response message into the network socket
      PrintWriter out = response.getWriter();
      
 
      // Write the response message, in an HTML page
      try {
         out.println("<!DOCTYPE html>");
         out.println("<html><head>");
         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
         out.println("<title>PrenotaColloquio</title></head>");
         out.println("<body>");
         String LastName = request.getParameter("LastName");
         if (LastName == ""){
            out.println("<p>Warning! Insert your last name</p>");
         } else {
            out.println("<p>Welcome " + LastName + "</p>");
         }
         
         out.println("<h1></h1>");  // says Hello
         // Echo client's request information
         out.println("<p>Request URI: " + request.getRequestURI() + "</p>");
         out.println("<p>Protocol: " + request.getProtocol() + "</p>");
         out.println("<p>PathInfo: " + request.getPathInfo() + "</p>");
         out.println("<p>Remote Address: " + request.getRemoteAddr() + "</p>");
         // Generate a random number upon each request
         out.println("<p>A Random Number: <strong>" + Math.random() + "</strong></p>");
         out.println("</body>");
         out.println("</html>");
      } finally {
         out.close();  // Always close the output writer
      }
   }
}