<%--
  Created by IntelliJ IDEA.
  User: rares
  Date: 14/05/2020
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TabiPlus - Cont</title>
</head>
<body>
<h2 style="text-align:center;">Bine ai venit!</h2>
<br>
<p>Username: ${sessionScope['user']}</p>

<br><br><br><br><br><br>

<h3 style="text-align:left;">Alege una dintre optiunile de mai jos:</h3>
<br>
<input type="button" value="Afiseaza tabieturile tale"/>
<br><br>
<input type="button" value="Creeaza un nou tabiet"/>
<br><br>
<input type="button" value="Sterge un tabiet"/>
<br><br>
<input type="button" value="Editeaza un tabiet"/>

<br><br>

<form action="/Logout" method="get">
    <input type="submit" value="Logout"/>
</form>


</body>
</html>