package starter.ui.login;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    //New User Signup!
    public static Target H2_REGISTER_NEW_USER = Target.the("Title Register User Form").located(By.xpath("//h2[text()='New User Signup!']"));
    public static Target INPUT_NAME_RU= Target.the("Input Name for Register User Form").located(By.xpath("//input[@data-qa='signup-name']"));
    public static Target INPUT_EMAIL_RU= Target.the("Input Email for Register User Form").located(By.xpath("//input[@data-qa='signup-email']"));
    public static Target BUTTON_SIGNUP= Target.the("Button for Signup User").located(By.xpath("//button[@data-qa='signup-button']"));

    //Login to you account

    public static Target H2_LOGIN_ACCOUNT = Target.the("Title Register User Form").located(By.xpath("//h2[text()='Login to your account']"));
    public static Target INPUT_EMAIL_LA= Target.the("Input Email for Login").located(By.xpath("//input[@data-qa='login-email']"));
    public static Target INPUT_PASSWORD_LA= Target.the("Input Password for Login").located(By.xpath("//input[@data-qa='login-password']"));
    public static Target BUTTON_LOGIN= Target.the("Button for login").located(By.xpath("//button[@data-qa='login-button'] "));


}
