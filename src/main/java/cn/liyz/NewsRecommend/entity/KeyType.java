package cn.liyz.NewsRecommend.entity;

import java.util.Date;

/**
 * Created by liyan on 2018/7/10.
 */
public class KeyType {
    private int id;
    private String keyType;
    private Date createtime;
    private Date lastmodify;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
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
