package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    public HomePage openHomePage(){
        open("/");
        $("body.home").shouldBe(Condition.visible);
        return this;
    }

    public  HomePage checkSearchIconIsDisplayed(){
        $("#et_search_icon").shouldBe(Condition.visible);
        return this;
    }

    public ContactUsPage clickContactUsButton(){
        $("#contact-h").click();
        return new ContactUsPage();
    }

    public void clickItemInHeaderMenu(String itemName){
        $("[data-title='Header Menu']").$(byText(itemName)).click();
    }
}
