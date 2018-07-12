package cn.liyz.NewsRecommend.entity;

import java.util.Date;

/**
 * Created by liyan on 2018/7/11.
 */
public class News {
    private int id;
    private String title;
    private String author;
    private String content;
    private String img;
    private int readingAmount;
    private Date createtime;
    private Date lastmodify;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getReadingAmount() {
        return readingAmount;
    }

    public void setReadingAmount(int readingAmount) {
        this.readingAmount = readingAmount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(Date lastmodify) {
        this.lastmodify = lastmodify;
    }
}
