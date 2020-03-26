package page.st;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class StMainMenu {

    public static final String CONTACTS = "contacts";

    private static final  SelenideElement mainMenuList =  $x("//ul[@class='main_menu_list']");

    public SelenideElement getColumnMenu(String nameCal) {
        return Selenide.$(mainMenuList, "a[href *= '" + nameCal + "']");
    }

}
