package rocks.zipcode.Comments;


import jakarta.persistence.*;
import rocks.zipcode.Articles.Articles;
import rocks.zipcode.User.User;

import java.awt.*;
import java.util.Date;

@Entity
@Table(name="comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Comment_Id")
    private Long id;
    @Column(name = "articleId")
    private Articles articleId;
    @Column(name = "text")
    private String text;
    @Column(name = "datePosted")
    private Date datePosted;
    @Column(name = "userId")
    private User userId;





    public Comments() {}

    public void Comments(Long id, Articles articleId, User userId, String text, Date datePosted) {
        this.id = id;
        this.articleId = articleId;
        this.text = text;
        this.datePosted = datePosted;
        this.userId=userId;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Articles getArticleId() {
        return articleId;
    }

    public void setArticleId(Articles articleId) {
        this.articleId = articleId;
    }

    public void setUserId(User userId){this.userId=userId;}

    public User getUserId(){return userId;}

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

