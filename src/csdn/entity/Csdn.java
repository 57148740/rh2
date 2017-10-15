package csdn.entity;

import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/9/17.
 */
public class Csdn {
    private int id;
    private String author;
    private String title;
    private Clob content;
    private Blob image;
    private Date create_time;

    public Csdn(int id, String author, String title, Clob content, Blob image, Timestamp time) {

    }

    public Csdn(int id, String author, String title, Clob content, Blob image) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
        this.image = image;
        this.create_time = create_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Clob getContent() {
        return content;
    }

    public void setContent(Clob content) {
        this.content = content;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
