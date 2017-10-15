<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    body{
        margin: 0px;
        padding: 0px;
    }
    h3{
        text-align: center;
    }

</style>
<script src="js/jquery-3.1.1.min.js"></script>
<script>
    $(function () {
        $("input[name=sub]").click(function () {
           /* $.post("/insert",$("form").serialize(),function () {
                alert("ok");
            });*/
           var author = $("#inp_name").val();
           var title = $("#inp_title").val();
           var content = $("#inp_content").val();
           var image = $("#inp_image").val();
           $.post("insert",{"author":author,"title":title,"content":content,"image":image});
        })
    })
</script>
<body>
<h3>博客信息系统</h3>

<form action="" method="post" enctype="multipart/form-data">
名字：<input type="text" name="author" id="inp_name"/><br/>
文章标题：<input type="text" name="title" id="inp_title"/><br/>
文章内容：<input type="text" name="content" id="inp_content"/><br/>
图片：<input type="file" name="image" id="inp_image"/><br/>
提交：<input type="button" name="sub" value="提交">
</form>
<table>
    <tr>
        <th>编号</th>
        <th>名字</th>
        <th>文章标题</th>
        <th>文章内容</th>
        <th>图片</th>
        <th>发布时间</th>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
</table>
</body>
</html>
