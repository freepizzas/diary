package hr.unipu.diary.backend.service;

import hr.unipu.diary.backend.entity.MoodEntry;
import hr.unipu.diary.backend.repository.MoodEntryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class MoodEntryService {
    private static final Logger LOGGER = Logger.getLogger(MoodEntryService.class.getName());
    private MoodEntryRepository moodEntryRepository;

    public MoodEntryService(MoodEntryRepository moodEntryRepository) {
        this.moodEntryRepository = moodEntryRepository;
    }

    public List<MoodEntry> findAll() {
        return moodEntryRepository.findAll();
    }

    public long count() {
        return moodEntryRepository.count();
    }

    public void delete(MoodEntry moodEntry) {
        moodEntryRepository.delete(moodEntry);
    }

    public void save(MoodEntry moodEntry) {
        if (moodEntry == null) {
            LOGGER.log(Level.SEVERE,
                    "Mood entry is null. Are you sure you have connected your form to the application?");
            return;
        }
        moodEntryRepository.save(moodEntry);
    }
}
