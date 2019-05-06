<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
 <div style="width:500px;margin:0px auto;text-align:center">
	<table align='center' border='1' cellspacing='0'>
		<caption>学生信息列表</caption>
	    <tr>
			<th>id</th>
			<th>name</th>
			<th>gender</th>
			<th>age</th>
		</tr>
	    <c:forEach items="${stu}" var="m">
	        <tr>
	            <td>${m.id}</td>
	            <td>${m.name}</td>
	            <td>${m.gender}</td>
	            <td>${m.age}</td>
				<td><a href="${pageContext.request.contextPath}/editStudent?id=${m.id}">修改</a></td>
				<td><a href="${pageContext.request.contextPath}/deleteStudent?id=${m.id}">删除</a></td>
	        </tr>
	    </c:forEach>
	</table>

	 <form method="post" id="addForm" action="${pageContext.request.contextPath}/addStudent" role="form">
		 <table align='center' border='1' cellspacing='0'>
			 <caption>添加新的学生信息</caption>
			 <tr>
				 <td>姓名：</td>
				 <td><input type="text" name="name" id="name" placeholder="请在这里输入名字"></td>
			 </tr>
			 <tr>
				 <td>年龄：</td>
				 <td><input type="text" name="age" id="age" placeholder="请在这里输入年龄"></td>
			 </tr>
			 <tr>
				 <td>性别：</td>
				 <td><input type="radio" checked class="radio radio-inline" name="gender" value="男"> 男
					 <input type="radio" class="radio radio-inline" name="gender" value="女"> 女
				 </td>
			 </tr>
			 <tr class="submitTR">
				 <td colspan="2" align="center">
					 <button type="submit" class="btn btn-success">提 交</button>
				 </td>

			 </tr>

		 </table>
	 </form>

	<div style="text-align:center">
		<a href="?start=0">首  页</a>
		<a href="?start=${page.start-page.count}">上一页</a>
		<a href="?start=${page.start+page.count}">下一页</a>
		<a href="?start=${page.last}">末  页</a>
	</div>
 </div>
