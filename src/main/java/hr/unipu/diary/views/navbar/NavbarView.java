package hr.unipu.diary.views.navbar;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the navbar-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("navbar-view")
@JsModule("./src/views/navbar/navbar-view.js")
public class NavbarView extends PolymerTemplate<NavbarView.NavbarViewModel> {

    /**
     * Creates a new NavbarView.
     */
    public NavbarView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between NavbarView and navbar-view
     */
    public interface NavbarViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
