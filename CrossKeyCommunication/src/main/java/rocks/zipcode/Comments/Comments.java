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

    @ManyToOne
    @JoinColumn(name="article_id")
    private Articles article;

    @Column(name = "text")
    private String text;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datePosted")
    private Date datePosted;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;





    public Comments() {}

    public void Comments(Long id, Articles article, User user, String text, Date datePosted) {
        this.id = id;
        this.article = article;
        this.text = text;
        this.datePosted = datePosted;
        this.user=user;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Articles getArticleId() {
        return article;
    }

    public void setArticleId(Articles article) {
        this.article = article;
    }

    public void setUser(User user){this.user=user;}

    public User getUser(){return user;}

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

