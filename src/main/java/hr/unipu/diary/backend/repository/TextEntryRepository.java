package hr.unipu.diary.backend.repository;

import hr.unipu.diary.backend.entity.TextEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextEntryRepository extends JpaRepository<TextEntry, Long> {
}