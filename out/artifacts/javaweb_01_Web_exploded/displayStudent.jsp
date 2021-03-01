<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/2 0002
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="student" class="main.java.domain.Student" scope="session"/>
<html>
<head>
    <title>显示学生信息</title>
</head>
<body>
<h4>显示学生信息</h4>
<table border="1">
    <tr>
        <td>学号：</td>
        <td><jsp:getProperty name="student" property="num"/></td>
    </tr>
    <tr>
        <td>姓名：</td>
        <td><jsp:getProperty name="student" property="name"/></td>
    </tr>
    <tr>
        <td>考试成绩：</td>
        <td><jsp:getProperty name="student" property="score"/></td>
    </tr>
</table>
</body>
</html>
