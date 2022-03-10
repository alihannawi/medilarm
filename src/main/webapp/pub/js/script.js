function validation() {

    const fn = Document.getElementsByClassName("firstName");
    const ln = Document.getElementsByClassName("lastName");
    const ea = Document.getElementsByClassName("email");
    const un = Document.getElementsByClassName("username");
    const pw = Document.getElementsByClassName("password");

    if (fn.value === "")
        alert(fn.name + " Cannot Be Blank");
    if (ln.value === "")
        alert(ln.name + " Cannot Be Blank");
    if (ea.value === "")
        alert(ea.name + " Cannot Be Blank");
    if (un.value === "")
        alert(un.name + " Cannot Be Blank");
    if (pw.value === "")
        alert(pw.name + " Cannot Be Blank");

    if (pw.length > 25)
        pw.value = "Password cannot be more than 25 characters";

    alert("test2");
}