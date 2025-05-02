package rocks.zipcode.Author;

public class Author {
    private Long id;
    private String firstName;
    private String lastName;
    private String biography;
    private String articlesWritten;

    public Author(Long id, String firstName, String lastName, String biography, String articlesWritten) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.biography = biography;
        this.articlesWritten = articlesWritten;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getArticlesWritten() {
        return articlesWritten;
    }

    public void setArticlesWritten(String articlesWritten) {
        this.articlesWritten = articlesWritten;
    }
}
