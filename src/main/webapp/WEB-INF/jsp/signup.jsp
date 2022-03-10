<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
    <meta charset="utf-8">

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

        .firstName , .lastName , .email , .username , .password , label {

            background-color: #808080;
        }

        label {

            margin-left: 50px;
            font-size: 25px;
            font-family: 'Oswald', sans-serif;
            color: #7bff00;
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

        .container #loginlink p , .container #loginlink a {

            font-size: 20px;
            text-align: center;
            color: #7bff00;
            background-color: #808080;
            font-family: 'Orbitron', sans-serif;
            display: block;
            text-decoration: none;
        }
    </style>

    <script src="../../pub/js/script.js" type="text/javascript">


    </script>
</head>
    <body>
        <form method="GET" action="/register/registerSubmit"  onsubmit="return validation();">
            <input type="hidden" name="id" value="${formBeanKey.id}">

            <button class="back-button">
                <a href="index">Back</a>
            </button>

            <div id="subheading" class="heading">
                <h1>SIGN UP</h1>
            </div>

            <div class="container">

                <div class="firstName">
                    <label>First Name</label>
                    <input type="text" name="firstName" value="${formBeanKey.firstName}">
                </div>

                <br>

                <div class="lastName">
                    <label>Last Name</label>
                    <input type="text" name="lastName" value="${formBeanKey.lastName}">
                </div>

                <br>

                <div class="email">
                    <label>Email</label>
                    <input type="text" name="email" value="${formBeanKey.email}">
                </div>

                <br>

                <div class="username">
                    <label>Username</label>
                    <input type="text" name="username" value="${formBeanKey.username}">
                </div>

                <br>

                <div class="password" >
                    <label>Password</label>
                    <input type="password" name="password" onclick="this.value = '';"
                           value="${formBeanKey.password}">
                </div>

                <button type="submit">Submit</button>

                <br>

                <div id="loginlink">
                    <p>
                        <a href="login">Already have an account? Log in</a>
                    </p>
                </div>
                <br>
            </div>
        </form>
    </body>
</html>

<%--<jsp:include page="../include/footer.jsp"/>--%>