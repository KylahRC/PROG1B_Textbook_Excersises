package Ex14;

import java.time.LocalDate;

public class Invention {
    private String description;
    private Inventor inventor;
    private LocalDate date;

    public Invention(String description, Inventor inventor, LocalDate date) {
        this.description = description;
        this.inventor = inventor;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Invention{" +
                "description='" + description + '\'' +
                ", inventor=" + inventor +
                ", date=" + date +
                '}';
    }
}

