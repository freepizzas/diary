package hr.unipu.diary.views.landing;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the landing-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("landing-view")
@JsModule("./src/views/landing/landing-view.js")
public class LandingView extends PolymerTemplate<LandingView.LandingViewModel> {

    /**
     * Creates a new LandingView.
     */
    public LandingView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between LandingView and landing-view
     */
    public interface LandingViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
