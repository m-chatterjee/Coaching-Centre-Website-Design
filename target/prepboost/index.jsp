<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PrepBoost</title>
    <link rel="stylesheet" href="css/indexStyle.css">
    <link href="fonts/BalooBhai2-Bold.ttf" rel="stylesheet">
</head>

<body>
    <header class="header">
        <div class="logo">
            <img src="img/logo.jpg" alt="image not found">
            <div>PrepBoost</div>
        </div>
        <div class="navbar">
            <ul class="nav">
                <li><a href="#" target=_blank>Home</a></li>
                <li><a href="#" target=_blank>Course Structure</a></li>
                <li><a href="#" target=_blank>Fees Structure</a></li>
                <li><a href="#" target=_blank>About</a></li>
            </ul>
        </div>
        <div class="buttons">
            <button class="btn">Call Us Now</button>
            <button class="btn">Email Us</button>
        </div>
    </header>

    <div class="container">
        <h1>Join the best physics coaching of Kolkata now</h1>
        <form action="controller" method="post">
            <div class="form-inputs">
                <input type="text" name="studentName" placeholder="Enter your name">
                <input type="email" name="studentEmail" placeholder="Enter your email">
                <input type="tel" name="studentPhone" placeholder="Enter your phone number">
                <input type="text" name="studentDOB" placeholder="Enter your date of birth" onfocus="(this.type='date')" onblur="(this.type='text')">
                <input type="text" name="studentSchool" placeholder="Enter your school name">
                <input type="number" name="studentPhyMarks" placeholder="Enter your physics marks in 10th board">
                <input type="number" name="studentTotalMarks" placeholder="Enter your total marks in 10th board">
            </div>
            <input type="submit" value="Submit" id="submit_btn" class="submitReset_btn">
            <input type="reset" value="Reset all" id="reset_btn" class="submitReset_btn">
        </form>
    </div>

</body>

</html>