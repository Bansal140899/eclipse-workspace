import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class WelcomeServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		 pw.println("<!DOCTYPE html>");
	        pw.println("<html>");
	        pw.println("<head>");
	        pw.println("<title>Colorful Animation with Animals</title>");
	        pw.println("<style>");
	        pw.println("body {");
	        pw.println("  display: flex;");
	        pw.println("  justify-content: center;");
	        pw.println("  align-items: center;");
	        pw.println("  height: 100vh;");
	        pw.println("  margin: 0;");
	        pw.println("  background: linear-gradient(135deg, #ff9a9e, #fad0c4, #fbc2eb, #a1c4fd);");
	        pw.println("  background-size: 400% 400%;");
	        pw.println("  animation: gradientBG 10s ease infinite;");
	        pw.println("  font-family: 'Segoe UI', sans-serif;");
	        pw.println("  overflow: hidden;");
	        pw.println("}");
	        pw.println("@keyframes gradientBG {");
	        pw.println("  0% {background-position: 0% 50%;}");
	        pw.println("  50% {background-position: 100% 50%;}");
	        pw.println("  100% {background-position: 0% 50%;}");
	        pw.println("}");
	        pw.println(".animation-container {");
	        pw.println("  font-size: 50px;");
	        pw.println("  font-weight: bold;");
	        pw.println("  color: white;");
	        pw.println("  text-shadow: 2px 2px 10px rgba(0,0,0,0.4);");
	        pw.println("  overflow: hidden;");
	        pw.println("  height: 60px;");
	        pw.println("  position: relative;");
	        pw.println("  z-index: 2;");
	        pw.println("}");
	        pw.println(".word {");
	        pw.println("  position: absolute;");
	        pw.println("  width: 100%;");
	        pw.println("  text-align: center;");
	        pw.println("  transform: translateY(100%);");
	        pw.println("  opacity: 0;");
	        pw.println("  animation: slideUp 3s ease-in-out infinite;");
	        pw.println("}");
	        pw.println("@keyframes slideUp {");
	        pw.println("  0% {transform: translateY(100%); opacity: 0;}");
	        pw.println("  20% {transform: translateY(0); opacity: 1;}");
	        pw.println("  80% {transform: translateY(0); opacity: 1;}");
	        pw.println("  100% {transform: translateY(-100%); opacity: 0;}");
	        pw.println("}");
	        pw.println(".animal {");
	        pw.println("  position: absolute;");
	        pw.println("  font-size: 40px;");
	        pw.println("  animation: fly 8s linear infinite;");
	        pw.println("  z-index: 1;");
	        pw.println("}");
	        pw.println("@keyframes fly {");
	        pw.println("  0% {transform: translateX(-100px) translateY(0);}");
	        pw.println("  50% {transform: translateX(100vw) translateY(-200px);}");
	        pw.println("  100% {transform: translateX(-100px) translateY(0);}");
	        pw.println("}");
	        pw.println("</style>");
	        pw.println("</head>");
	        pw.println("<body>");
	        pw.println("<div class='animation-container'>");
	        pw.println("  <span class='word' style='animation-delay: 0s; color:#ff4757'>Ping</span>");
	        pw.println("  <span class='word' style='animation-delay: 3s; color:#1e90ff'>Swap</span>");
	        pw.println("  <span class='word' style='animation-delay: 6s; color:#2ed573'>Animation</span>");
	        pw.println("</div>");
	        pw.println("<div class='animal' style='left:10%; top:20%; animation-delay:0s;'>🦋</div>");
	        pw.println("<div class='animal' style='left:30%; top:50%; animation-delay:2s;'>🐦</div>");
	        pw.println("<div class='animal' style='left:60%; top:30%; animation-delay:4s;'>🐝</div>");
	        pw.println("<div class='animal' style='left:80%; top:60%; animation-delay:6s;'>🕊️</div>");
	        pw.println("</body>");
	        pw.println("</html>");
	        
	        
	        
	}

}
