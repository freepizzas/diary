package hr.unipu.diary.views.texteditor;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the texteditor-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("texteditor-view")
@JsModule("./src/views/texteditor/texteditor-view.js")
public class TexteditorView extends PolymerTemplate<TexteditorView.TexteditorViewModel> {

    /**
     * Creates a new TexteditorView.
     */
    public TexteditorView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between TexteditorView and texteditor-view
     */
    public interface TexteditorViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
