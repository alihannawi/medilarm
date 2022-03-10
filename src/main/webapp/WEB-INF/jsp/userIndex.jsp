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

        .container button , a {

            font-size: 50px;
            font-family: 'Oswald', sans-serif;
            background-color: #000130;
            color: #7bff00;
            border-radius: 10px;

            display: block;
            /* margin: 25px; */
            margin: auto;
            width: 500px;
            height: 100px;
            text-decoration: none;
        }

        .container button:hover , a:hover {

            background-color: #000275;
            color: #bfff70;
        }

    </style>

</head>

<body>

<p class="greeting">Signed in as ${username}</p>

<div class="heading">
    <h1>MEDILARM</h1>
</div>

<div class="container">
    <button id="set-alarm-button">
        <a href="/alarmPage">Alarms</a>
    </button>
    <br/>
    <button id="logout-button">
        <a href="/logout">Log Out</a>
    </button>
</div>

</body>
</html>

<jsp:include page="include/footer.jsp" />