package hr.unipu.diary.views.landing;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.ui.UI;

/**
 * A Designer generated component for the landing-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("landing-view")
@Route("")
@JsModule("./src/views/landing/landing-view.js")
public class LandingView extends PolymerTemplate<LandingView.LandingViewModel> {

    @Id("joinNow")
    private Button joinNow;

    /**
     * Creates a new LandingView.
     */
    public LandingView() {
        joinNow.addClickListener(e -> {
            joinNow.getUI().ifPresent(ui ->
                    ui.navigate("login"));
        });
    }

    /**
     * This model binds properties between LandingView and landing-view
     */
    public interface LandingViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
