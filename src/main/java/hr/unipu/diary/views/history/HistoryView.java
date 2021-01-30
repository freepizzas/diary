package hr.unipu.diary.views.history;

import java.lang.reflect.Array;
import java.util.*;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import hr.unipu.diary.backend.entity.TextEntry;
import hr.unipu.diary.backend.repository.TextEntryRepository;
import hr.unipu.diary.views.history.HistoryView.HistoryViewModel;
import hr.unipu.diary.views.main.MainView;

@Route(value = "history", layout = MainView.class)
@PageTitle("History")
@JsModule("./src/views/history/history-view.js")
@Tag("history-view")
public class HistoryView extends PolymerTemplate<HistoryViewModel> {

    public static interface HistoryViewModel extends TemplateModel {
        public void setItems(List<TextEntry> items);
    }

    public HistoryView(TextEntryRepository textEntryRepository) {
        List<TextEntry> text = textEntryRepository.findAll();
        Collections.reverse(text);
        List<TextEntry> entries = text;
        getModel().setItems(entries);
    }
}
