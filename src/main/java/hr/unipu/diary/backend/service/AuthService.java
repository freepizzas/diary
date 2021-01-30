package hr.unipu.diary.backend.service;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.page.History;
import com.vaadin.flow.router.RouteConfiguration;
import com.vaadin.flow.server.VaadinSession;
import hr.unipu.diary.backend.entity.Role;
import hr.unipu.diary.backend.entity.User;
import hr.unipu.diary.backend.repository.UserRepository;
import hr.unipu.diary.views.account.AccountView;
import hr.unipu.diary.views.feeling.FeelingView;
import hr.unipu.diary.views.history.HistoryView;
import hr.unipu.diary.views.home.HomeView;
import hr.unipu.diary.views.login.LoginView;
import hr.unipu.diary.views.main.MainView;
import org.springframework.stereotype.Service;

import javax.security.auth.message.AuthException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void authenticate(String username, String password) throws AuthException {
        User user = userRepository.getByUsername(username);
        if (user != null && user.checkPassword(password)) {
            VaadinSession.getCurrent().setAttribute(User.class, user);
            setAccess(user.getRole());
        } else {
            throw new AuthException();
        }
    }

    private void setAccess(Role role) {
        if (role.equals(Role.USER) || role.equals(Role.ADMIN)) {
            VaadinSession.getCurrent().setAttribute("access", true);
        } else VaadinSession.getCurrent().setAttribute("access", false);
    }

    public class AuthException extends Exception {

    }
}
