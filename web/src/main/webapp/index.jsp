<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" language="java" import="java.util.*" %>
<%
    String path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
    String basePath = path + request.getContextPath() + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
    <title>阎良问答</title>
    <base href="<%=basePath%>">
    <meta http-equiv="content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="阎良问答 飞机城 专业问答 阎良 西安阎良" >
    <link rel="stylesheet" type="text/css" href="css/base.css">
    <script src="http://code.jquery.com/jquery-1.10.1.min.js" type="text/javascript"></script>
    <script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
    <script src="js/base.js" type="text/javascript"></script>
</head>
<body>
    <div id="#mainWrapper">
        <div id="notice">
             阎良问答
            <div id="sub">阎良人的专业问答社区</div>
        </div>
    </div>
</body>
</html>
