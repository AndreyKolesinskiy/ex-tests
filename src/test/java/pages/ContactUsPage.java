package pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class ContactUsPage {

    public ContactUsPage checkContactFormIsDisplayed(){
        $("#fscf_form1").shouldBe(visible);
        return this;
    }
}
