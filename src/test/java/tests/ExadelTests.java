package tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExadelTests extends BaseTest{

    @Test
    @Description("Test #1")
    @DisplayName("'Digital solutions for your business — delivered.' text is displayed on Home page")
    public void checkBannerTextOnHomePage(){
        Selenide.open("/");
    }
}
