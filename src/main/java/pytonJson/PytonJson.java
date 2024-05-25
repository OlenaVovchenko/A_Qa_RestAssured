package pytonJson;

import java.util.Objects;

public class PytonJson {
    private String type;
    private String id;
    private Attributes attributes;
    private Author author;

    public PytonJson() {
    }

    public PytonJson(String type, String id, Attributes attributes, Author author) {
        this.type = type;
        this.id = id;
        this.attributes = attributes;
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PytonJson pytonJson = (PytonJson) o;
        return Objects.equals(type, pytonJson.type) && Objects.equals(id, pytonJson.id) && Objects.equals(attributes, pytonJson.attributes) && Objects.equals(author, pytonJson.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, attributes, author);
    }

    @Override
    public String toString() {
        return "PytonJson{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", attributes=" + attributes +
                ", author=" + author +
                '}';
    }
}
