<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page pageEncoding="UTF-8" session="false"%>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link href="<c:url value="/css/bootstrap.min.css" />" rel="stylesheet">
<title>Hello, world!</title>
</head>
<body class="container">
  <div class="jumbotron">
    <h1>Hello, world!</h1>
    <p>The time on the server is ${serverTime}.</p>
    <p>This is db id ${db.id}</p>
  </div>
</body>
</html>
