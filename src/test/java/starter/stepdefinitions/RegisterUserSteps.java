package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.models.RegisterBasicUserInfoModel;
import starter.questions.VerifyPage;
import starter.taks.Login;
import starter.taks.NavigateTo;
import starter.utils.GetInfoFromTable;

import javax.xml.crypto.Data;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class RegisterUserSteps {

    @Given("{actor} launch the browser and visit the web application")
    public void launchBrowser(Actor actor){
        actor.attemptsTo(
                NavigateTo.webApplication()
        );
    }
    @Then("{actor} verifies that home page is visible succesfully")
    public void verifyHomePage(Actor actor){
        actor.should(
                seeThat(VerifyPage.title(), equalTo("Automation Exercise"))
        );

    }
    @When("{actor} clicks on Login button")
    public void clickOnSignupLoginButton(Actor actor){
        actor.attemptsTo(
                NavigateTo.theLoginPage()
        );
    }
    @Then("{actor} verifies that Login page is visible")
    public void verifySignupLoginPage(Actor actor){

        actor.should(seeThat(VerifyPage.isRegisterFormvisible(), equalTo(true)));

    }
    @Then("{actor} enter name email address and do click on Signup button")
    public void enterNameEmailforSignup(Actor actor, DataTable userInfo){

        RegisterBasicUserInfoModel userBasicInfoModel = GetInfoFromTable.getBasicUserInfoData(userInfo);

        actor.attemptsTo(
                Login.registerUser(userBasicInfoModel)
        );

    }

}
