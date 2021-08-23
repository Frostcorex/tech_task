package test.java.test.ui.page.base;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

public class BasePage {
    public void clearField(SelenideElement fieldClear) {
        fieldClear.sendKeys(Keys.CONTROL + "A");
        fieldClear.sendKeys(Keys.BACK_SPACE);
    }
}
