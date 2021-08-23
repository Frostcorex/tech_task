package test.java.test.ui.page.googlePage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import com.codeborne.selenide.ElementsCollection;

public class googlePage {
    private SelenideElement searchField = $x("//input[@title='Поиск']");

    public void enterSearchField(String text) {
        searchField.sendKeys(text);
        searchField.pressEnter();
    }

    public void selectSite(String text) {
         $x("//h3[contains(text(),'"+text+"')]").click();
    }
    public void testZ(String text) {
        $x("//h3[contains(text(),'"+text+"')]").click();
    }
}
