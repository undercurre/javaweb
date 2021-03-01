<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/2 0002
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输入学生信息</title>
</head>
<body>
<h4>输入学生信息</h4>
<form action="StudentServlet" method="post">
    <table>
        <tr><td>学号：</td><td><input type="text" name="num"></td></tr>
        <tr><td>姓名：</td><td><input type="text" name="name"></td></tr>
        <tr><td>考试成绩：</td><td><input type="text" name="score"></td></tr>
        <tr><td><input type="submit" value="提交"></td></tr>
    </table>
</form>
</body>
</html>
