package hr.unipu.diary.views.texteditor;

import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import hr.unipu.diary.views.main.MainView;

@Route(value = "editor", layout = MainView.class)
@PageTitle("Editor")
@JsModule("./src/views/texteditor/texteditor-view.js")
@Tag("texteditor-view")
public class TexteditorView extends PolymerTemplate<TexteditorView.TexteditorViewModel> {

    @Id("vaadinVerticalLayout")
    private Element vaadinVerticalLayout;

    public TexteditorView() {

//        vaadinVerticalLayout.getStyle().set("background-image", "url('images/editor.png')");
    }

    public interface TexteditorViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
