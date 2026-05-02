package fsadendsemexam;

import javax.persistence.*;

@Entity
@Table(name = "library")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private String date;
    private String status;

    public Library() {}

    public Library(String name, String description, String date, String status) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.status = status;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getDate() { return date; }
    public String getStatus() { return status; }

    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setDate(String date) { this.date = date; }
    public void setStatus(String status) { this.status = status; }
}
