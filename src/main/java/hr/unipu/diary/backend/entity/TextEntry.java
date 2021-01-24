package hr.unipu.diary.backend.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class TextEntry extends AbstractEntity {

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    @NotNull
    private LocalDate date;

    @NotNull
    private LocalTime time;

    @NotNull
    private String rtext;

    private String question;

    public TextEntry() {

    }

    public TextEntry(User createdBy, LocalTime time, LocalDate date, String rtext, String question) {
        setUser(createdBy);
        setTime(time);
        setDate(date);
        setRtext(rtext);
        setQuestion(question);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getRtext() {
        return rtext;
    }

    public void setRtext(String rtext) {
        this.rtext = rtext;
    }
}
