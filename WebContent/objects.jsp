<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>objects</title>
</head>
<body>
<%
String userName=request.getParameter("name");

if(userName!=null){
	session.setAttribute("sessionuserName", userName);
	//application.setAttribute("applicationuserName", userName);
	pageContext.setAttribute("pageContextUserName", userName);
	pageContext.setAttribute("applicationUserName", userName, pageContext.APPLICATION_SCOPE);
}
%>
<br>
The username in request parameter is: <%=userName %>
<br>
User name in session object is: <%=session.getAttribute("sessionuserName") %>
<br>
User name in application object is: <%=application.getAttribute("applicationuserName") %>
<br>
User name in page context object is: <%=pageContext.getAttribute("pageContextUserName") %>

</body>
</html>