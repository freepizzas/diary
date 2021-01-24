package hr.unipu.diary.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.*;

@Entity
public class User extends AbstractEntity {
    @NotEmpty
    @Email
    @Size(max = 255)
    @Column(unique = true)
    private String email;

    @NotNull
    @Size(min = 8, max = 16)
    private String password;

    @NotBlank
    @Size(max = 255)
    private String name;

    public User() {
        // An empty constructor is needed for all beans
    }

    @PrePersist
    @PreUpdate
    private void prepareData() {
        this.email = email == null ? null : email.toLowerCase();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
