package rocks.zipcode.Comments;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.awt.*;
import java.util.Date;

//@Entity
//@Table(name="comments")
public class Comments {

    private Long id;
    private String articleId;
    private String text;
    private Date datePosted;




    public Comments() {}

    public void Comments(Long id, String articleId, String userId, String text, Date datePosted) {
        this.id = id;
        this.articleId = articleId;
        this.text = text;
        this.datePosted = datePosted;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

//    public Users getUserId() {
//        return users;
//    }



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }

}

