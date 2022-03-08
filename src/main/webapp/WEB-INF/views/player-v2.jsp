<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>

<body>

    <h1> Player Info : Name : ${player}</h1>
    <h1> id : ${id} </h1>
</body>


<c:forEach var="item" items ="${list}">

<h2> ${item} </h2>
</c:forEach>

</html>