package hr.unipu.diary.views.login;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import hr.unipu.diary.backend.service.AuthService;

/**
 * A Designer generated component for the login-view template.
 * <p>
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("login-view")
@Route("login")
@JsModule("./src/views/login/login-view.js")
public class LoginView extends PolymerTemplate<LoginView.LoginViewModel> {

    @Id("vaadinVerticalLayout")
    private Element vaadinVerticalLayout;
    @Id("vaadinLoginForm")
    private LoginForm vaadinLoginForm;

    /**
     * Creates a new LoginView.
     */
    public LoginView(AuthService authService) {
        vaadinLoginForm.setForgotPasswordButtonVisible(false);
        vaadinLoginForm.addLoginListener(e -> {
            try {
                authService.authenticate(e.getUsername(), e.getPassword());
                UI.getCurrent().navigate("home");
            } catch (AuthService.AuthException authException) {
                Notification.show("Wrong credentials.");
            }
        });
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between LoginView and login-view
     */
    public interface LoginViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
