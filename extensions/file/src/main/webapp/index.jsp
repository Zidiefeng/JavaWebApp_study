<html>
<body>
<h2>Hello World!</h2>

<%--通过表单上传文件--%>
<%--get 文件大小有限制--%>
<form action="/upload.do" method="post" enctype="multipart/form-data">
    user: <input type="text" name="username"> <br/>
    <p><input type="file" name="file1"></p>
    <p><input type="file" name="file2"></p>
    <p><input type="submit"> <input type="reset"></p>
</form>

</body>
</html>
