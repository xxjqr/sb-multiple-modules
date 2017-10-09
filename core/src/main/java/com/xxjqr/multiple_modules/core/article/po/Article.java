package com.xxjqr.multiple_modules.core.article.po;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by xxjqr on 2017/8/26.
 */
@Table(name = "t_article")
public class Article implements Serializable {

    private static final long serialVersionUID = -8990314211269535243L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String summary;
    private String text;
    @Column(name = "thumb_num")
    private Integer thumbNum;

    @Column(name = "read_num")
    private Integer readNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getThumbNum() {
        return thumbNum;
    }

    public void setThumbNum(Integer thumbNum) {
        this.thumbNum = thumbNum;
    }

    public Integer getReadNum() {
        return readNum;
    }

    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", text='" + text + '\'' +
                ", thumbNum=" + thumbNum +
                ", readNum=" + readNum +
                '}';
    }
}
