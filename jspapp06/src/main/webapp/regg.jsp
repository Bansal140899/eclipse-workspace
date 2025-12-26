<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>

<style>
    body {
        background: linear-gradient(120deg, #89f7fe, #66a6ff);
        font-family: 'Poppins', sans-serif;
        color: white;
        text-align: center;
        margin: 0;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        animation: fadeIn 2s ease-in-out;
    }

    .card {
        background: rgba(0, 0, 0, 0.2);
        padding: 40px;
        border-radius: 25px;
        box-shadow: 0px 0px 25px rgba(255, 255, 255, 0.3);
        width: 400px;
        animation: bounceIn 1s ease;
    }

    h2 {
        margin-bottom: 20px;
        color: #ffe;
    }

    h3 {
        margin-bottom: 10px;
    }

    .success {
        animation: glow 2s infinite alternate;
    }

    @keyframes fadeIn {
        from { opacity: 0; }
        to { opacity: 1; }
    }

    @keyframes bounceIn {
        0% { transform: scale(0.8); opacity: 0; }
        60% { transform: scale(1.05); opacity: 1; }
        100% { transform: scale(1); }
    }

    @keyframes glow {
        from { text-shadow: 0 0 10px #fff; }
        to { text-shadow: 0 0 20px #00c6ff; }
    }

    a {
        color: #fff;
        background: #00c6ff;
        padding: 8px 16px;
        border-radius: 10px;
        text-decoration: none;
        display: inline-block;
        margin-top: 20px;
        transition: 0.3s;
    }

    a:hover {
        background: #0072ff;
        transform: scale(1.1);
    }
</style>
</head>

<body>
    <div class="card">
        <h2 class="success">🎉 Registration Successful 🎉</h2>
        <h3>Employee Number: <%= session.getAttribute("eno") %></h3>
        <h3>Employee Name: <%= session.getAttribute("ename") %></h3>
        <h3>Employee Salary: ₹<%= session.getAttribute("esal") %></h3>
        <h3>Employee Address: <%= session.getAttribute("eaddr") %></h3>

        <a href="employeeregistration.html">⬅ Go Back</a>
    </div>
    
    
   
</body>
</html>