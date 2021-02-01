package hr.unipu.diary.views.stats;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import hr.unipu.diary.views.main.MainView;

/**
 * A Designer generated component for the stats-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("stats-view")
@Route(value = "statistics", layout = MainView.class)
@PageTitle("Mood Stats")
@JsModule("./src/views/stats/stats-view.js")
public class StatsView extends PolymerTemplate<StatsView.StatsViewModel> {

    /**
     * Creates a new StatsView.
     */
    public StatsView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between StatsView and stats-view
     */
    public interface StatsViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
