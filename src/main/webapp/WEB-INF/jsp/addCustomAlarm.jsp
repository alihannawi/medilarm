<html>

<head>

    <link rel="stylesheet" href="../../pub/css/medilarm.css" />

</head>
<body>

<button id="back-button">
    <a href="./index">Back</a>
</button>

<div id="add-medicine">
    <form action="#">
        <label>What is the name of the medicine you are taking?</label>
        <input type="text" name="name-input" id="name-input" />

        <br/>

        <label>What days do you plan to take this medicine?</label>
        <input type="checkbox" name="Monday" id="Monday" /> Monday
        <input type="checkbox" name="Tuesday" id="Tuesday" /> Tuesday
        <input type="checkbox" name="Wednesday" id="Wednesday" /> Wednesday
        <input type="checkbox" name="Thursday" id="Thursday" /> Thursday
        <input type="checkbox" name="Friday" id="Friday" /> Friday
        <input type="checkbox" name="Saturday" id="Saturday" /> Saturday
        <input type="checkbox" name="Sunday" id="Sunday" /> Sunday

        <br />

        <label>How many times per day would you like to take this medicine?</label>
        <input type="number" name="times-per-day" id="times-per-day" />

        <br />

        <label>What times would you like to take this medicine?</label>
        <input type="time" name="alarm-times" id="time-input" />

        <button type="button">Submit</button>
    </form>
</div>

</body>

</html>