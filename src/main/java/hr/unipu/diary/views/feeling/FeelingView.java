package hr.unipu.diary.views.feeling;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import hr.unipu.diary.backend.service.MoodEntryService;

@Route("feeling")
@Tag("feeling-view")
@JsModule("./src/views/feeling/feeling-view.js")
public class FeelingView extends PolymerTemplate<FeelingView.FeelingViewModel> {

    @Id("vaadinVerticalLayout")
    private Element vaadinVerticalLayout;
    @Id("reallyNice")
    private Button reallyNice;
    @Id("nice")
    private Button nice;
    @Id("ok")
    private Button ok;
    @Id("sad")
    private Button sad;
    @Id("reallySad")
    private Button reallySad;

    public FeelingView() {
        reallyNice.addClickListener(e -> {
            VaadinSession.getCurrent().setAttribute("mood", 5);
        });
        nice.addClickListener(e -> {
            VaadinSession.getCurrent().setAttribute("mood", 4);
        });
        ok.addClickListener(e -> {
            VaadinSession.getCurrent().setAttribute("mood", 3);
        });
        sad.addClickListener(e -> {
            VaadinSession.getCurrent().setAttribute("mood", 2);
        });
        reallySad.addClickListener(e -> {
            VaadinSession.getCurrent().setAttribute("mood", 1);
        });
    }

    public interface FeelingViewModel extends TemplateModel {
    }
}
