package hr.unipu.diary.views.stats;

import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import hr.unipu.diary.views.main.MainView;

@Tag("stats-view")
@Route(value = "statistics", layout = MainView.class)
@PageTitle("Mood Stats")
@JsModule("./src/views/stats/stats-view.js")
public class StatsView extends PolymerTemplate<StatsView.StatsViewModel> {

    @Id("vaadinVerticalLayout")
    private Element vaadinVerticalLayout;
    @Id("vaadinVerticalLayout1")
    private Element vaadinVerticalLayout1;

    public StatsView() {
        vaadinVerticalLayout.getStyle().set("background-image", "url('images/fox_left.png')");
        vaadinVerticalLayout1.getStyle().set("background-image", "url('images/fox_right.png')");
    }

    public interface StatsViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
