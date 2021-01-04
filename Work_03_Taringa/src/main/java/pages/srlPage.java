package pages;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class srlPage {

    @FindBy(xpath="//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/span/a/div/img")
    WebElement srlEment;

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath="")
    WebElement replaceThis;

    public srlPage(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

    public void enterElement()
    {
        srlEment.click();

    }





}