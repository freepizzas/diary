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
    @Id("vaadinButton")
    private Button vaadinButton;
    @Id("vaadinButton1")
    private Button vaadinButton1;
    @Id("vaadinButton2")
    private Button vaadinButton2;
    @Id("vaadinButton3")
    private Button vaadinButton3;
    @Id("vaadinButton4")
    private Button vaadinButton4;


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
