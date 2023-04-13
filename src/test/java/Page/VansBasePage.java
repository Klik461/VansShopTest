package Page;

import BasesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VansBasePage extends BasePage {

    public VansBasePage(WebDriver driver){
        super (driver);
    }

    private static final String BTN_CLASSICS_IN_KIDS_BOX = "//ul[@id='topnav-dropdown-cms--1529541508']//a[contains(text(),'Classics')]";
    private static final String BTN_ALLOW_ALL_SECOND_OPEN = "//button[@id='onetrust-accept-btn-handler']";
    private static final String BTN_JACKET_IN_WOMAN_MENU = "//a[contains(@data-navigation,'Jackets_and_Coats:WOMEN-CLOTHING')]";
    private static final String FIELD_HOODIES_AND_SWEATSHIRTS_IN_MEN = "//a[@data-navigation='MEN-CLOTHING-Sweaters_and_Hoodies:MEN-CLOTHING:men']";
    private static final String FIELD_MINI_ME_IN_KIDS = "//a[@data-navigation='MINI_ME:PAGE-NOT-FOUND:kids']";
    private static final String BTN_BASKET_ON_HEADER = "//a[@aria-describedby='topnav-shopcart-link-instructions']";
    private static final String CLOSE_POP_UP_SALE_TEN_PROC = "//div[@class='close-wrapper']";
    private static final String BTN_LANGUAGE_SELECTOR = "//div[contains(@class,'hide-for-small-only')]//span[@class='topnav-utility-item--flag-image-wrapper']";

    public WebElement categoryBtnOnHeader(String categoryName) {
        return waitUntilVisibilityElementLocated(String.format("(//ul[@role='menubar']/li[contains(@class,'topnav-accordion-item')])[%s]", categoryName));
    }
    public VansBasePage moveCursorOnCategoryBtn(String categoryName) {
        moveCursor(categoryBtnOnHeader(categoryName));
        return this;
    }
    public WebElement btnClassicsInKidsBox() {
        return waitUntilVisibilityElementLocated(BTN_CLASSICS_IN_KIDS_BOX);
    }
    public WebElement btnAllowAllSecondOpen() {
       return waitUntilElementToBeClickable(BTN_ALLOW_ALL_SECOND_OPEN);
    }
    public void skipAdd(){
        if(btnAllowAllSecondOpen().isDisplayed()){
            btnAllowAllSecondOpen().click();
        }
        if(!closePopUpSaleTenProc().isEmpty()){
            closePopUpSaleTenProc().get(0).click();
        }
    }

    public WebElement btnJacketInWomanMenu() {
        return waitUntilElementToBeClickable(BTN_JACKET_IN_WOMAN_MENU);
    }
    public WebElement fieldHoodiesAndSweatshirtsInMen() {
        return waitUntilElementToBeClickable(FIELD_HOODIES_AND_SWEATSHIRTS_IN_MEN);
    }
    public WebElement fieldMiniMeInKids() {
        return waitUntilElementToBeClickable(FIELD_MINI_ME_IN_KIDS);
    }
    public WebElement btnBasketOnHeader() {
        return waitUntilElementToBeClickable(BTN_BASKET_ON_HEADER);
    }
    public List<WebElement> closePopUpSaleTenProc() {
        return waitUntilElementsToBoLocated(CLOSE_POP_UP_SALE_TEN_PROC);
    }
    public WebElement btnLanguageSelector() {
        return  waitUntilElementToBeClickable(BTN_LANGUAGE_SELECTOR);
    }
    public WebElement getNameBtnFavorite(String nameBtn) {
        return waitUntilVisibilityElementLocated(String
                .format("//div[contains(@class,'hide-for-small-only')]//li[@class='topnav-utility-item wishlist']//span[@class='topnav-utility-item-label'][contains(text(),'%s')]",nameBtn));
    }

}
