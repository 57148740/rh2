package csdn.dao;

import csdn.entity.Csdn;
import oracle.sql.BLOB;
import oracle.sql.CLOB;

import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.*;
import java.util.List;

/**
 * Created by admin on 2017/9/16.
 */
public class JDBCUtil {
   public Connection getConn() throws Exception {
       Class.forName("oracle.jdbc.driver.OracleDriver");
       return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl",
               "vip", "vip");
   }

   public void createBlog(String author,String title,String content,String image){
       try {
           Connection conn = getConn();
           String sql = "insert into csdn(id,author,title,content,image) values(seq_user.nextval,?,?,?,?)";

           //为content创建clob类型
           Clob clob = conn.createClob();
           clob.setString(1,content);

           //为image创建blob类型
           Blob blob = conn.createBlob();
           File file = new File(image);
           Path path = file.toPath();
           blob.setBytes(1,Files.readAllBytes(path));

           //执行预编译语句，并初始化值
           try (PreparedStatement ps = conn.prepareStatement(sql)){
               ps.setString(1,author);
               ps.setString(2,title);
               ps.setClob(3,clob);
               ps.setBlob(4,blob);
               ps.execute();

           } catch (Exception e) {
               e.printStackTrace();
           }
            conn.close();

       } catch (Exception e) {
           e.printStackTrace();
       }


   }

    public static void main(String[] args) {

       //new JDBCUtil().createBlog("chenu","fdagdsa","fdsalgjdslafjs","e:\\bg2.jpg");
    }

}

