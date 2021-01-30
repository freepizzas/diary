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
import hr.unipu.diary.views.navbar.NavbarView;

@Route(value = "home", layout = MainView.class)
@PageTitle("Home")
@JsModule("./src/views/home/home-view.js")
@Tag("home-view")
@RouteAlias(value = "home", layout = MainView.class)
public class HomeView extends PolymerTemplate<TemplateModel> {

    @Id("vaadinVerticalLayout")
    private Element vaadinVerticalLayout;
    @Id("vaadinHorizontalLayout")
    private Element vaadinHorizontalLayout;
    @Id("navbarView")
    private NavbarView navbarView;
    @Id("vaadinVerticalLayout1")
    private Element vaadinVerticalLayout1;
    @Id("vaadinHorizontalLayout1")
    private Element vaadinHorizontalLayout1;
    @Id("vaadinVerticalLayout2")
    private Element vaadinVerticalLayout2;
    @Id("vaadinHorizontalLayout2")
    private Element vaadinHorizontalLayout2;
    @Id("div")
    private Div div;
    @Id("h1")
    private H1 h1;
    @Id("h11")
    private H1 h11;
    @Id("vaadinHorizontalLayout3")
    private Element vaadinHorizontalLayout3;
    @Id("vaadinButton")
    private Button vaadinButton;
    @Id("vaadinHorizontalLayout4")
    private Element vaadinHorizontalLayout4;
    @Id("vaadinButton1")
    private Button vaadinButton1;
    @Id("vaadinHorizontalLayout5")
    private Element vaadinHorizontalLayout5;
    @Id("vaadinButton2")
    private Button vaadinButton2;
    @Id("vaadinHorizontalLayout6")
    private Element vaadinHorizontalLayout6;
    @Id("vaadinHorizontalLayout7")
    private Element vaadinHorizontalLayout7;

    public HomeView() {
        vaadinVerticalLayout.getStyle().set("background-image", "url('images/temporay.png')");
//        Image background = new Image("./frontend/src/images/temporary.png", "Background");
    }
}
