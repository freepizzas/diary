package hr.unipu.diary.backend.repository;

import hr.unipu.diary.backend.entity.MoodEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoodEntryRepository extends JpaRepository<MoodEntry, Long> {
}