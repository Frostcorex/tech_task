package test.java.test.ui.page.sberLizingPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import test.java.test.ui.page.base.BasePage;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class sberLeasingPage extends BasePage {
    public void closeWindow() {
        $x("(//div[@class='position-relative']/div)[1]").shouldBe(Condition.visible).click();
    }

    public void clickParameters() {
        $x("//a[contains(text(),'Подобрать по параметрам')]").click();
    }

    public void enterValue(String text, String setValue) {
        $x("//span[contains(text(),'" + text + "')]").click();
        $x("//label[contains(text(),'" + setValue + "')]").click();
    }

    public void enterCarPrice(String from, String to) {
        SelenideElement fromValue = $x("//div[@class='range-slider-values__left']/input");
        SelenideElement toValue = $x("//div[@class='range-slider-values__right']/input");
        clearField(fromValue);
        fromValue.sendKeys(from);
        clearField(toValue);
        toValue.sendKeys(to);
    }

    public ElementsCollection enterEngineAndCapacity = $$x("//div[@class='range-slider-values']//div");

    public void enterEnginePower(String powerFrom, String powerTo) {
        SelenideElement q = enterEngineAndCapacity.get(0);
        SelenideElement w = enterEngineAndCapacity.get(1);

        actions().moveToElement(q, 500, 0);
        actions().moveToElement(w, 0, -200);
    }

    public void enterVolumeCapacity(String powerFrom, String powerTo) {
        enterEngineAndCapacity.get(2).sendKeys(powerFrom);
        enterEngineAndCapacity.get(3).sendKeys(powerTo);
    }

    public void enterBodyType(String carType) {
        $x("//label[@title='" + carType + "']").click();
    }

    public void clickButtonShowAllOffers() {
        $(withText("Показать все предложения")).click();
    }

    public void enterTransmission(String transmissionName) {
        $x("//label[contains(text(),'" + transmissionName + "')]").click();
    }

    public void enterTypeFuel(String typeFuel) {
        $x("//label[contains(text(),'" + typeFuel + "')]").click();

    }

    public void enterColor(int colorIndex) {
        ElementsCollection s = $$x("(//div[@class='horizontal-filter-checkbox-block'])[4]//div//label");
        $x("(//input[@class='horizontal-filter-block__search-string'])[4]").click();
        s.get(colorIndex).shouldBe(Condition.visible);
    }

    public void setDiscount() {
        $x("//label[contains(text(),'Только авто со скидкой')]").click();
    }
}
