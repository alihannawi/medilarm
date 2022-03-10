<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="include/header.jsp" />

<html>

<head>
    <meta charset="utf-8">

    <link rel="stylesheet" href="../../pub/css/medilarm.css" />

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Orbitron&family=Oswald:wght@700&display=swap" rel="stylesheet">

</head>
<body>

<form>

    <div id="container">

        <div id="set-time">

            <p>*display timeframe message*</p>

            <label>What time(s) would you like to take this medicine?</label>
            <br>
            <input type="time" name="" id="time-input"/>
            <br>
            <button type="button" name="edit-button">Edit Alarm</button>
            <button name="cancel-button">Cancel</button>

        </div>

    </div>

</form>

</body>

</html>

<jsp:include page="include/footer.jsp" />