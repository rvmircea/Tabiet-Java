<%--
  Created by IntelliJ IDEA.
  User: Radu
  Date: 5/14/2020
  Time: 5:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert Data</title>
</head>
<body>

<form action="./InsertData" method="post">
    <p>Nume:</p>
    <!-- Create an element with mandatory name attribute,
    so that data can be transfer to the servlet using getParameter() -->




    <input type="text" name="nume"/>
    <br/>
    <p>prenume:</p>
    <input type="text" name="prenume"/>
    <p>Email:</p>
    <input type="text" name="email"/>

    <p>telefon:</p>
    <input type="text" name="telefon"/>

    <p>cnp:</p>
    <input type="text" name="cnp"/>

    <p>parola:</p>
    <input type="password" name="parola"/>



    <br/><br/><br/>
    <input type="submit"/>
</form>

</body>
</html>
