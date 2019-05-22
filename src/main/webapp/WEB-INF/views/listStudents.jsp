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
				<td><a href="editStudent?id=${m.id}">修改</a></td>
				<td><a href="deleteStudent?id=${m.id}">删除</a></td>
	        </tr>
	    </c:forEach>
	</table>

<%--	 ${pageContext.request.contextPath}用于解决使用相对路径时出现的问题，它的作用是取出所部署项目的名字。--%>
<%--	 用action="${pageContext.request.contextPath}/addStudent" 或者直接"addStudent"--%>
	 <form method="post" id="addForm" action="addStudent" role="form">
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
<%--	 <form action="${pageContext.request.contextPath}/listStudents" method="post">--%>
<%--		 <table align='center' border='0' cellspacing='0'>--%>
<%--			 <tr>--%>
<%--				 <th>页码：</th>--%>
<%--				 <td><input type="text" name="page" value="${page}"/></td>--%>
<%--			 </tr>--%>
<%--			 <tr>--%>
<%--				 <th>页面大小：</th>--%>
<%--				 <td><input type="text" name="rows" value="${rows}"/></td>--%>
<%--			 </tr>--%>
<%--			 <tr>--%>
<%--				 <td colspan="2" align="center">--%>
<%--					 <button type="submit" class="btn btn-success">转到</button>--%>
<%--				 </td>--%>
<%--			 </tr>--%>
<%--		 </table>--%>
<%--	 </form>--%>
<%--	<div style="text-align:center">--%>
<%--		<a href="?start=0">首  页</a>--%>
<%--		<a href="?start=${page.start-page.count}">上一页</a>--%>
<%--		<a href="?start=${page.start+page.count}">下一页</a>--%>
<%--		<a href="?start=${page.last}">末  页</a>--%>
<%--	</div>--%>

	 <div style="text-align:center">
		 <table align='center' border='0' cellspacing='0'>
			 <tr>
				 <td>
					 <a href="${pageContext.request.contextPath}/listStudents?page=${pageInfo.getFirstPage()}&rows=${pageInfo.pageSize}">首页</a>
				 </td>
				 <c:if test="${pageInfo.hasPreviousPage}">
					 <td>
						 <a href="${pageContext.request.contextPath}/listStudents?page=${pageInfo.prePage}&rows=${pageInfo.pageSize}">前一页</a>
					 </td>
				 </c:if>
				 <c:forEach items="${pageInfo.navigatepageNums}" var="nav">
					 <c:if test="${nav == pageInfo.pageNum}">
						 <td style="font-weight: bold;">${nav}</td>
					 </c:if>
					 <c:if test="${nav != pageInfo.pageNum}">
						 <td>
							 <a href="${pageContext.request.contextPath}/listStudents?page=${nav}&rows=${pageInfo.pageSize}">${nav}</a>
						 </td>
					 </c:if>
				 </c:forEach>
				 <c:if test="${pageInfo.hasNextPage}">
					 <td>
						 <a href="${pageContext.request.contextPath}/listStudents?page=${pageInfo.nextPage}&rows=${pageInfo.pageSize}">下一页</a>
					 </td>
				 </c:if>
				 <td>
					 <a href="${pageContext.request.contextPath}/listStudents?page=${pageInfo.getLastPage()}&rows=${pageInfo.pageSize}">末页</a>
				 </td>
			 </tr>
		 </table>
	 </div>
 </div>
