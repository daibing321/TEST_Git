<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
<table>
 <tr>
  <td>ID</td> 
  <td>姓名</td> 
  <td>生日</td> 
  <td>组</td> 
  <td>操作</td> 
 </tr>
 
 
 <c:forEach items="${studentlist}" var="var">
   <tr>
   <td>${var.id}</td> 
   <td>${var.name}</td> 
   <td>${var.date}</td> 
   <td>${var.group.name}</td> 
   <td><a href="/SPRING_MVC_IBATIS/student/studentdelete/${var.id}">删除</a> </td> 
   </tr>
 </c:forEach>
</table>
</body>
</html>