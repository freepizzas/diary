package hr.unipu.diary.backend.service;

import hr.unipu.diary.backend.entity.TextEntry;
import hr.unipu.diary.backend.repository.TextEntryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class TextEntryService {
    private static final Logger LOGGER = Logger.getLogger(TextEntryService.class.getName());
    private TextEntryRepository textEntryRepository;

    public TextEntryService(TextEntryRepository textEntryRepository) {
        this.textEntryRepository = textEntryRepository;
    }

    public List<TextEntry> findAll() {
        return textEntryRepository.findAll();
    }

    public long count() {
        return textEntryRepository.count();
    }

    public void delete(TextEntry textEntry) {
        textEntryRepository.delete(textEntry);
    }

    public void save(TextEntry textEntry) {
        if (textEntry == null) {
            LOGGER.log(Level.SEVERE,
                    "Text entry is null. Are you sure you have connected your form to the application?");
            return;
        }
        textEntryRepository.save(textEntry);
    }
}
