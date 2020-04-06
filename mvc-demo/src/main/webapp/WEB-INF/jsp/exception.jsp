<%--标识是否使用EL表达式，默认是忽略的--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>异常信息</title>
</head>
<body>
<h1>异常信息</h1>
<p>状态码:${status}</p>
<p>错误信息:${msg}</p>
<p>堆栈信息:${data}</p>
</body>
</html>