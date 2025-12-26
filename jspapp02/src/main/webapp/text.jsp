<%@ page  import="java.util.Date"   language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>
    
    <%@page errorPage="errorHandler.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Animated JSP Example</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(120deg, #89f7fe, #66a6ff);
        text-align: center;
        color: #fff;
        height: 100vh;
        margin: 0;
        overflow: hidden;
    }

    h1 {
        margin-top: 100px;
        font-size: 50px;
        animation: bounce 2s infinite;
    }

    @keyframes bounce {
        0%, 20%, 50%, 80%, 100% {
            transform: translateY(0);
        }
        40% {
            transform: translateY(-30px);
        }
        60% {
            transform: translateY(-15px);
        }
    }

    .time-box {
        margin-top: 50px;
        font-size: 25px;
        font-weight: bold;
        background: rgba(255, 255, 255, 0.2);
        display: inline-block;
        padding: 15px 30px;
        border-radius: 15px;
        box-shadow: 0 0 10px rgba(0,0,0,0.3);
    }

    .quote {
        margin-top: 30px;
        font-style: italic;
        font-size: 20px;
    }
</style>
</head>

<body>

<%
    // ✅ Core Java Code
    Date now = new Date();
    String[] quotes = {
        "Dream big, work hard!",
        "Every expert was once a beginner.",
        "Code, Eat, Sleep, Repeat!",
        "Believe you can and you’re halfway there.",
        "Success doesn’t come to you, you go to it."
    };

    Random r = new Random();
    String quote = quotes[r.nextInt(quotes.length)];
   
%>

<h1>Hellooooooo JSP World!</h1>

<div class="time-box">
    Current Time: <%= now.toString() %>
</div>

<div class="quote">
    “<%= quote %>”
</div>

<h1>
<%= new Date().toString() %>

</h1>

<script>
    // 💫 Simple JS animation - background gradient moves slowly
    let colors = ['#89f7fe', '#66a6ff', '#f6d365', '#fda085', '#84fab0', '#8fd3f4'];
    let i = 0;
    setInterval(() => {
        document.body.style.background = `linear-gradient(120deg, ${colors[i]}, ${colors[(i+1)%colors.length]})`;
        i = (i + 1) % colors.length;
    }, 4000);
</script>

</body>
</html>
