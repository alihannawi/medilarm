<html>

<head>

    <link rel="stylesheet" href="../../pub/css/medilarm.css" />

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Orbitron&family=Oswald:wght@700&display=swap" rel="stylesheet">

    <style>

        .container input {

            font-size: 35px;
            font-family: 'Oswald', sans-serif;
            background-color: whitesmoke;
            color: #000130;
            border-radius: 10px;

            display: block;
            margin: auto;
            width: 500px;

        }

        .email , .password , label {

            background-color: #808080;
        }

        label {

            margin-left: 50px;
            font-size: 25px;
            font-family: 'Oswald', sans-serif;
            color: #7bff00;
        }


        .container form {

            background-color: #808080;
        }

        .container button {

            font-size: 50px;
            font-family: 'Oswald', sans-serif;
            background-color: #000130;
            color: #7bff00;
            border-radius: 10px;

            display: block;
            margin: 20px auto;
            padding-top: 5px;
            width: 500px;
            height: 100px;
            text-decoration: none;
        }

        .container button:hover , .container a:hover {

            background-color: #000275;
            color: #bfff70;
        }

    </style>
</head>

<body>
<button class="back-button">
    <a href="/index">Back</a>
</button>

<div id="subheading" class="heading">
    <h1>LOGIN</h1>
</div>

<form action="/loginSubmit">
    <div class="container">
        <form action="index">
            <div class="email">
                <label>Email</label>
                <input type="email" name="email"
                <%--                   pattern="[a-z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,4}$"--%>
                       required/>
            </div>
            <br />
            <div class="password">
                <label>Password</label>
                <input type="password" name="password"
                <%--                   pattern="^(?=.[a-z])(?=.[A-Z])(?=.[0-9])(?=.[!@#$%^&*_=+-]).{8,12}$"--%>
                       required/>
                <!-- 8-12 characters , at least 1 capital, 1 lowercase letter, 1 number, 1 symbol -->
            </div>

            <button type="submit">Submit</button>
        </form>
    </div>
</form>

</body>
</html>