package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.ui.login.LoginPage;

public class VerifyPage {

    public static Question<String> title(){
        return Question.about("verify page title").
                answeredBy(
                        actor -> BrowseTheWeb.as(actor).getDriver().getTitle());
    }

    public static Question<Boolean> isRegisterFormvisible(){
        return Question.about("verify register form is visible").
                answeredBy(
                        actor -> LoginPage.H2_REGISTER_NEW_USER.resolveFor(actor).isVisible()
                );

    }
}
