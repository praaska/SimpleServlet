<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Testing JSPs</h3>
<%
int i=1;
int j=2;
int k;
k=i+j;

%>
Value of k:<%=k %>

<%for(i=0;i<5;i++){%>
	<br><%=i %>
	
<%}%>

</body>
</html>