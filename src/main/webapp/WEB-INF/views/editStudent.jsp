<%--
  Created by IntelliJ IDEA.
  User: Pumpkinor
  Date: 2019/5/3
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" id="editForm" action="$updateStudent" role="form">
    <table align='center' border='1' cellspacing='0'>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="name" id="name" value="${stu.name}"></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input type="text" name="age" id="age" value="${stu.age}"></td>
        </tr>
        <tr>
            <td>性别：</td>
            <td><input type="radio" <c:if test="${stu.gender == '男'}">checked</c:if> class="radio radio-inline" name="gender" value="男"> 男
                <input type="radio" <c:if test="${stu.gender == '女'}">checked</c:if> class="radio radio-inline" name="gender" value="女"> 女
            </td>
        </tr>
        <tr class="submitTR">
            <td colspan="2" align="center">
                <input type="hidden" name="id" value="${stu.id}">
                <button type="submit" class="btn btn-success">提 交</button>
            </td>

        </tr>

    </table>
</form>
</body>
</html>
