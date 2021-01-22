package hr.unipu.diary.backend.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class MoodEntry extends AbstractEntity {

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    @NotNull
    private int rating;

    @NotNull
    private LocalDate date;

    @NotNull
    private LocalTime time;

    public MoodEntry(User createdBy, @NotNull User user, int rating, LocalTime time, LocalDate date) {
        setUser(createdBy);
        setRating(rating);
        setTime(time);
        setDate(date);
    }

    public MoodEntry() {
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
