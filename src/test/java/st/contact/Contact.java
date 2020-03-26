package st.contact;

import com.codeborne.selenide.Condition;
import deserialize.Org;
import logic.UserLogic;
import logic.dto.OrgDto;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.Pages;
import page.st.Contacts;
import page.st.StMainMenu;
import st.TestBase;


public class Contact extends TestBase {

    @BeforeClass
    public void goToContactTab() {
        Pages.get().stMainMenu.getColumnMenu(StMainMenu.CONTACTS).click();
    }

    @Test
    public void testOrgInfo() {

        OrgDto st = new Org().getDate();

        String phone = Contacts.phoneNumberAndFaxSpan.getText();

        Assert.assertTrue(
                phone.contains(st.getPhone()),
                "Whe have not expected phone Actual : " + phone + "Expected " + st.getPhone());
    }


    @Test
    public void testUserMessage() {

        UserLogic st = new UserLogic();

        st.writeMessage(st.createUser());

        st.sendMessage();

        Contacts.errorMessage.shouldBe(Condition.visible);

    }

}
