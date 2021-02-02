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
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@Tag("texteditorq-view")
@Route(value = "editorq", layout = MainView.class)
@PageTitle("Ask me a question")
@JsModule("./src/views/texteditorq/texteditorq-view.js")
public class TexteditorqView extends PolymerTemplate<TexteditorqView.TexteditorqViewModel> {

    String question;
    @Id("vaadinVerticalLayout")
    private Element vaadinVerticalLayout;
    @Id("save")
    private Button save;
    @Id("richtext")
    private RichTextEditor richtext;

    public TexteditorqView(TextEntryService textEntryService) {
        vaadinVerticalLayout.getStyle().set("background-image", "url('images/editor.png')");
        var hasQuestion = VaadinSession.getCurrent().getAttribute("hasQuestion");
        if (((Boolean) hasQuestion).booleanValue()) {
            question = getQuestions();
            getModel().setItems(question);
        }
        var user = VaadinSession.getCurrent().getAttribute(User.class);

        save.addClickListener(e -> {
                    String time = LocalTime.now().truncatedTo(ChronoUnit.SECONDS).format(DateTimeFormatter.ISO_LOCAL_TIME);
                    LocalDate date = LocalDate.now();
                    String longFormat = date.format(DateTimeFormatter.ofPattern("d. MMMM yyyy"));
                    var rt = richtext.getHtmlValue();
                    if (rt != null) {
                        var rtString = Jsoup.parse(rt).text();
                        TextEntry entry = new TextEntry(user.getUsername(), time, longFormat, rtString, question);
                        textEntryService.save(entry);

                        save.getUI().ifPresent(ui ->
                                ui.navigate("home"));
                    }

                }
        );
    }

    private String getQuestions() {
        Random rand = new Random();
        List<String> questions = new ArrayList<>();
        questions.add("What’s your biggest regret?");
        questions.add("What’s an ideal weekend for you?");
        questions.add("What is one dream you have yet to accomplish?");
        questions.add("What is the greatest struggle you’ve overcome?");
        questions.add("Where would you like to live in the world?");
        questions.add("What would you change in your life?");
        questions.add("Who is your favorite historical figure?");
        questions.add("Dogs or Cats?");
        questions.add("If you could get away with anything that you do?");
        questions.add("What fictional character do you most relate to?");
        return questions.get(rand.nextInt(questions.size()));
    }

    public interface TexteditorqViewModel extends TemplateModel {
        public void setItems(String items);
    }
}
