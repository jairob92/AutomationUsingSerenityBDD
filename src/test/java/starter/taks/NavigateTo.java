package starter.taks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import starter.ui.navbar.NavBarPage;

public class NavigateTo {

    public static Performable webApplication(){
        return Task.where("{0} open the web application",
                Open.url("https://automationexercise.com")
        );
    }

    public static Performable theLoginPage(){
        return Task.where("{0} navigates to the login page",
                Click.on(NavBarPage.LINK_LOGIN)
        );
    }

    public static Performable theProductsPage(){
        return Task.where("{0} navigates to the products page",
                Click.on(NavBarPage.LINK_PRODUCTS)
        );
    }

    public static Performable theViewCartPage(){
        return Task.where("{0} navigates to the view cart page",
                Click.on(NavBarPage.LINK_CART)
        );
    }

    public static Performable theViewHomePage(){
        return Task.where("{0} navigates to the home page",
                Click.on(NavBarPage.LINK_HOME)
        );
    }



}
