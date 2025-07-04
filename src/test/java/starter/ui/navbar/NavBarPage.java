package starter.ui.navbar;

import net.serenitybdd.screenplay.targets.Target;

public class NavBarPage {

    public static final Target LINK_LOGOUT= Target.the("Link to logout").locatedBy("//a[@href='/logout']");
    public static final Target LINK_HOME=Target.the("Link to home").locatedBy("(//a[@href='/'])[2]");
    public static final Target LINK_PRODUCTS= Target.the("Link to products").locatedBy("//a[@href='/products']");
    public static final Target LINK_LOGIN= Target.the("Link to login").locatedBy("//a[@href='/login']");
    public static final Target LINK_CART= Target.the("Link to view cart").locatedBy("//a[@href='/view_cart']");

}
