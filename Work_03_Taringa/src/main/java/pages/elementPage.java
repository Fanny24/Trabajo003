package pages;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elementPage {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath="//*[@id='priceblock_ourprice']")
    WebElement price;

    public elementPage(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

    public void getPrice()
    {
        System.out.println(price.getAttribute("text"));
        System.out.println(price.getText());

    }





}