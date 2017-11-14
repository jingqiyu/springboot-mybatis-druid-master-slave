package learn.spring.springboot.domain;

public class News {
    private int id;
    private String title;
    private String slug;
    private String text;

    public int getId() {
        return id;
    }

    public News setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public News setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public News setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getText() {
        return text;
    }

    public News setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public String toString() {
        return "News{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", slug='" + slug + '\'' +
            ", text='" + text + '\'' +
            '}';
    }
}
