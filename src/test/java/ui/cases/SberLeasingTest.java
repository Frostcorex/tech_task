package ui.cases;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import test.java.test.ui.page.googlePage.googlePage;
import test.java.test.ui.page.sberLizingPage.sberLeasingPage;

import static com.codeborne.selenide.Selenide.$x;
import static org.assertj.core.api.Assertions.assertThat;


public class SberLeasingTest {
    @Test
    void sberLeasing_test() {
        sberLeasingPage sberLeasingPage = new sberLeasingPage();
        googlePage googlePage = new googlePage();

        Selenide.open("https://www.google.com/");
        googlePage.enterSearchField("Сберлизинг");
        googlePage.selectSite("СберЛизинг — официальный сайт");
        Selenide.refresh();
        sberLeasingPage.clickParameters();
        sberLeasingPage.closeWindow();
        sberLeasingPage.enterValue("Город", "Москва");
        sberLeasingPage.enterValue("Марка", "BMW");
        sberLeasingPage.enterValue("Модель", "X4");
        sberLeasingPage.enterCarPrice("3415000", "4200000");
        sberLeasingPage.enterEnginePower("100", "350");
        sberLeasingPage.enterTransmission("задний");
        sberLeasingPage.enterTransmission("автомат");
        sberLeasingPage.enterBodyType("седан");
        sberLeasingPage.enterTypeFuel("дизельное топливо");
        sberLeasingPage.enterColor(1);
        sberLeasingPage.clickButtonShowAllOffers();
        SelenideElement carModel = $x("(//div[@class='font-weight-bold'])[1]");
        assertThat(carModel.getText())
                .as("Название модели не соответствует искомой")
                .isEqualTo("BMW 3 серия");
    }
}
