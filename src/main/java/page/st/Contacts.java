package page.st;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class Contacts {
    /**
     * info
     */
    public static final SelenideElement phoneNumberAndFaxSpan = $x("//span[contains(text(), 'Телефон/факс: ')]");
    public static final SelenideElement mailSpan = $x("//a[contains(@href, 'mailto')]");
    public static final SelenideElement locationOfficeSpan = $x("//b[contains(text(), 'Расположение офиса')]//parent::span");
    public static final SelenideElement bankNumberSpan = $x("//b[contains(text(), 'Банковские реквизиты')]//parent::div");

    /**
     * message
     */
    public static final SelenideElement parentForm = $x("//div[@class='content_col contacts_col']");

    public static final String nameInput = "input[name='NAME']";
    public static final String emailInput = "input[name='EMAIL']";
    public static final String phoneInput = "input[name='PHONE']";
    public static final String messageInput = "textarea[name='MESSAGE']";
    public static final String sendButton = "input[type='submit']";

    public static final SelenideElement errorMessage = $x("//span[text() = 'Пройдите проверку']");

}
