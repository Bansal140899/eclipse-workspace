package com.ajay.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class WelcomeServlet
 */
//@WebServlet("/Welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		   pw.println("<!DOCTYPE html>");
	        pw.println("<html>");
	        pw.println("<head>");
	        pw.println("<meta charset='utf-8'/>");
	        pw.println("<title>Hover Size Increase Animation</title>");
	        pw.println("<style>");
	        // Body + background
	        pw.println("  *{box-sizing:border-box;} ");
	        pw.println("  body {");
	        pw.println("    margin:0; height:100vh; display:flex; align-items:center; justify-content:center;");
	        pw.println("    font-family: 'Segoe UI', Tahoma, sans-serif;");
	        pw.println("    background: linear-gradient(135deg, #ff9a9e 0%, #fbc2eb 50%, #a1c4fd 100%);");
	        pw.println("    background-size: 400% 400%; animation: bgMove 12s ease infinite;");
	        pw.println("    overflow:hidden;");
	        pw.println("  }");
	        pw.println("  @keyframes bgMove { 0%{background-position:0% 50%} 50%{background-position:100% 50%} 100%{background-position:0% 50%} }");

	        // Main layout
	        pw.println("  .stage { width:90%; max-width:1100px; display:grid; grid-template-columns: 1fr 360px; gap:30px; align-items:center; }");

	        // Left: animated text + animals
	        pw.println("  .left { position:relative; padding:40px; }");
	        pw.println("  .title { font-size:48px; font-weight:800; color:#fff; text-shadow:0 6px 20px rgba(0,0,0,0.25); margin:0 0 20px; }");
	        pw.println("  .subtitle { font-size:18px; color: rgba(255,255,255,0.9); margin:0 0 30px; }");

	        // Hoverable card (this is the div that increases size on hover)
	        pw.println("  .hover-card {");
	        pw.println("    background: linear-gradient(180deg, rgba(255,255,255,0.15), rgba(255,255,255,0.08));");
	        pw.println("    border-radius:18px; padding:24px; color:#fff; backdrop-filter: blur(6px);");
	        pw.println("    box-shadow: 0 10px 30px rgba(0,0,0,0.12); transition: transform 300ms cubic-bezier(.2,.9,.2,1), box-shadow 300ms, filter 300ms;");
	        pw.println("    transform-origin: center center; cursor:pointer;");
	        pw.println("  }");
	        pw.println("  /* The actual hover scale effect */");
	        pw.println("  .hover-card:hover {");
	        pw.println("    transform: translateY(-6px) scale(1.12); /* size increase + slight lift */");
	        pw.println("    box-shadow: 0 25px 50px rgba(0,0,0,0.28);");
	        pw.println("    filter: saturate(1.12);");
	        pw.println("  }");
	        pw.println("  /* optional inner content transition */");
	        pw.println("  .hover-card h3 { margin:0 0 8px; transition: transform 300ms; }");
	        pw.println("  .hover-card p { margin:0; opacity:0.95; transition: transform 300ms; }");

	        // small "pulse" on hover for emphasis (keyframes)
	        pw.println("  .hover-card:active { transform: translateY(-2px) scale(1.08); }");

	        // right column with multiple cards to demo
	        pw.println("  .right { display:flex; flex-direction:column; gap:18px; }");
	        pw.println("  .mini { padding:16px; border-radius:14px; background: rgba(255,255,255,0.06); color:#fff; box-shadow:0 8px 20px rgba(0,0,0,0.12); transition: transform 280ms, box-shadow 280ms; }");
	        pw.println("  .mini:hover { transform: scale(1.06); box-shadow: 0 18px 40px rgba(0,0,0,0.22); }");

	        // flying animals (decorative)
	        pw.println("  .animal { position:absolute; font-size:36px; animation: flyLinear 9s linear infinite; opacity:0.95; }");
	        pw.println("  .animal.a1 { left:5%; top:15%; animation-delay:0s; }");
	        pw.println("  .animal.a2 { left:15%; top:60%; animation-delay:2s; transform:scale(0.9); }");
	        pw.println("  .animal.a3 { left:60%; top:10%; animation-delay:4s; transform:scale(1.1); }");
	        pw.println("  @keyframes flyLinear { 0%{transform:translateX(-120px) translateY(0)} 50%{transform:translateX(120vw) translateY(-160px)} 100%{transform:translateX(-120px) translateY(0)} }");

	        // responsive tweaks
	        pw.println("  @media (max-width:880px){ .stage{ grid-template-columns:1fr; } .right{ order:2 } .left{ order:1 } .title{ font-size:36px } }");

	        pw.println("</style>");
	        pw.println("</head>");
	        pw.println("<body>");
	        pw.println("<div class='stage'>");

	        // LEFT: big content with a hover-card example
	        pw.println("  <div class='left'>");
	        pw.println("    <div class='animal a1'>🦋</div>");
	        pw.println("    <div class='animal a2'>🐦</div>");
	        pw.println("    <div class='animal a3'>🐝</div>");
	        pw.println("    <h1 class='title'>Welcome — Try Hovering the Card</h1>");
	        pw.println("    <p class='subtitle'>Hover over the card to see smooth size increase, lift and shadow — good for call-to-action, product cards, buttons.</p>");

	        // The div that increases size on hover
	        pw.println("    <div class='hover-card' onclick='cardClicked()'>");
	        pw.println("      <h3>Get Started</h3>");
	        pw.println("      <p>Click or hover me — I pop up and grow to attract attention.</p>");
	        pw.println("    </div>");
	        pw.println("  </div>");

	        // RIGHT: small demo cards
	        pw.println("  <div class='right'>");
	        pw.println("    <div class='mini'>Quick tips: Use transform: scale() for smooth size changes.</div>");
	         pw.println("    <div class='mini'>Add transition for easing and duration control.</div>");
	        pw.println("    <div class='mini'>Combine with box-shadow & translateY for a nicer pop.</div>");
	        pw.println("  </div>");

	        pw.println("</div>"); // stage

	        // small JS (optional)
	        pw.println("<script>");
	        pw.println("  function cardClicked(){");
	        pw.println("    alert('Nice! You clicked the hover-card.');");
	        pw.println("  }");
	        pw.println("</script>");

	        pw.println("</body>");
	        pw.println("</html>");
		
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
