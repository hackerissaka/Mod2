<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<th>Emp Id</th>
<th>EmpName</th>
<th>Emp Salary</th>
<c:forEach items="${emplist}" var="e">
<tr>
<td><c:out value="${e.eid }"/></td>
<td><c:out value="${e.ename }"/></td>
<td><c:out value="${e.sal }"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>