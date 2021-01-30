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
import hr.unipu.diary.backend.entity.TextEntry;
import hr.unipu.diary.backend.entity.User;
import hr.unipu.diary.backend.repository.TextEntryRepository;
import hr.unipu.diary.backend.service.TextEntryService;
import hr.unipu.diary.views.main.MainView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

@Route(value = "editor", layout = MainView.class)
@PageTitle("Editor")
@JsModule("./src/views/texteditor/texteditor-view.js")
@Tag("texteditor-view")
public class TexteditorView extends PolymerTemplate<TexteditorView.TexteditorViewModel> {

    @Id("vaadinVerticalLayout")
    private Element vaadinVerticalLayout;
    @Id("save")
    private Button save;
    @Id("richtext")
    private RichTextEditor richtext;

    public TexteditorView(TextEntryService textEntryService) {

        vaadinVerticalLayout.getStyle().set("background-image", "url('images/editor.png')");
        var hasQuestion = VaadinSession.getCurrent().getAttribute("hasQuestion");
        var user = VaadinSession.getCurrent().getAttribute(User.class);

                save.addClickListener(e -> {
                            String time = LocalTime.now().truncatedTo(ChronoUnit.SECONDS).format(DateTimeFormatter.ISO_LOCAL_TIME);
                            LocalDate date = LocalDate.now();
                            String longFormat = date.format(DateTimeFormatter.ofPattern("d. MMMM yyyy"));
                            var rt = richtext.getHtmlValue();
                            //var user = VaadinSession.getCurrent().getAttribute(User.class);
//                            var question = VaadinSession.getCurrent().getAttribute("hasQuestion");
                            TextEntry entry = new TextEntry(user.getUsername(), time, longFormat, rt);
                            textEntryService.save(entry);
                        }

                );
    }

    public interface TexteditorViewModel extends TemplateModel {

    }
}
