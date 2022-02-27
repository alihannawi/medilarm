<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

    <body>

        <form action="/index">

            <button id="back-button">
                <a href="index">Back</a>
            </button>

            <div id="heading">
                <h1>SIGN UP</h1>
            </div>

            <div id="container">

                <div class="name">
                    <label>First Name</label>
                    <input type="text"
<%--                           pattern="/^[a-z ,.'-]+$/i" --%>
                           required>
                </div>

                <br>

                <div class="name">
                    <label>Last Name</label>
                    <input type="text"
<%--                           pattern="/^[a-z ,.'-]+$/i" --%>
                           required />
                </div>

                <br>

                <div id="gender">
                    <label>Gender</label>
                    <br/>
                    <input type="radio" name="gender_r" id="male" /> Male
                    <input type="radio" name="gender_r" id="female" /> Female
                    <input type="radio" name="gender_r" id="other" /> Other
                </div>

                <div id="email">
                    <label>Email</label>
                    <input type="email"
<%--                            pattern="[a-z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,4}$"--%>
                            required/>
                </div>

                <br>

                <div id="phone-num">
                    <label>Phone Number</label>
                    <input type="tel"
                            id="phone"
<%--                            pattern="^((){0,1}\d{3}[)-.]{1,2}\d{3}[-.]\d{4}$"--%>
                            required/>
                </div>

                <br>

                <div id="password">
                    <label>Password</label>
                    <input type="password"
<%--                            pattern="^(?=.\d)(?=.[a-z])(?=.[A-Z])(?=.[a-zA-Z]).{8,}$"--%>
                            required/>
                    <!-- minimum 8 characters, must include one uppercase and one lowercase letter, as well as one number -->
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