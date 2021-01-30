package hr.unipu.diary.views.texteditorq;

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
import hr.unipu.diary.backend.service.TextEntryService;
import hr.unipu.diary.views.main.MainView;
import org.jsoup.Jsoup;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Tag("texteditorq-view")
@Route(value = "editorq", layout = MainView.class)
@PageTitle("Ask me a question")
@JsModule("./src/views/texteditorq/texteditorq-view.js")
public class TexteditorqView extends PolymerTemplate<TexteditorqView.TexteditorqViewModel> {

    @Id("vaadinVerticalLayout")
    private Element vaadinVerticalLayout;
    @Id("save")
    private Button save;
    @Id("richtext")
    private RichTextEditor richtext;

    public TexteditorqView(TextEntryService textEntryService) {
        vaadinVerticalLayout.getStyle().set("background-image", "url('images/editor.png')");
        var hasQuestion = VaadinSession.getCurrent().getAttribute("hasQuestion");
        var user = VaadinSession.getCurrent().getAttribute(User.class);

        save.addClickListener(e -> {
                    String time = LocalTime.now().truncatedTo(ChronoUnit.SECONDS).format(DateTimeFormatter.ISO_LOCAL_TIME);
                    LocalDate date = LocalDate.now();
                    String longFormat = date.format(DateTimeFormatter.ofPattern("d. MMMM yyyy"));
                    var rt = richtext.getHtmlValue();
                    var rtString = Jsoup.parse(rt).text();
                    //var user = VaadinSession.getCurrent().getAttribute(User.class);
//                            var question = VaadinSession.getCurrent().getAttribute("hasQuestion");
                    TextEntry entry = new TextEntry(user.getUsername(), time, longFormat, rtString);
                    textEntryService.save(entry);
                }

        );
    }

    public interface TexteditorqViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
