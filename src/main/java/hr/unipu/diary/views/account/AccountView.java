package hr.unipu.diary.views.account;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import hr.unipu.diary.views.main.MainView;

@Route(value = "account", layout = MainView.class)
@PageTitle("Account")
@JsModule("./src/views/account/account-view.js")
@Tag("account-view")
public class AccountView extends PolymerTemplate<TemplateModel> {

    public AccountView() {
    }
}
