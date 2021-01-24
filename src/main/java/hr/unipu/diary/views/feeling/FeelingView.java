package hr.unipu.diary.views.feeling;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import org.vaadin.alump.materialicons.MaterialIcons;

/**
 * A Designer generated component for the feeling-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("feeling-view")
@JsModule("./src/views/feeling/feeling-view.js")
public class FeelingView extends PolymerTemplate<FeelingView.FeelingViewModel> {

    @Id("vaadinButton")
    private Button vaadinButton;

    /**
     * Creates a new FeelingView.
     */
    public FeelingView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between FeelingView and feeling-view
     */
    public interface FeelingViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
