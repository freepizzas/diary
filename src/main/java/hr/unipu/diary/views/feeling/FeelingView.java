package hr.unipu.diary.views.feeling;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.Route;
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
@Route("feeling")
@Tag("feeling-view")
@JsModule("./src/views/feeling/feeling-view.js")
public class FeelingView extends PolymerTemplate<FeelingView.FeelingViewModel> {

    @Id("vaadinVerticalLayout")
    private Element vaadinVerticalLayout;
    @Id("vaadinHorizontalLayout")
    private Element vaadinHorizontalLayout;
    @Id("vaadinHorizontalLayout1")
    private Element vaadinHorizontalLayout1;
    @Id("vaadinHorizontalLayout2")
    private Element vaadinHorizontalLayout2;
    @Id("vaadinVerticalLayout1")
    private Element vaadinVerticalLayout1;
    @Id("vaadinButton")
    private Button vaadinButton;
    @Id("vaadinVerticalLayout2")
    private Element vaadinVerticalLayout2;
    @Id("vaadinVerticalLayout3")
    private Element vaadinVerticalLayout3;
    @Id("vaadinVerticalLayout4")
    private Element vaadinVerticalLayout4;
    @Id("vaadinVerticalLayout5")
    private Element vaadinVerticalLayout5;
    @Id("vaadinHorizontalLayout3")
    private Element vaadinHorizontalLayout3;

    /**
     * Creates a new FeelingView.
     */
    public FeelingView() {
        Button vaadinButton = new Button(String.valueOf(MaterialIcons.SENTIMENT_SATISFIED));
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between FeelingView and feeling-view
     */
    public interface FeelingViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
