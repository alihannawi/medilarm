<html>
<body>
<button id="back-button">
    <a href="index">Back</a>
</button>

<div id="add-medicine">
    <form action="#">
        <label>What is the name of the medicine you are taking?</label>
        <br>
        <select name="med_dropdown" id="med_dropdown">
            <option value="Custom Medicine">Custom Medicine</option>
            <option value="Tylenol">Tylenol</option>
            <option value="Motrin">Motrin</option>
            <option value="Alleve">Alleve</option>
        </select>
        <br />
        <button type="submit">Submit</button>

        <br />

        <div id="set-time">

            <p>*display timeframe message*</p>

            <label>What time(s) would you like to take this medicine?</label>
            <br>
            <input type="time" name="" id="time-input"/>
            <br>
            <button type="button"
            >Add Alarm</button>

            <!-- onclick="addAlarm();" -->
        </div>
    </form>
</div>

<br />

<!-- <table id="alarms-table">
  <h1 class="alarm-header">Header</h1>

  <label>Day(s): </label>
  <p></p>

  <label>Time(s): </label>
  <p></p>

  <tr>
    <th>Medicine Name</th>
    <th>Day(s)</th>
    <th>Time(s)</th>
  </tr>
</table> -->
</body>
</html>