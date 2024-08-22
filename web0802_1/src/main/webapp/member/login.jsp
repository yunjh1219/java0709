<%@page import = "util.Cookies" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
      String id = request.getParameter("id");
    String password = request.getParameter("password");
    
    if(id.equals(password)){
    	response.addCookie(
    			Cookies.createCookie("AUTH", id, "/", -1)
    			);
    }
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>