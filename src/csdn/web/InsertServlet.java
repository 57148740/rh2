package csdn.web;

import csdn.dao.JDBCUtil;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by admin on 2017/9/18.
 */
@WebServlet("/insert")
public class InsertServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //获取名字
        String author = request.getParameter("author");
        //获取文章标题
        String title = request.getParameter("title");

        //获取文章内容
        String content = request.getParameter("content");
        //获取图片内容
        String image = request.getParameter("image");

        System.out.println("进来了。。。"+author+title+content+image);
        //获取页面数据后插入到数据库
        new JDBCUtil().createBlog(author,title,content,image);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
