package hr.unipu.diary.backend.repository;

import hr.unipu.diary.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmailIgnoreCase(String email);
}