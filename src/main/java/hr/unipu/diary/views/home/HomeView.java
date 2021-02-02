package hr.unipu.diary.views.home;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.templatemodel.TemplateModel;
import hr.unipu.diary.backend.entity.User;
import hr.unipu.diary.views.main.MainView;
import com.vaadin.flow.router.RouteAlias;

import java.util.List;
import java.util.Locale;

@Route(value = "home", layout = MainView.class)
@PageTitle("Home")
@JsModule("./src/views/home/home-view.js")
@Tag("home-view")
@RouteAlias(value = "home", layout = MainView.class)
public class HomeView extends PolymerTemplate<HomeView.HomeViewModel> {
    @Id("vaadinVerticalLayout")
    private Element vaadinVerticalLayout;
    @Id("letMeWrite")
    private Button letMeWrite;
    @Id("askMeAQ")
    private Button askMeAQ;

    public HomeView() {
        vaadinVerticalLayout.getStyle().set("background-image", "url('images/tea.jpg')");

        letMeWrite.addClickListener(e -> {
            letMeWrite.getUI().ifPresent(ui ->
                    ui.navigate("editor"));
        });

        askMeAQ.addClickListener(e -> {
            VaadinSession.getCurrent().setAttribute("hasQuestion", true);
            askMeAQ.getUI().ifPresent(ui ->
                    ui.navigate("editorq"));
        });

        var user = VaadinSession.getCurrent().getAttribute(User.class);
        getModel().setItems(user.getUsername().toUpperCase(Locale.ROOT));

    }

    public static interface HomeViewModel extends TemplateModel {
        public void setItems(String items);
    }
}
