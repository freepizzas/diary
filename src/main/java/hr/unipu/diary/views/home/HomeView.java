package hr.unipu.diary.views.home;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import hr.unipu.diary.views.main.MainView;
import com.vaadin.flow.router.RouteAlias;
import org.vaadin.alump.materialicons.MaterialIcons;

@Route(value = "home", layout = MainView.class)
@PageTitle("Home")
@JsModule("./src/views/home/home-view.js")
@Tag("home-view")
@RouteAlias(value = "", layout = MainView.class)
public class HomeView extends PolymerTemplate<TemplateModel> {
    @Id("vaadinVerticalLayout")
    private Element vaadinVerticalLayout;

    public HomeView() {
        vaadinVerticalLayout.getStyle().set("background-image", "url('images/temporay.png')");
//        Image background = new Image("./frontend/src/images/temporary.png", "Background");
    }
}
