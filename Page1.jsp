<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="background-color:blue">
hi from page1
<br/>
going to page2
</div>
<div>
<jsp:forward page="page2.jsp">
<jsp:param value="1000" name="bow"/>
</jsp:forward>
</div>
<hr/>
<div style="background-color:green">Again from page1</div>

</body>
</html>