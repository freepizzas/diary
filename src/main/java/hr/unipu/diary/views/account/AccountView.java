package hr.unipu.diary.views.account;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.templatemodel.TemplateModel;
import hr.unipu.diary.views.main.MainView;

@Route(value = "account", layout = MainView.class)
@PageTitle("Account")
@JsModule("./src/views/account/account-view.js")
@Tag("account-view")
public class AccountView extends PolymerTemplate<TemplateModel> {
    @Id("vaadinVerticalLayout")
    private Element vaadinVerticalLayout;
    @Id("profile-image")
    private Div profileImage;
    @Id("logOut")
    private Button logOut;
    @Id("stats")
    private Button stats;

    public AccountView() {
        Image profile = new Image("images/profile_pic.png","");
        profileImage.add(profile);
        vaadinVerticalLayout.getStyle().set("background-image", "url('images/red.jpg')");
        logOut.addClickListener(e -> {
            VaadinSession.getCurrent().setAttribute("access", false);
            logOut.getUI().ifPresent(ui ->
                    ui.navigate(""));
        });
        stats.addClickListener(e -> {
            stats.getUI().ifPresent(ui ->
                    ui.navigate("statistics"));
        });

    }
}
