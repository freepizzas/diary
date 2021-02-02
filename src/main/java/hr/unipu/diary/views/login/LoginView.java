package hr.unipu.diary.views.login;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import hr.unipu.diary.backend.service.AuthService;

@Tag("login-view")
@Route("login")
@JsModule("./src/views/login/login-view.js")
public class LoginView extends PolymerTemplate<LoginView.LoginViewModel> {

    @Id("vaadinVerticalLayout")
    private Element vaadinVerticalLayout;
    @Id("vaadinLoginForm")
    private LoginForm vaadinLoginForm;

    public LoginView(AuthService authService) {
        vaadinVerticalLayout.getStyle().set("background-image", "url('images/blues.png')");
        vaadinLoginForm.setForgotPasswordButtonVisible(false);
        vaadinLoginForm.addLoginListener(e -> {
            try {
                authService.authenticate(e.getUsername(), e.getPassword());
                VaadinSession.getCurrent().setAttribute("access", true);
                UI.getCurrent().navigate("home");
            } catch (AuthService.AuthException authException) {
                Notification.show("Wrong credentials.");
            }
        });
    }

    /**
     * This model binds properties between LoginView and login-view
     */
    public interface LoginViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
