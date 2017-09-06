<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<form role="form" action="/upload" method="POST" enctype="multipart/form-data">
    <div class="form-group">
        <label for="file">上传文件</label>
        <input type="file" id="file" name="file">
    </div>
    <button type="submit" class="btn btn-default">提交</button>
</form>
</body>
</html>
