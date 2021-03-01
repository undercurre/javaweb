<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>试卷</title>
</head>
<body>
    <form action="testServlet" method="post">
        <table>
            <tr>
                <td>上次考试成绩：</td>
                <td>${score}</td>
            </tr>
            <tr>
                <td>考生姓名：</td>
                <td>${username}</td>
                <td><input type="hidden" value="${username}" name="username" readonly></td>
            </tr>
            <tr>
                <td>1+1=</td>
                <td><input type="text" name="test1" size="15">[20分]</td>
            </tr>
            <tr>
                <td>2+2=</td>
                <td><input type="text" name="test2" size="15">[20分]</td>
            </tr>
            <tr>
                <td>3+3=</td>
                <td><input type="text" name="test3" size="15">[20分]</td>
            </tr>
            <tr>
                <td>4+4=</td>
                <td><input type="text" name="test4" size="15">[20分]</td>
            </tr>
            <tr>
                <td>5+5=</td>
                <td><input type="text" name="test5" size="15">[20分]</td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</body>
</html>