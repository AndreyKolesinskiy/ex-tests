package pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CareersPage {

    public CareersPage openCareersPage(){
        open("/careers");
        return this;
    }

    public CareersPage checkSendYourCvFormIsDisplayed(){
        $(byText("Send your CV")).shouldBe(visible);
        return this;
    }

    public CareersPage selectSpecialty(String specialty){
        $("#specialty_select").click();
        $("#any_specialty_label").click();
        $x(String.format("//label[text()='%s']", specialty)).click();
        return this;
    }

    public CareersPage selectLocation(String location){
        $("#locations_select").click();
        $("#careers_locations_list").$(byText("All locations")).click();
        $("#careers_locations_list").$(byText(location)).click();
        return this;
    }

    public CareersPage clickSearchCareersButton(){
        $(".careers-srch-form__submit").click();
        return this;
    }

    public CareersPage checkListOfJobsContainsPositionName(String positionName){
        $(".job_listings").shouldHave(text(positionName));
        return this;
    }

    public CareersPage fillFirstName(String firstName){
        $("[name=first-name]").scrollTo().val(firstName);
        return this;
    }

    public CareersPage fillLastName(String lastName){
        $("[name=last-name]").val(lastName);
        return this;
    }

    public CareersPage fillEmail(String email){
        $("[name=email]").val(email);
        return this;
    }

    public CareersPage fillPhoneNumber(String phone){
        $("[name=phone]").val(phone);
        return this;
    }

    public CareersPage selectCountry(String country){
        $("[name=job-country]").selectOption(country);
        return this;
    }

    public CareersPage selectCity(String city){
        $("[name*='job-city']").selectOption(city);
        return this;
    }

    public CareersPage clickPrivacyPolicyCheckbox(){
        $("[name='accept-pers-data[]']").parent().click();
        return this;
    }

    public CareersPage clickEvaluatingApplicationCheckbox(){
        $("[name='accept-pers-exadel[]']").parent().click();
        return this;
    }

    public CareersPage submitCvForm(){
        $("incorrect locator").click();
        return this;
    }
}
