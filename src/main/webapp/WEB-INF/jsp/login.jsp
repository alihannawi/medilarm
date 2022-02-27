<html>
<body>
<button id="back-button">
    <a href="./index.html">Back</a>
</button>

<div id="heading">
    <h1>LOG IN</h1>
</div>

<div id="container">
    <form action="./index.html">
        <div id="email">
            <label>Email</label>
            <input type="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,4}$" required/>
        </div>
        <br />
        <div id="password">
            <label>Password</label>
            <input type="password" pattern="^(?=.[a-z])(?=.[A-Z])(?=.[0-9])(?=.[!@#$%^&*_=+-]).{8,12}$" required/>
            <!-- 8-12 characters , at least 1 capital, 1 lowercase letter, 1 number, 1 symbol -->
        </div>

        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>