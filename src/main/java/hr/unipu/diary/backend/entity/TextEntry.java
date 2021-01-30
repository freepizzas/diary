package hr.unipu.diary.backend.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class TextEntry extends AbstractEntity {

    @NotNull
    private String user;

    @NotNull
    private String date;

    @NotNull
    private String time;

    @NotNull
    private String rtext;

    private String question;

    public TextEntry() {

    }

    public TextEntry(String createdBy, String time, String date, String rtext, String question) {
        setUser(createdBy);
        setTime(time);
        setDate(date);
        setRtext(rtext);
        setQuestion(question);
    }

    public TextEntry(String createdBy, String time, String date, String rtext) {
        setUser(createdBy);
        setTime(time);
        setDate(date);
        setRtext(rtext);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
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
