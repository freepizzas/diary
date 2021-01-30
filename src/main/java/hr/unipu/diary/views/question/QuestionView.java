package hr.unipu.diary.views.question;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the question-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("question-view")
@JsModule("./src/views/question/question-view.js")
public class QuestionView extends PolymerTemplate<QuestionView.QuestionViewModel> {

    /**
     * Creates a new QuestionView.
     */
    public QuestionView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between QuestionView and question-view
     */
    public interface QuestionViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
