package starter.taks;

import groovy.util.logging.Log;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.models.RegisterBasicUserInfoModel;
import starter.ui.login.LoginPage;

public class Login {

    public static Performable registerUser (RegisterBasicUserInfoModel userInfoModel){
        return Task.where(
                "{0} register a new user with name and email",
                Enter.theValue(userInfoModel.getName()).into(LoginPage.INPUT_NAME_RU),
                Enter.theValue(userInfoModel.getEmail()).into(LoginPage.INPUT_EMAIL_RU),
                Click.on(LoginPage.BUTTON_SIGNUP)
        );
    }

    public static Performable loginUser (String email, String password){
        return Task.where(
                Enter.theValue(email).into(LoginPage.INPUT_EMAIL_LA),
                Enter.theValue(password).into(LoginPage.INPUT_PASSWORD_LA),
                Click.on(LoginPage.BUTTON_LOGIN)
        );
    }
}
