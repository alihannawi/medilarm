<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="include/header.jsp" />

<html>

<head>
    <meta charset="utf-8">

    <link rel="stylesheet" href="../../pub/css/medilarm.css" />

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Orbitron&family=Oswald:wght@700&display=swap" rel="stylesheet">

    <style>
        label , #set-time {

            font-size: 30px;
            background-color: #808080;
            color: #000130;
            font-family: 'Oswald', sans-serif;
        }

        input {

            font-size: 30px;
        }

        .container button , form button a {

            font-size: 30px;
            font-family: 'Oswald', sans-serif;
            background-color: #000130;
            color: #7bff00;
            border-radius: 10px;

            display: block;
            width: 500px;
            height: 50px;
            text-decoration: none;
        }
    </style>

</head>
<body>

<button class="back-button">
    <a href="/addAlarm">Back</a>
</button>

<div id="subheading" class="heading">
    <h1>ADD ALARM</h1>
</div>

    <div class="container">
        <label>${medBrandName}</label>
        <br>

        <div id="set-time">

            <p>${medTimeframe}</p>

            <label>What time(s) would you like to take this medicine?</label>
            <br>
            <input type="time" name="" id="time-input"/>
            <br>
            <button type="button">
                <a href="/addTimeSuccess">Add Alarm</a>
            </button>

            <!-- onclick="addAlarm();" -->
        </div>
    </div>

<br />
</body>
</html>

<jsp:include page="include/footer.jsp" />