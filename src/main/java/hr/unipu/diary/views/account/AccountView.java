package hr.unipu.diary.views.account;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
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
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.ui.Alignment;
import hr.unipu.diary.views.main.MainView;

import java.io.ByteArrayInputStream;

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
        //Html img = new Html("<img src='images/profile_pic.png'");
        Image profile = new Image("images/profile_pic.png","");
        profileImage.add(profile);
//        profileImage.getStyle().set("background-image", "url('images/profile_pic.png')");
        vaadinVerticalLayout.getStyle().set("background-image", "url('images/red.jpg')");
    }
}
