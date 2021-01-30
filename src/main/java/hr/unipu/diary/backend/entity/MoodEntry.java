package hr.unipu.diary.backend.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class MoodEntry extends AbstractEntity {

    @NotNull
    private String user;

    @NotNull
    private int rating;

    @NotNull
    private String date;

    @NotNull
    private String time;

    public MoodEntry(String createdBy, int rating, String time, String date) {
        setUser(createdBy);
        setRating(rating);
        setTime(time);
        setDate(date);
    }

    public MoodEntry() {
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
