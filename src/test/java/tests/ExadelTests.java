package tests;

import annotations.JiraIssue;
import annotations.JiraIssues;
import annotations.Layer;
import annotations.Microservice;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Layer("UI Tests")
@Owner("andreik")
@DisplayName("UI tests for https://exadel.com/")
public class ExadelTests extends BaseTest {

    @Test
    @Microservice("Main")
    @JiraIssue("HOMEWORK-267")
    @Tags({@Tag("web"), @Tag("critical")})
    @Description("TestCase #1")
    @DisplayName("Search icon is visible on Home page")
    public void checkSearchIconIsDisplayed() {
        step("Open Home Page", () -> {
            homePage.openHomePage();
        });

        step("Check Search icon is displayed", () -> {
            homePage.checkSearchIconIsDisplayed();
        });
    }

    @Test
    @Microservice("Main")
    @JiraIssue("HOMEWORK-267")
    @Tags({@Tag("web"), @Tag("smoke")})
    @Description("TestCase #2")
    @DisplayName("User can open Contact us page from Home page and see Contact form")
    public void userCanOpenContactUsPageAndSeeContactForm() {
        step("Click Contact us button on Home page", () -> {
            homePage
                    .openHomePage()
                    .clickContactUsButton();
        });

        step("Contact form is displayed on Contact us Page", () -> {
            contactUsPage.checkContactFormIsDisplayed();
        });
    }

    @Test
    @Microservice("Main")
    @JiraIssue("HOMEWORK-267")
    @Tags({@Tag("web"), @Tag("smoke")})
    @Description("TestCase #3")
    @DisplayName("User can open Careers page from Home page and see Send your CV form")
    public void userCanOpenCareersPageAndSeeCVForm() {
        step("Click Careers menu item on Home page", () -> {
            homePage
                    .openHomePage()
                    .clickItemInHeaderMenu("Careers");
        });

        step("Send your CV form is displayed on Careers Page", () -> {
            careersPage.checkSendYourCvFormIsDisplayed();
        });
    }

    @Test
    @Microservice("Jobs")
    @JiraIssue("HOMEWORK-267")
    @Tags({@Tag("web"), @Tag("critical")})
    @Description("TestCase #4")
    @DisplayName("User can open search specialty in selected location")
    public void userCanSearchSpecialtyInSelectedLocation() {
        step("Open Careers page", () -> {
            careersPage.openCareersPage();
        });

        step("Select specialty", () -> {
            careersPage.selectSpecialty("Automation QA");
        });

        step("Select location", () -> {
            careersPage.selectLocation("Poland");
        });

        step("Click Search", () -> {
            careersPage.clickSearchCareersButton();
        });

        step("Check QA positions are available in selected location", () -> {
            careersPage.checkListOfJobsContainsPositionName("QA");
        });
    }

    @Test
    @Microservice("Jobs")
    @JiraIssue("HOMEWORK-267")
    @Tags({@Tag("web"), @Tag("critical")})
    @Description("TestCase #5 - Will fail on last step because of incorrect locator")
    @DisplayName("User can submit CV")
    public void userCanSendCv() {
        step("Open Careers page", () -> {
            careersPage.openCareersPage();
        });

        step("Fill the CV form", () -> {
            careersPage
                    .fillFirstName("FirstName")
                    .fillLastName("LastName")
                    .fillEmail("testemail@gmail.com")
                    .fillPhoneNumber("123123123")
                    .selectCountry("Belarus")
                    .selectCity("Grodno")
                    .clickPrivacyPolicyCheckbox()
                    .clickEvaluatingApplicationCheckbox();
        });

        step("Submit CV form", () -> {
            careersPage.submitCvForm();
        });
    }
}
