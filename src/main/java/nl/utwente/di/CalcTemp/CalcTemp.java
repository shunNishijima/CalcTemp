package nl.utwente.di.CalcTemp;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

/** Example of a Servlet that gets an ISBN number and returns the book price
 */

public class CalcTemp extends HttpServlet {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Calculator calculator;
	
    public void init() throws ServletException {
    	calculator = new Calculator();
    }	
	
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String title = "Temperature Calculation";
    
    // Done with string concatenation only for the demo
    // Not expected to be done like this in the project
    out.println("<!DOCTYPE HTML>\n" +
                "<HTML>\n" +
                "<HEAD><TITLE>" + title + "</TITLE>" +
                "<LINK REL=STYLESHEET HREF=\"styles.css\">" +
                		"</HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1>" + title + "</H1>\n" +              
                "  <P>Celsius: " +
                   request.getParameter("celsius") + "\n" +
                "  <P>Fahrenheit: " +
                   calculator.getResult(request.getParameter("celsius")) +
                "</BODY></HTML>");
  }
}
