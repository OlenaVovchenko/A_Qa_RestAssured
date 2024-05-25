package pytonJson;

import java.time.LocalDateTime;
import java.util.Objects;

public class Attributes {
    private String title;
    private String description;
    private LocalDateTime created;
    private LocalDateTime updated;

    public Attributes() {
    }

    public Attributes(String title, String description, LocalDateTime created, LocalDateTime updated) {
        this.title = title;
        this.description = description;
        this.created = created;
        this.updated = updated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attributes that = (Attributes) o;
        return Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(created, that.created) && Objects.equals(updated, that.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, created, updated);
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
