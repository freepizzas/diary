package hr.unipu.diary.views.landing;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
@Tag("landing-view")
@Route("")
@JsModule("./src/views/landing/landing-view.js")
public class LandingView extends PolymerTemplate<LandingView.LandingViewModel> {

    @Id("joinNow")
    private Button joinNow;
    @Id("vaadinVerticalLayout")
    private Element vaadinVerticalLayout;

    public LandingView() {
        vaadinVerticalLayout.getStyle().set("background-image", "url('images/landing.png')");
        joinNow.addClickListener(e -> {
            joinNow.getUI().ifPresent(ui ->
                    ui.navigate("login"));
        });
    }

    public interface LandingViewModel extends TemplateModel {
    }
}
