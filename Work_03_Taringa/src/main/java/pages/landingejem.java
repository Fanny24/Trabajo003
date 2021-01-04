package pages;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingejem {



    @FindBy(id="loginInput") //method used to find WebElement, in that case Id
    WebElement loginTextbox;

    @FindBy(id="passwordInput")
    WebElement passwordTextBox;

    //xpath example:
    @FindBy(xpath="//*[@id=\"content\"]/div/div[5]/main/div/section/form/button")
    WebElement loginButton;

    public void login(String username, String password){
        // login method prepared according to Page Object Pattern
        loginTextbox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        loginButton.click();
        // because WebElements were declared with @FindBy, we can use them without
        // driver.find() method
    }



    //

    public driver Driver = null; // corrección
    public WebDriver driver = null;

    // página TARINGA - ejemplo CP_01

    @FindBy(xpath="//*[@id=\"content\"]/div/header/nav/div/div[2]/ul[2]/li[3]/button")
    WebElement exampleWeXpath01;
   // agregando..
   @FindBy(name="id")
   WebElement exampleWeName01;
    @FindBy(name="password")
    WebElement exampleWeName02;
    @FindBy(xpath="//*[@id=\"content\"]/div/div[5]/main/div/section/form/button")
    WebElement exampleWeXpath02;

    public landingejem(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

    public void runexample()
    {
        System.out.println(exampleWeXpath01.isDisplayed());
        System.out.println(exampleWeXpath01.getText());
        System.out.println(exampleWeName01.isDisplayed());
        System.out.println(exampleWeName01.getText());
        System.out.println(exampleWeName02.isDisplayed());
        System.out.println(exampleWeName02.getText());
        System.out.println(exampleWeXpath02.isDisplayed());
        System.out.println(exampleWeXpath02.getText());
    }





}