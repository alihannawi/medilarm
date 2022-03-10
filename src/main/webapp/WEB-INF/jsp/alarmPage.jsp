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

        #add-alarm-button , #add-alarm-button a {

            font-size: 50px;
            font-family: 'Oswald', sans-serif;
            background-color: #808080;
            color: #7bff00;
            border-radius: 10px;

            display: block;
            margin: auto;
            width: 500px;
            height: 100px;
            text-decoration: none;
        }

        #add-alarm-button:hover , #add-alarm-button a:hover {

            background-color: #8f8f8f;
            color: #bfff70;
        }

        .alarm , table{

            font-family: 'Oswald', sans-serif;
            border-radius: 10px;
        }

        .alarm #delete-button {

            text-decoration: none;
        }

    </style>

</head>

<body>
<button class="back-button">
    <a href="/userIndex">Back</a>
</button>

<div id="subheading" class="heading">
    <h1>ALARMS</h1>
</div>

<br>

<div>

    <button id="add-alarm-button">
        <a href="/addAlarm">Add Alarm</a>
    </button>
</div>

<br>

<div class="container">

    <div class="alarm">
        <table>
            <tr>
                <th>Brand Name</th>
                <th>Name</th>
                <th>Dosage</th>
                <th>Daily Dose</th>
                <th>When to take?</th>
                <th>Time</th>
            </tr>
            <c:forEach var="med" items="${medicines}" >
                <tr>
                    <td>${med.brandName}</td>
                    <td>${med.medicineName}</td>
                    <td>${med.dosage}</td>
                    <td>${med.dailyDose}</td>
                    <td>${med.timeframe}</td>
                    <td>${med.timestamp}</td>
                    <td>
                        <button id="delete-button">
                            <a href="/deleteAlarm/ + ${med.id}">Delete</a>
                        </button>
                    </td>
                </tr>
            </c:forEach>

        </table>

    </div>

</div>

</body>

</html>

<jsp:include page="include/footer.jsp" />