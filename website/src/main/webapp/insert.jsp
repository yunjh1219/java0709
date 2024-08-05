<%@page import="account.AccountDTO"%>
<%@page import="account.AccountDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("name");
String ssn = request.getParameter("ssn");
String tel = request.getParameter("tel");
AccountDAO dao = new AccountDAO();
AccountDTO dto = new AccountDTO(0, name, ssn, tel, 0);
dao.insertAccount(dto);
response.sendRedirect("index.jsp");
%>    


