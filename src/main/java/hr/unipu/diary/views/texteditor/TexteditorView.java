package hr.unipu.diary.views.texteditor;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.richtexteditor.RichTextEditor;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import hr.unipu.diary.backend.entity.MoodEntry;
import hr.unipu.diary.backend.entity.TextEntry;
import hr.unipu.diary.backend.entity.User;
import hr.unipu.diary.backend.service.MoodEntryService;
import hr.unipu.diary.backend.service.TextEntryService;
import hr.unipu.diary.views.feeling.FeelingView;
import hr.unipu.diary.views.main.MainView;
import org.jsoup.Jsoup;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

@Route(value = "editor", layout = MainView.class)
@PageTitle("Let me write")
@JsModule("./src/views/texteditor/texteditor-view.js")
@Tag("texteditor-view")
public class TexteditorView extends PolymerTemplate<TexteditorView.TexteditorViewModel> {

    @Id("vaadinVerticalLayout")
    private Element vaadinVerticalLayout;
    @Id("save")
    private Button save;
    @Id("richtext")
    private RichTextEditor richtext;
    @Id("feelingView")
    private FeelingView feelingView;

    public TexteditorView(TextEntryService textEntryService, MoodEntryService moodEntryService) {
        vaadinVerticalLayout.getStyle().set("background-image", "url('images/editor.png')");
        var user = VaadinSession.getCurrent().getAttribute(User.class);
        save.addClickListener(e -> {
                    String time = LocalTime.now().truncatedTo(ChronoUnit.SECONDS).format(DateTimeFormatter.ISO_LOCAL_TIME);
                    LocalDate date = LocalDate.now();
                    String longFormat = date.format(DateTimeFormatter.ofPattern("d. MMMM yyyy"));
                    var mood = VaadinSession.getCurrent().getAttribute("mood");
                    if (mood != null) {
                        MoodEntry moodEntry = new MoodEntry(user.getUsername(), ((Integer) mood).intValue(), time, longFormat);
                        moodEntryService.save(moodEntry);
                    }
                    var rt = richtext.getHtmlValue();
                    if (rt != null) {
                        var rtString = Jsoup.parse(rt).text();
                        TextEntry entry = new TextEntry(user.getUsername(), time, longFormat, rtString);
                        textEntryService.save(entry);
                    }
                    if(rt != null || mood != null) {
                        save.getUI().ifPresent(ui ->
                                ui.navigate("home"));
                    }
                }
        );
    }

    public interface TexteditorViewModel extends TemplateModel {

    }
}
