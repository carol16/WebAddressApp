<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AverageArea.do">
Enter persons name: <input type="text" name="searchText"><br/><br/>
<input type="submit" value="search">

<h2>Average area :</h2>
	<b>${AverageAreaOfFlats}</b> 
</body>
</html>